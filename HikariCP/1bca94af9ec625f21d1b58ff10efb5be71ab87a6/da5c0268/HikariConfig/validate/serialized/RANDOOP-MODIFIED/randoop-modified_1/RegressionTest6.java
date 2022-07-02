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
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries;
        hikariDataSource3.setJdbcUrl("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        hikariConfig9.acquireRetryDelay = 0;
        hikariConfig9.idleTimeout = 0L;
        boolean boolean14 = hikariConfig9.isJdbc4ConnectionTest();
        hikariConfig9.setpoolNumber((int) '4');
        hikariDataSource3.addDataSourceProperty("HikariPool-28", (java.lang.Object) '4');
        int int18 = hikariDataSource3.getminPoolSize();
        boolean boolean19 = hikariDataSource3.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig6.transactionIsolationName = "HikariPool-28";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource5.setMaxLifetime(0L);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setConnectionCustomizerClassName("SELECT 1");
        hikariConfig1.setTransactionIsolation("HikariPool-32");
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setTransactionIsolation("HikariPool-19");
        hikariConfig1.setisIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setMinimumPoolSize((int) '#');
        hikariDataSource1.setPoolName("HikariPool-28");
        hikariDataSource1.setConnectionCustomizerClassName("");
        hikariDataSource1.minPoolSize = 35;
        boolean boolean13 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setReadOnly(false);
        hikariDataSource1.isAutoCommit = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig9.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.isIsolateInternalQueries = true;
        hikariDataSource1.setCatalog("HikariPool-2");
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        boolean boolean14 = hikariDataSource2.isReadOnly();
        hikariDataSource2.maxLifetime = 0L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-28" + "'", str6, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-28" + "'", str8, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-28" + "'", str9, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        int int5 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAcquireRetries(60);
        boolean boolean10 = hikariConfig1.getisAutoCommit();
        hikariConfig1.connectionInitSql = "HikariPool-33";
        hikariConfig1.poolName = "HikariPool-19";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter5.deserializeObjectHikariDataSource14();
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
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        int int4 = hikariDataSource3.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str8 = hikariDataSource7.getCatalog();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource5.minPoolSize = 39;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = hikariDataSource4.connectionTestQuery;
        hikariDataSource4.acquireRetryDelay = 1L;
        java.lang.String str8 = hikariDataSource4.getCatalog();
        int int9 = hikariDataSource4.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariConfig17);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        int int7 = hikariDataSource6.maxPoolSize;
        int int8 = hikariDataSource6.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setisIsolateInternalQueries(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter12.deserializeObjectHikariConfig2();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter12.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter12.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter12.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter12.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter12;
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter12.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertNotNull(hikariDataSource22);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        hikariDataSource14.leakDetectionThreshold = 0;
        hikariDataSource14.setRegisterMbeans(false);
        hikariDataSource10.dataSource = hikariDataSource14;
        hikariDataSource10.maxPoolSize = 0;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-6" + "'", str9, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        boolean boolean2 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbcUrl("TRANSACTION_REPEATABLE_READ");
        boolean boolean7 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        java.util.Properties properties6 = hikariConfig2.getDataSourceProperties();
        java.lang.String str7 = hikariConfig2.transactionIsolationName;
        hikariConfig2.setisAutoCommit(false);
        hikariConfig2.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.catalog = "HikariPool-28";
        hikariConfig1.acquireRetryDelay = 22;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str5 = hikariDataSource4.getDataSourceClassName();
        boolean boolean6 = hikariDataSource4.isInitializationFailFast();
        boolean boolean7 = hikariDataSource4.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig7.connectionCustomizerClassName = "HikariPool-17";
        hikariConfig7.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        int int4 = hikariDataSource2.maxPoolSize;
        hikariDataSource2.setisReadOnly(true);
        hikariDataSource2.isAutoCommit = true;
        hikariDataSource2.isReadOnly = false;
        hikariDataSource2.setAcquireRetries(12);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SELECT 1" + "'", str11, "SELECT 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str4 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.idleTimeout = 2;
        hikariDataSource3.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isReadOnly = false;
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.minPoolSize = '#';
        int int9 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
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
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        hikariDataSource2.isRegisterMbeans = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = hikariDataSource2.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNotNull(serializedObjectSupporter16);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        hikariDataSource1.isInitializationFailFast = false;
        hikariDataSource1.setisAutoCommit(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter9.deserializeObjectHikariDataSource17();
        java.util.Properties properties14 = hikariDataSource13.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariDataSource1.dataSourceProperties = properties14;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        int int10 = hikariConfig1.acquireIncrement;
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setMaximumPoolSize(60);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter14.deserializeObjectHikariDataSource8();
        boolean boolean17 = hikariDataSource16.isIsolateInternalQueries;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        java.lang.String str21 = hikariDataSource20.connectionInitSql;
        hikariDataSource20.isRegisterMbeans = false;
        hikariDataSource16.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        hikariDataSource20.maxPoolSize = 100;
        long long27 = hikariDataSource20.getCONNECTION_TIMEOUT();
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        com.zaxxer.hikari.HikariConfig hikariConfig42 = serializedObjectSupporter38.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = serializedObjectSupporter38.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource44 = serializedObjectSupporter38.deserializeObjectHikariDataSource15();
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
        org.junit.Assert.assertNotNull(hikariConfig42);
        org.junit.Assert.assertNotNull(hikariConfig43);
        org.junit.Assert.assertNotNull(hikariDataSource44);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireRetries = 60;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        int int9 = hikariConfig1.acquireIncrement;
        hikariConfig1.setAcquireRetryDelay(500L);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.jdbcUrl;
        hikariConfig3.setisInitializationFailFast(false);
        int int7 = hikariConfig3.getmaxPoolSize();
        int int8 = hikariConfig3.getAcquireIncrement();
        java.lang.String str9 = hikariConfig3.jdbcUrl;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = hikariConfig10.serializedObjectSupporter;
        boolean boolean12 = hikariConfig10.isInitializationFailFast;
        hikariConfig10.setUseInstrumentation(true);
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties15);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisAutoCommit();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMinimumPoolSize((int) '4');
        hikariConfig1.connectionTimeout = 14;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setisAutoCommit(true);
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        hikariDataSource12.setpoolNumber((int) (byte) 10);
        int int19 = hikariDataSource12.getmaxPoolSize();
        java.lang.String str20 = hikariDataSource12.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource8.isIsolateInternalQueries = true;
        hikariDataSource8.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        hikariConfig6.isAutoCommit = false;
        java.lang.String str10 = hikariConfig6.getConnectionInitSql();
        long long11 = hikariConfig6.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setConnectionInitSql("hi!");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.poolName = "HikariPool-28";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setisRegisterMbeans(true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource2.idleTimeout = 19;
        hikariDataSource2.setMaxLifetime((long) (byte) 10);
        hikariDataSource2.setCatalog("HikariPool-7");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource16();
        hikariDataSource15.catalog = "hi!";
        long long18 = hikariDataSource15.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource16();
        hikariDataSource20.catalog = "hi!";
        long long23 = hikariDataSource20.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter24 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter24.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter24.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource27 = hikariDataSource26.dataSource;
        hikariDataSource20.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource26);
        hikariDataSource15.setDataSource((javax.sql.DataSource) hikariDataSource26);
        java.lang.String str30 = hikariDataSource26.getJdbcUrl();
        hikariDataSource26.setpoolNumber((int) (byte) 10);
        int int33 = hikariDataSource26.getmaxPoolSize();
        hikariDataSource26.setminPoolSize(31);
        hikariDataSource2.addDataSourceProperty("HikariPool-7", (java.lang.Object) hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        java.lang.String str5 = hikariDataSource2.getDataSourceClassName();
        hikariDataSource2.dataSourceClassName = "hi!";
        hikariDataSource2.setMaximumPoolSize(14);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter4.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter4.deserializeObjectHikariDataSource6();
        boolean boolean8 = hikariDataSource7.isIsolateInternalQueries();
        long long9 = hikariDataSource7.getLeakDetectionThreshold();
        hikariConfig3.dataSource = hikariDataSource7;
        hikariConfig3.connectionTestQuery = "HikariPool-28";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter8.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource6();
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
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource4.setPoolName("HikariPool-33");
        java.lang.String str7 = hikariDataSource4.getConnectionTestQuery();
        hikariDataSource4.acquireRetries = 100;
        hikariDataSource4.setisAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        hikariConfig1.dataSourceClassName = "HikariPool-19";
        boolean boolean14 = hikariConfig1.getisRegisterMbeans();
        int int15 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        boolean boolean33 = hikariDataSource1.getisAutoCommit();
        java.lang.String str34 = hikariDataSource1.connectionInitSql;
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.settransactionIsolationName("HikariPool-30");
        hikariConfig0.setLeakDetectionThreshold(5000L);
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.isRegisterMbeans = false;
        int int6 = hikariDataSource2.getMinimumPoolSize();
        long long7 = hikariDataSource2.getConnectionTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        hikariConfig9.acquireRetryDelay = 0;
        hikariConfig9.idleTimeout = 0L;
        hikariConfig9.setConnectionTestQuery("");
        java.util.Properties properties16 = hikariConfig9.dataSourceProperties;
        hikariDataSource2.setDataSourceProperties(properties16);
        boolean boolean18 = hikariDataSource2.isIsolateInternalQueries();
        hikariDataSource2.settransactionIsolationName("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int12 = hikariConfig11.getmaxPoolSize();
        int int13 = hikariConfig11.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-6" + "'", str9, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        long long4 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.setmaxPoolSize(0);
        hikariConfig1.dataSourceClassName = "HikariPool-32";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.isJdbc4connectionTest = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        hikariDataSource1.copyState(hikariConfig10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig10.getConnectionCustomizer();
        boolean boolean13 = hikariConfig10.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.String str16 = hikariDataSource14.connectionTestQuery;
        int int17 = hikariDataSource14.getmaxPoolSize();
        hikariDataSource14.setCatalog("HikariPool-0");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "VALUES 1" + "'", str16, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        long long14 = hikariDataSource1.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        long long11 = hikariConfig10.leakDetectionThreshold;
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        long long7 = hikariDataSource6.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        int int5 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str8 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        int int4 = hikariConfig1.acquireIncrement;
        hikariConfig1.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.setMaxLifetime((long) 9);
        long long7 = hikariConfig4.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig6.connectionInitSql = "HikariPool-28";
        hikariConfig6.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setMinimumPoolSize((int) 'a');
        boolean boolean8 = hikariDataSource3.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        java.util.Properties properties6 = hikariConfig2.getDataSourceProperties();
        hikariConfig2.setMaximumPoolSize(5);
        java.lang.String str9 = hikariConfig2.connectionCustomizerClassName;
        hikariConfig2.setReadOnly(true);
        int int12 = hikariConfig2.getminPoolSize();
        java.lang.String str13 = hikariConfig2.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
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
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource3.setisInitializationFailFast(false);
        hikariDataSource3.catalog = "HikariPool-19";
        hikariDataSource3.connectionTimeout = 35;
        boolean boolean12 = hikariDataSource3.isInitializationFailFast;
        long long13 = hikariDataSource3.acquireRetryDelay;
        java.lang.String str14 = hikariDataSource3.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource6.setUseInstrumentation(true);
        long long9 = hikariDataSource6.getLeakDetectionThreshold();
        int int10 = hikariDataSource6.getmaxPoolSize();
        int int11 = hikariDataSource6.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        hikariConfig16.setisRegisterMbeans(false);
        hikariConfig16.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter21.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter21.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        hikariDataSource24.leakDetectionThreshold = 0;
        hikariDataSource24.setRegisterMbeans(false);
        boolean boolean29 = hikariDataSource24.isIsolateInternalQueries();
        int int30 = hikariDataSource24.getAcquireIncrement();
        hikariConfig16.dataSource = hikariDataSource24;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariConfig22);
        org.junit.Assert.assertNotNull(hikariConfig23);
        org.junit.Assert.assertNotNull(hikariDataSource24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter5.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter5.deserializeObjectHikariConfig2();
        boolean boolean16 = hikariConfig15.isAutoCommit;
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
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter11.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        int int12 = hikariDataSource11.getminPoolSize();
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
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        hikariConfig4.addDataSourceProperty("hi!", (java.lang.Object) hikariDataSource7);
        hikariConfig4.setAcquireIncrement((int) (short) 10);
        boolean boolean11 = hikariConfig4.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.minPoolSize = 7;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = null;
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter17;
        boolean boolean19 = hikariDataSource1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean3 = hikariDataSource2.isIsolateInternalQueries;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter4.deserializeObjectHikariDataSource3();
        java.lang.String str7 = hikariDataSource6.connectionInitSql;
        hikariDataSource6.isRegisterMbeans = false;
        hikariDataSource2.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource6);
        hikariDataSource2.connectionCustomizerClassName = "HikariPool-6";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        int int6 = hikariConfig3.maxPoolSize;
        hikariConfig3.acquireRetryDelay = 28;
        java.lang.String str9 = hikariConfig3.getConnectionTestQuery();
        hikariConfig3.connectionCustomizerClassName = "HikariPool-30";
        hikariConfig3.setMaxLifetime((long) 28);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.acquireRetries = 15;
        hikariDataSource2.maxLifetime = (short) 100;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        hikariDataSource3.transactionIsolationName = "hi!";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource3.connectionCustomizer;
        hikariDataSource3.setDataSourceClassName("HikariPool-28");
        int int13 = hikariDataSource3.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        long long5 = hikariDataSource4.idleTimeout;
        hikariDataSource4.acquireRetries = 10;
        hikariDataSource4.minPoolSize = '#';
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int4 = hikariConfig3.acquireRetries;
        hikariConfig3.setpoolNumber((int) (byte) 0);
        hikariConfig3.setAutoCommit(false);
        long long9 = hikariConfig3.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        long long17 = hikariDataSource12.acquireRetryDelay;
        boolean boolean18 = hikariDataSource12.isReadOnly();
        hikariDataSource12.connectionTestQuery = "hi!";
        boolean boolean21 = hikariDataSource12.isReadOnly;
        boolean boolean22 = hikariDataSource12.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource4.setCatalog("HikariPool-28");
        hikariDataSource4.setDataSourceClassName("VALUES 1");
        hikariDataSource4.transactionIsolationName = "TRANSACTION_REPEATABLE_READ";
        long long11 = hikariDataSource4.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource6.settransactionIsolationName("");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) 35);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource3.setisInitializationFailFast(false);
        hikariDataSource3.acquireRetryDelay = 7;
        hikariDataSource3.connectionInitSql = "HikariPool-19";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter12.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter12.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter12.deserializeObjectHikariDataSource6();
        java.lang.String str19 = serializedObjectSupporter12.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter12.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter12.deserializeObjectHikariDataSource12();
        hikariDataSource3.setDataSource((javax.sql.DataSource) hikariDataSource21);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-32" + "'", str15, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SELECT 1" + "'", str19, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.setisAutoCommit(false);
        int int6 = hikariConfig2.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        boolean boolean38 = hikariDataSource17.getisRegisterMbeans();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        hikariDataSource1.setRegisterMbeans(true);
        boolean boolean19 = hikariDataSource1.isIsolateInternalQueries();
        long long20 = hikariDataSource1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer21;
        boolean boolean23 = hikariDataSource1.getisAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.isJdbc4connectionTest = true;
        java.lang.String str6 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setConnectionTestQuery("HikariPool-6");
        int int9 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setMaximumPoolSize(5);
        hikariDataSource2.setRegisterMbeans(false);
        java.util.Properties properties9 = hikariDataSource2.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
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
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        boolean boolean13 = hikariConfig12.getisRegisterMbeans();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        java.lang.String str15 = hikariDataSource1.getCatalog();
        hikariDataSource1.setConnectionTestQuery("VALUES 1");
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-28");
        java.lang.String str20 = hikariDataSource1.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        hikariConfig1.setTransactionIsolation("HikariPool-32");
        long long9 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.transactionIsolationName = "VALUES 1";
        long long12 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        int int17 = hikariDataSource8.getmaxPoolSize();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        boolean boolean7 = hikariDataSource1.getisRegisterMbeans();
        hikariDataSource1.setisJdbc4connectionTest(false);
        java.lang.String str10 = hikariDataSource1.getCatalog();
        long long11 = hikariDataSource1.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setConnectionCustomizerClassName("SELECT 1");
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = 600000L;
        hikariConfig1.setMaxLifetime((long) (short) 10);
        boolean boolean11 = hikariConfig1.isReadOnly;
        java.lang.String str12 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        hikariDataSource10.catalog = "hi!";
        long long13 = hikariDataSource10.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource16();
        hikariDataSource15.catalog = "hi!";
        long long18 = hikariDataSource15.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter19.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource22 = hikariDataSource21.dataSource;
        hikariDataSource15.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource21);
        hikariDataSource10.setDataSource((javax.sql.DataSource) hikariDataSource21);
        java.lang.String str25 = hikariDataSource21.getJdbcUrl();
        hikariDataSource21.setAcquireRetries((int) '#');
        hikariDataSource8.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource21);
        long long29 = hikariDataSource8.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1800000L + "'", long29 == 1800000L);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        hikariDataSource12.isJdbc4connectionTest = false;
        hikariDataSource12.setReadOnly(false);
        java.lang.String str26 = hikariDataSource12.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "VALUES 1" + "'", str26, "VALUES 1");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        long long5 = hikariDataSource3.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.getConnectionCustomizer();
        hikariConfig1.connectionTimeout = 7;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        long long2 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.catalog = "";
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.idleTimeout = (byte) -1;
        long long8 = hikariConfig0.getACQUIRE_RETRY_DELAY();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = hikariConfig4.dataSourceClassName;
        hikariConfig4.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        java.lang.String str15 = hikariDataSource1.getConnectionInitSql();
        hikariDataSource1.minPoolSize = (byte) 10;
        hikariDataSource1.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        hikariConfig1.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig1.setMinimumPoolSize(2);
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.leakDetectionThreshold;
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        hikariConfig10.settransactionIsolationName("HikariPool-5");
        hikariConfig10.connectionCustomizerClassName = "";
        boolean boolean19 = hikariConfig10.getisInitializationFailFast();
        boolean boolean20 = hikariConfig10.isInitializationFailFast;
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        boolean boolean3 = hikariDataSource2.getisReadOnly();
        int int4 = hikariDataSource2.getpoolNumber();
        long long5 = hikariDataSource2.getIdleTimeout();
        hikariDataSource2.poolName = "HikariPool-13";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource12.setConnectionTimeout((long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        long long10 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        boolean boolean6 = hikariDataSource5.isRegisterMbeans();
        hikariDataSource5.setisRegisterMbeans(false);
        hikariDataSource5.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig7.setDataSourceClassName("SELECT 1");
        long long10 = hikariConfig7.acquireRetryDelay;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource5.setDataSourceClassName("HikariPool-5");
        javax.sql.DataSource dataSource8 = hikariDataSource5.getDataSource();
        boolean boolean9 = hikariDataSource5.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource13.idleTimeout = 22L;
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
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-33" + "'", str12, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int8 = hikariConfig7.minPoolSize;
        hikariConfig7.catalog = "HikariPool-20";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        int int8 = hikariDataSource7.maxPoolSize;
        boolean boolean9 = hikariDataSource7.isRegisterMbeans;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource13();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString6();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString6();
        hikariDataSource7.serializedObjectSupporter = serializedObjectSupporter10;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = hikariDataSource3.serializedObjectSupporter;
        long long5 = hikariDataSource3.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass6 = hikariDataSource3.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        long long7 = hikariConfig1.idleTimeout;
        int int8 = hikariConfig1.acquireRetries;
        int int9 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.setMinimumPoolSize(24);
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        int int8 = hikariDataSource7.getpoolNumber();
        hikariDataSource7.connectionCustomizerClassName = "HikariPool-2";
        int int11 = hikariDataSource7.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        hikariConfig3.setConnectionCustomizerClassName("TRANSACTION_REPEATABLE_READ");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter11.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter11.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter11.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter11.deserializeObjectHikariDataSource11();
        hikariConfig3.addDataSourceProperty("HikariPool-2", (java.lang.Object) serializedObjectSupporter11);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        hikariConfig23.setAcquireIncrement(20);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(hikariConfig23);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        hikariDataSource2.setInitializationFailFast(true);
        java.lang.String str24 = hikariDataSource2.catalog;
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        hikariConfig33.setDataSourceClassName("HikariPool-5");
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
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = hikariDataSource4.connectionTestQuery;
        hikariDataSource4.setCatalog("HikariPool-4");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.settransactionIsolationName("HikariPool-28");
        hikariConfig1.connectionInitSql = "HikariPool-32";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        boolean boolean22 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str10 = hikariConfig9.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        boolean boolean8 = hikariDataSource3.isInitializationFailFast;
        long long9 = hikariDataSource3.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource10 = hikariDataSource3.dataSource;
        int int11 = hikariDataSource3.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        long long4 = hikariDataSource3.leakDetectionThreshold;
        int int5 = hikariDataSource3.getTransactionIsolation();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        hikariDataSource3.serializedObjectSupporter = serializedObjectSupporter6;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.transactionIsolationName = "hi!";
        hikariDataSource3.setRegisterMbeans(false);
        java.lang.String str9 = hikariDataSource3.catalog;
        hikariDataSource3.setUseInstrumentation(false);
        hikariDataSource3.setisReadOnly(false);
        boolean boolean14 = hikariDataSource3.isInitializationFailFast;
        boolean boolean15 = hikariDataSource3.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        boolean boolean8 = hikariDataSource3.isInitializationFailFast;
        java.lang.String str9 = hikariDataSource3.getConnectionTestQuery();
        boolean boolean10 = hikariDataSource3.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int5 = hikariConfig4.transactionIsolation;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource8();
        javax.sql.DataSource dataSource10 = hikariDataSource9.dataSource;
        hikariConfig4.setDataSource(dataSource10);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        int int11 = hikariDataSource10.getmaxPoolSize();
        hikariDataSource10.isJdbc4connectionTest = true;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        long long26 = hikariDataSource17.connectionTimeout;
        boolean boolean27 = hikariDataSource17.isJdbc4ConnectionTest();
        hikariDataSource17.settransactionIsolationName("HikariPool-30");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        hikariDataSource11.setTransactionIsolation("hi!");
        hikariDataSource11.setisJdbc4connectionTest(false);
        int int16 = hikariDataSource11.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        hikariDataSource15.setMaxLifetime(0L);
        long long20 = hikariDataSource15.getAcquireRetryDelay();
        hikariDataSource15.settransactionIsolationName("VALUES 1");
        boolean boolean23 = hikariDataSource15.getisInitializationFailFast();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str2 = hikariConfig1.getCatalog();
        hikariConfig1.isInitializationFailFast = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource1();
        boolean boolean8 = hikariDataSource7.isReadOnly;
        java.lang.String str9 = hikariDataSource7.connectionCustomizerClassName;
        hikariConfig1.dataSource = hikariDataSource7;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        hikariConfig12.acquireRetryDelay = 0;
        hikariConfig12.idleTimeout = 0L;
        hikariConfig12.setConnectionInitSql("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter19.deserializeObjectHikariDataSource9();
        java.util.Properties properties22 = hikariDataSource21.dataSourceProperties;
        hikariConfig12.dataSourceProperties = properties22;
        hikariConfig1.dataSourceProperties = properties22;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTimeout = 2;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMaximumPoolSize(35);
        hikariConfig1.maxPoolSize = 8;
        hikariConfig1.transactionIsolation = 30;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setDataSourceClassName("HikariPool-6");
        java.lang.String str7 = hikariDataSource2.catalog;
        hikariDataSource2.setpoolNumber(0);
        java.lang.String str10 = hikariDataSource2.gettransactionIsolationName();
        int int11 = hikariDataSource2.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.setMaxLifetime((long) 9);
        boolean boolean7 = hikariConfig4.getisIsolateInternalQueries();
        long long8 = hikariConfig4.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource9.setCatalog("VALUES 1");
        java.lang.String str12 = hikariDataSource9.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long5 = hikariDataSource4.leakDetectionThreshold;
        hikariDataSource4.setIsolateInternalQueries(false);
        hikariDataSource4.setConnectionCustomizerClassName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(simpleLogger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str6 = hikariDataSource5.getPoolName();
        hikariDataSource5.setJdbcUrl("HikariPool-4");
        boolean boolean9 = hikariDataSource5.getisIsolateInternalQueries();
        long long10 = hikariDataSource5.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-28" + "'", str6, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource4();
        java.util.Properties properties13 = serializedObjectSupporter10.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariDataSource9.setDataSourceProperties(properties13);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        hikariConfig9.setLeakDetectionThreshold(1800000L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter12.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter12.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter12.deserializeObjectHikariDataSource9();
        hikariDataSource16.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        int int19 = hikariDataSource16.acquireRetries;
        hikariDataSource16.setAcquireRetryDelay((long) 12);
        hikariDataSource16.setRegisterMbeans(true);
        hikariDataSource16.setisRegisterMbeans(false);
        hikariConfig9.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        hikariConfig9.connectionTimeout = 22L;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        java.lang.String str14 = serializedObjectSupporter5.deserializeObjectString7();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties3);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties3);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties3);
        javax.sql.DataSource dataSource8 = hikariConfig7.dataSource;
        java.lang.String str9 = hikariConfig7.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7" + "'", str9, "HikariPool-7");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str6 = hikariDataSource5.connectionInitSql;
        hikariDataSource5.transactionIsolationName = "HikariPool-7";
        long long9 = hikariDataSource5.getIDLE_TIMEOUT();
        java.lang.String str10 = hikariDataSource5.getDataSourceClassName();
        java.lang.String str11 = hikariDataSource5.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        hikariConfig4.setisIsolateInternalQueries(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig4.connectionCustomizer = iConnectionCustomizer7;
        int int9 = hikariConfig4.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        java.util.Properties properties6 = hikariDataSource2.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getAcquireRetryDelay();
        javax.sql.DataSource dataSource9 = hikariConfig7.dataSource;
        long long10 = hikariConfig7.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig3.setConnectionCustomizerClassName("HikariPool-32");
        boolean boolean6 = hikariConfig3.isInitializationFailFast;
        long long7 = hikariConfig3.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.copyState(hikariConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Exception copying HikariConfig state: null");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        boolean boolean12 = hikariDataSource10.isAutoCommit();
        hikariDataSource10.setpoolNumber((-1));
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        long long7 = hikariConfig1.getCONNECTION_TIMEOUT();
        long long8 = hikariConfig1.acquireRetryDelay;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.transactionIsolationName = "VALUES 1";
        long long12 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.maxLifetime = (short) -1;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        java.lang.String str12 = hikariConfig1.catalog;
        hikariConfig1.dataSourceClassName = "HikariPool-6";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        hikariDataSource3.serializedObjectSupporter = serializedObjectSupporter6;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.setisAutoCommit(false);
        java.lang.String str6 = hikariConfig2.connectionTestQuery;
        long long7 = hikariConfig2.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.dataSourceClassName = "SELECT 1";
        hikariDataSource1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
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
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariConfig14);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.transactionIsolationName = "SELECT 1";
        hikariConfig2.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean8 = hikariConfig2.getisReadOnly();
        int int9 = hikariConfig2.getmaxPoolSize();
        hikariConfig2.catalog = "SELECT 1";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        java.util.Properties properties6 = hikariConfig2.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.maxLifetime;
        java.lang.String str9 = hikariConfig7.getConnectionCustomizerClassName();
        hikariConfig7.setmaxPoolSize(8);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        java.lang.String str5 = hikariDataSource2.getDataSourceClassName();
        hikariDataSource2.dataSourceClassName = "hi!";
        long long8 = hikariDataSource2.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.jdbcUrl;
        hikariConfig3.setisInitializationFailFast(false);
        int int7 = hikariConfig3.getmaxPoolSize();
        hikariConfig3.setConnectionTimeout(100L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource9.isIsolateInternalQueries = true;
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
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        hikariConfig14.setAcquireRetries(25);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig2.setAutoCommit(true);
        int int5 = hikariConfig2.getAcquireRetries();
        java.lang.String str6 = hikariConfig2.getPoolName();
        hikariConfig2.validate();
        java.lang.String str8 = hikariConfig2.poolName;
        boolean boolean9 = hikariConfig2.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource5.catalog = "";
        java.lang.String str8 = hikariDataSource5.jdbcUrl;
        boolean boolean9 = hikariDataSource5.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource1.acquireIncrement = 60;
        int int4 = hikariDataSource1.getTransactionIsolation();
        hikariDataSource1.setpoolNumber(3);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        int int4 = hikariDataSource3.getpoolNumber();
        int int5 = hikariDataSource3.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        hikariConfig6.maxLifetime = (short) 10;
        java.lang.String str39 = hikariConfig6.getPoolName();
        long long40 = hikariConfig6.getCONNECTION_TIMEOUT();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-3" + "'", str39, "HikariPool-3");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5000L + "'", long40 == 5000L);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.isJdbc4connectionTest = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        java.lang.String str14 = hikariDataSource1.gettransactionIsolationName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource6();
        hikariDataSource1.dataSource = hikariDataSource18;
        int int20 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource7.transactionIsolationName = "HikariPool-5";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        int int6 = hikariDataSource1.acquireRetries;
        boolean boolean7 = hikariDataSource1.isAutoCommit();
        hikariDataSource1.leakDetectionThreshold = 29;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = hikariConfig6.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig6.getConnectionCustomizerClassName();
        hikariConfig6.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource8.setDriverClassName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'hi!' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        int int4 = hikariDataSource2.maxPoolSize;
        hikariDataSource2.poolName = "SELECT 1";
        long long7 = hikariDataSource2.getIDLE_TIMEOUT();
        boolean boolean8 = hikariDataSource2.isIsolateInternalQueries();
        int int9 = hikariDataSource2.getAcquireRetries();
        java.util.Properties properties10 = hikariDataSource2.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        java.lang.String str8 = hikariDataSource3.jdbcUrl;
        hikariDataSource3.setAcquireIncrement(19);
        hikariDataSource3.setConnectionInitSql("HikariPool-6");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariDataSource3.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-28";
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource3.setisInitializationFailFast(false);
        hikariDataSource3.catalog = "HikariPool-19";
        hikariDataSource3.leakDetectionThreshold = 600000L;
        hikariDataSource3.idleTimeout = 20;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setJdbc4ConnectionTest(false);
        boolean boolean7 = hikariDataSource1.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        int int17 = hikariDataSource12.getminPoolSize();
        hikariDataSource12.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        boolean boolean16 = hikariDataSource15.isRegisterMbeans;
        long long17 = hikariDataSource15.getMaxLifetime();
        java.lang.String str18 = hikariDataSource15.connectionCustomizerClassName;
        long long19 = hikariDataSource15.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig2.acquireIncrement = (byte) 1;
        hikariConfig2.setConnectionInitSql("");
        hikariConfig2.poolName = "VALUES 1";
        boolean boolean9 = hikariConfig2.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.getJdbcUrl();
        hikariConfig3.leakDetectionThreshold = 1;
        int int7 = hikariConfig3.getTransactionIsolation();
        java.lang.String str8 = hikariConfig3.transactionIsolationName;
        hikariConfig3.acquireRetryDelay = 36;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        boolean boolean10 = hikariDataSource8.getisJdbc4connectionTest();
        java.lang.String str11 = hikariDataSource8.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "VALUES 1" + "'", str11, "VALUES 1");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties3 = hikariDataSource2.dataSourceProperties;
        hikariDataSource2.setisReadOnly(true);
        boolean boolean6 = hikariDataSource2.getisRegisterMbeans();
        int int7 = hikariDataSource2.maxPoolSize;
        java.lang.String str8 = hikariDataSource2.getConnectionTestQuery();
        hikariDataSource2.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource2.isAutoCommit = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "VALUES 1" + "'", str8, "VALUES 1");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        hikariDataSource2.setLeakDetectionThreshold((long) 10);
        boolean boolean7 = hikariDataSource2.isAutoCommit;
        int int8 = hikariDataSource2.getTransactionIsolation();
        java.lang.String str9 = hikariDataSource2.poolName;
        hikariDataSource2.setCatalog("HikariPool-30");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource16();
        hikariDataSource13.setminPoolSize((int) (short) 1);
        hikariDataSource13.maxLifetime = (byte) 1;
        hikariDataSource13.setMaxLifetime(10L);
        long long20 = hikariDataSource13.maxLifetime;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter22.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter22.deserializeObjectHikariConfig2();
        int int25 = hikariConfig24.getAcquireRetries();
        hikariConfig24.transactionIsolationName = "SELECT 1";
        hikariDataSource13.addDataSourceProperty("", (java.lang.Object) hikariConfig24);
        hikariConfig24.maxLifetime = 22;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter31 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = serializedObjectSupporter31.deserializeObjectHikariConfig2();
        hikariConfig32.poolName = "";
        boolean boolean35 = hikariConfig32.getisJdbc4connectionTest();
        hikariConfig32.setisRegisterMbeans(false);
        hikariConfig32.maxPoolSize = 10;
        boolean boolean40 = hikariConfig32.getisRegisterMbeans();
        hikariConfig32.settransactionIsolationName("hi!");
        hikariConfig24.copyState(hikariConfig32);
        boolean boolean44 = hikariConfig24.isAutoCommit();
        hikariDataSource2.copyState(hikariConfig24);
        hikariDataSource2.maxPoolSize = 13;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-4" + "'", str9, "HikariPool-4");
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(hikariConfig23);
        org.junit.Assert.assertNotNull(hikariConfig24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(hikariConfig32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        long long5 = hikariConfig1.getACQUIRE_RETRY_DELAY();
        long long6 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = hikariConfig6.connectionInitSql;
        hikariConfig6.setAcquireRetryDelay((long) 20);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean4 = hikariConfig3.isAutoCommit();
        hikariConfig3.idleTimeout = (short) 10;
        hikariConfig3.connectionCustomizerClassName = "HikariPool-4";
        int int9 = hikariConfig3.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        hikariConfig1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        int int6 = hikariDataSource3.acquireRetries;
        hikariDataSource3.setAcquireRetryDelay((long) 29);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariDataSource3.connectionCustomizer;
        int int10 = hikariDataSource3.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str12 = hikariDataSource11.catalog;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource7.setLeakDetectionThreshold((long) (byte) 0);
        hikariDataSource7.setmaxPoolSize(14);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTestQuery = "";
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.acquireIncrement = 4;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter9.deserializeObjectHikariDataSource5();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter9.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter9.deserializeObjectHikariDataSource1();
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-6" + "'", str14, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-28";
        long long8 = hikariConfig1.connectionTimeout;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-3";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int5 = hikariConfig4.maxPoolSize;
        long long6 = hikariConfig4.acquireRetryDelay;
        hikariConfig4.connectionCustomizerClassName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig4.connectionCustomizerClassName = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig2();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter23.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter23.deserializeObjectHikariDataSource1();
        hikariDataSource12.setDataSource((javax.sql.DataSource) hikariDataSource28);
        int int30 = hikariDataSource12.acquireRetries;
        int int31 = hikariDataSource12.minPoolSize;
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
        org.junit.Assert.assertNotNull(hikariConfig24);
        org.junit.Assert.assertNotNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str26, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertNotNull(hikariDataSource28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter11.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.setpoolNumber(19);
        boolean boolean6 = hikariDataSource2.getisAutoCommit();
        boolean boolean7 = hikariDataSource2.getisRegisterMbeans();
        int int8 = hikariDataSource2.minPoolSize;
        hikariDataSource2.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }
}

