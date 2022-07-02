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
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        int int5 = hikariDataSource2.getAcquireIncrement();
        hikariDataSource2.connectionTestQuery = "HikariPool-32";
        hikariDataSource2.setpoolNumber(1);
        hikariDataSource2.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        hikariDataSource2.isJdbc4connectionTest = false;
        hikariDataSource2.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.zaxxer.hikari.HikariConfig.poolNumber = 1;
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig8.setmaxPoolSize(15);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource5.transactionIsolationName = "HikariPool-33";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        hikariDataSource1.setMaxLifetime(100L);
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
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource6.isJdbc4connectionTest = false;
        hikariDataSource6.setAcquireRetries(20);
        hikariDataSource6.connectionCustomizerClassName = "HikariPool-17";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        hikariDataSource20.setisAutoCommit(true);
        hikariDataSource20.isReadOnly = true;
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
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter5.deserializeObjectHikariConfig1();
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
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setConnectionCustomizerClassName("SELECT 1");
        long long6 = hikariConfig1.getConnectionTimeout();
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireIncrement(5);
        hikariConfig1.setTransactionIsolation("SELECT 1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String str16 = hikariConfig13.transactionIsolationName;
        hikariConfig13.maxPoolSize = (short) 1;
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig7.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries;
        hikariDataSource3.setConnectionTestQuery("TRANSACTION_REPEATABLE_READ");
        boolean boolean7 = hikariDataSource3.isRegisterMbeans();
        long long8 = hikariDataSource3.connectionTimeout;
        long long9 = hikariDataSource3.idleTimeout;
        hikariDataSource3.setJdbc4ConnectionTest(false);
        int int12 = hikariDataSource3.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        long long12 = hikariConfig11.getIDLE_TIMEOUT();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean5 = hikariDataSource4.isReadOnly;
        javax.sql.DataSource dataSource6 = hikariDataSource4.getDataSource();
        hikariDataSource4.connectionTestQuery = "hi!";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setRegisterMbeans(true);
        boolean boolean6 = hikariDataSource3.getisAutoCommit();
        hikariDataSource3.validate();
        hikariDataSource3.catalog = "HikariPool-2";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource4.maxPoolSize = 0;
        javax.sql.DataSource dataSource7 = hikariDataSource4.getDataSource();
        hikariDataSource4.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        long long9 = hikariDataSource1.getConnectionTimeout();
        hikariDataSource1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setInitializationFailFast(true);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.setCatalog("HikariPool-17");
        java.lang.String str10 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-17" + "'", str10, "HikariPool-17");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.String str5 = hikariDataSource4.getDataSourceClassName();
        java.lang.String str6 = hikariDataSource4.jdbcUrl;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter7.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        hikariConfig14.transactionIsolation = 19;
        hikariDataSource4.copyState(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariConfig14);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig5.setConnectionTimeout(0L);
        hikariConfig5.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        long long10 = hikariDataSource9.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = hikariConfig2.jdbcUrl;
        hikariConfig2.maxPoolSize = 19;
        java.lang.String str6 = hikariConfig2.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource10.isReadOnly = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        int int13 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.connectionInitSql = "HikariPool-22";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource9();
        hikariDataSource18.acquireIncrement = '#';
        int int21 = hikariDataSource18.getAcquireIncrement();
        java.lang.String str22 = hikariDataSource18.getConnectionInitSql();
        hikariConfig12.setDataSource((javax.sql.DataSource) hikariDataSource18);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = hikariConfig5.getDataSourceClassName();
        long long7 = hikariConfig5.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig5.setisRegisterMbeans(true);
        hikariConfig5.setpoolNumber(55);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        java.util.Properties properties6 = hikariConfig2.getDataSourceProperties();
        long long7 = hikariConfig2.acquireRetryDelay;
        int int8 = hikariConfig2.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        hikariDataSource13.setReadOnly(true);
        hikariDataSource13.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str12 = hikariDataSource11.getDataSourceClassName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        hikariDataSource9.setminPoolSize((int) (short) 1);
        hikariDataSource9.maxLifetime = (byte) 1;
        hikariDataSource9.setMaxLifetime(10L);
        hikariDataSource9.validate();
        hikariDataSource9.setIsolateInternalQueries(true);
        hikariDataSource1.dataSource = hikariDataSource9;
        boolean boolean20 = hikariDataSource1.isInitializationFailFast;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource2.setpoolNumber(22);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.String str16 = hikariDataSource2.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setisAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisIsolateInternalQueries();
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-28");
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        int int15 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setisRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        long long19 = hikariConfig1.getMaxLifetime();
        int int20 = hikariConfig1.acquireIncrement;
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        hikariDataSource1.setisJdbc4connectionTest(true);
        hikariDataSource1.acquireRetries = 12;
        int int17 = hikariDataSource1.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        java.util.Properties properties6 = hikariConfig2.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setMinimumPoolSize((int) (byte) 1);
        hikariConfig7.isInitializationFailFast = false;
        java.lang.String str12 = hikariConfig7.getPoolName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-22" + "'", str12, "HikariPool-22");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int6 = hikariConfig5.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        hikariConfig4.setisIsolateInternalQueries(false);
        hikariConfig4.setisReadOnly(true);
        hikariConfig4.poolName = "HikariPool-9";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig6.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        long long10 = hikariDataSource1.getMAX_LIFETIME();
        hikariDataSource1.setisRegisterMbeans(false);
        boolean boolean13 = hikariDataSource1.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        javax.sql.DataSource dataSource9 = hikariDataSource8.getDataSource();
        java.lang.String str10 = hikariDataSource8.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig3.setisIsolateInternalQueries(true);
        hikariConfig3.acquireRetryDelay = 100L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean7 = hikariConfig6.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        long long2 = hikariDataSource1.getCONNECTION_TIMEOUT();
        long long3 = hikariDataSource1.getConnectionTimeout();
        hikariDataSource1.maxPoolSize = '4';
        hikariDataSource1.catalog = "VALUES 1";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTestQuery = "SELECT 1";
        hikariConfig1.setisRegisterMbeans(true);
        hikariConfig1.transactionIsolationName = "HikariPool-19";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setisAutoCommit(true);
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        org.slf4j.impl.SimpleLogger simpleLogger43 = serializedObjectSupporter38.deserializeObjectLogger1();
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
        org.junit.Assert.assertNotNull(simpleLogger43);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        long long7 = hikariConfig1.idleTimeout;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig8.isAutoCommit = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        int int8 = hikariDataSource7.maxPoolSize;
        java.lang.String str9 = hikariDataSource7.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.validate();
        long long9 = hikariDataSource1.maxLifetime;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter10.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter10.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter10.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter19.deserializeObjectHikariDataSource9();
        hikariDataSource21.acquireIncrement = '#';
        java.util.Properties properties24 = hikariDataSource21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariDataSource18.setDataSourceProperties(properties24);
        hikariDataSource1.dataSourceProperties = properties24;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.settransactionIsolationName("HikariPool-6");
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction isolation value: HikariPool-6");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariDataSource8.getConnectionCustomizer();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariDataSource8.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.isRegisterMbeans = false;
        java.lang.String str6 = hikariDataSource2.transactionIsolationName;
        hikariDataSource2.setCatalog("hi!");
        hikariDataSource2.isAutoCommit = false;
        long long11 = hikariDataSource2.acquireRetryDelay;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        boolean boolean5 = hikariConfig3.getisInitializationFailFast();
        hikariConfig3.maxLifetime = 35;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        java.lang.String str18 = hikariConfig17.poolName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-33" + "'", str16, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-33" + "'", str18, "HikariPool-33");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        java.lang.String str5 = hikariDataSource1.getPoolName();
        hikariDataSource1.isJdbc4connectionTest = false;
        java.util.Properties properties8 = hikariDataSource1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.connectionInitSql;
        javax.sql.DataSource dataSource11 = hikariConfig9.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        boolean boolean6 = hikariConfig3.isReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig5);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisAutoCommit();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setminPoolSize((int) (short) 1);
        hikariConfig1.leakDetectionThreshold = 9;
        hikariConfig1.setminPoolSize(59);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter5.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariDataSource12.serializedObjectSupporter;
        hikariDataSource12.dataSourceClassName = "HikariPool-5";
        boolean boolean16 = hikariDataSource12.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig3.setisIsolateInternalQueries(true);
        boolean boolean6 = hikariConfig3.isReadOnly();
        hikariConfig3.setmaxPoolSize(19);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int6 = hikariConfig5.minPoolSize;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = hikariConfig5.serializedObjectSupporter;
        hikariConfig5.setminPoolSize((int) (byte) -1);
        long long10 = hikariConfig5.getMaxLifetime();
        hikariConfig5.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        hikariDataSource12.isAutoCommit = false;
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
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource6.transactionIsolationName = "HikariPool-20";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig7.idleTimeout = (byte) 1;
        long long10 = hikariConfig7.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource9.setminPoolSize(8);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        int int4 = hikariConfig1.getmaxPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        hikariConfig3.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        hikariDataSource1.acquireIncrement = (short) 1;
        long long21 = hikariDataSource1.idleTimeout;
        hikariDataSource1.jdbcUrl = "HikariPool-30";
        hikariDataSource1.setLeakDetectionThreshold((long) 29);
        boolean boolean26 = hikariDataSource1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean3 = hikariDataSource2.isRegisterMbeans();
        java.lang.String str4 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.setConnectionCustomizerClassName("hi!");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariDataSource2.connectionCustomizer = iConnectionCustomizer7;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.idleTimeout = 0L;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireRetries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = hikariConfig1.serializedObjectSupporter;
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource3.setAcquireIncrement((int) (byte) 100);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.lang.String str12 = hikariDataSource11.transactionIsolationName;
        java.lang.String str13 = hikariDataSource11.getCatalog();
        hikariDataSource11.validate();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource13();
        hikariDataSource11.serializedObjectSupporter = serializedObjectSupporter15;
        int int19 = hikariDataSource11.getMinimumPoolSize();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        javax.sql.DataSource dataSource22 = hikariDataSource12.getDataSource();
        int int23 = hikariDataSource12.acquireRetries;
        javax.sql.DataSource dataSource24 = hikariDataSource12.getDataSource();
        int int25 = hikariDataSource12.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28" + "'", str18, "HikariPool-28");
        org.junit.Assert.assertNotNull(dataSource22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(dataSource24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        java.lang.String str6 = hikariDataSource2.poolName;
        long long7 = hikariDataSource2.getACQUIRE_RETRY_DELAY();
        int int8 = hikariDataSource2.getTransactionIsolation();
        hikariDataSource2.maxPoolSize = 4;
        boolean boolean11 = hikariDataSource2.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-4" + "'", str6, "HikariPool-4");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        int int6 = hikariConfig3.maxPoolSize;
        hikariConfig3.acquireRetryDelay = 28;
        hikariConfig3.setLeakDetectionThreshold((long) 'a');
        java.lang.String str11 = hikariConfig3.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str11, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        boolean boolean7 = hikariDataSource1.getisRegisterMbeans();
        int int8 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setUseInstrumentation(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        long long5 = hikariDataSource4.idleTimeout;
        hikariDataSource4.setAcquireRetries(26);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.maxLifetime = (short) -1;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.dataSourceClassName = "HikariPool-5";
        hikariConfig1.setConnectionTestQuery("HikariPool-24");
        boolean boolean16 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setAcquireRetries(52);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-0 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        hikariDataSource6.setisReadOnly(true);
        hikariDataSource6.connectionCustomizerClassName = "HikariPool-7";
        hikariDataSource6.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig2.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig2.getisReadOnly();
        java.lang.String str6 = hikariConfig2.connectionCustomizerClassName;
        hikariConfig2.maxPoolSize = (byte) 100;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource11.transactionIsolationName = "HikariPool-30";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setConnectionTimeout(600000L);
        hikariDataSource2.setJdbc4ConnectionTest(false);
        int int9 = hikariDataSource2.getmaxPoolSize();
        boolean boolean10 = hikariDataSource2.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource7.transactionIsolationName = "HikariPool-5";
        hikariDataSource7.transactionIsolationName = "SELECT 1";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        boolean boolean7 = hikariDataSource1.getisInitializationFailFast();
        hikariDataSource1.setpoolNumber(22);
        hikariDataSource1.maxPoolSize = 3;
        hikariDataSource1.setIdleTimeout((long) 8);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        javax.sql.DataSource dataSource8 = hikariDataSource7.getDataSource();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource8.setLeakDetectionThreshold((long) 19);
        java.util.Properties properties11 = hikariDataSource8.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        hikariConfig20.setminPoolSize(11);
        hikariConfig20.acquireRetries = 28;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setJdbcUrl("HikariPool-33");
        hikariConfig1.setMinimumPoolSize(29);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        hikariDataSource3.validate();
        hikariDataSource3.maxPoolSize = (short) 100;
        hikariDataSource3.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int7 = hikariDataSource6.getminPoolSize();
        hikariDataSource6.setTransactionIsolation("HikariPool-4");
        int int10 = hikariDataSource6.getAcquireRetries();
        boolean boolean11 = hikariDataSource6.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        hikariDataSource13.setReadOnly(true);
        hikariDataSource13.dataSourceClassName = "";
        hikariDataSource13.setJdbcUrl("");
        int int20 = hikariDataSource13.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig6.setUseInstrumentation(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        boolean boolean7 = hikariDataSource1.getisInitializationFailFast();
        java.util.Properties properties8 = hikariDataSource1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        java.lang.String str21 = hikariDataSource1.transactionIsolationName;
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource7.isIsolateInternalQueries = false;
        hikariDataSource7.isInitializationFailFast = true;
        hikariDataSource7.setUseInstrumentation(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setConnectionTimeout(600000L);
        hikariDataSource2.setJdbc4ConnectionTest(false);
        int int9 = hikariDataSource2.getmaxPoolSize();
        boolean boolean10 = hikariDataSource2.getisReadOnly();
        boolean boolean11 = hikariDataSource2.isInitializationFailFast;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        hikariDataSource2.setLeakDetectionThreshold(1L);
        java.util.Properties properties5 = hikariDataSource2.getDataSourceProperties();
        hikariDataSource2.transactionIsolationName = "TRANSACTION_REPEATABLE_READ";
        int int8 = hikariDataSource2.getTransactionIsolation();
        hikariDataSource2.leakDetectionThreshold = 0L;
        boolean boolean11 = hikariDataSource2.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig2.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig2.getisRegisterMbeans();
        long long6 = hikariConfig2.getLeakDetectionThreshold();
        int int7 = hikariConfig2.getmaxPoolSize();
        boolean boolean8 = hikariConfig2.isReadOnly;
        hikariConfig2.connectionTestQuery = "VALUES 1";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        boolean boolean3 = hikariDataSource1.isReadOnly;
        hikariDataSource1.transactionIsolation = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        javax.sql.DataSource dataSource6 = hikariDataSource1.dataSource;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setConnectionTimeout((long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        long long10 = hikariConfig1.getACQUIRE_RETRY_DELAY();
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolation = 36;
        int int14 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.setpoolNumber(19);
        hikariDataSource2.setMaxLifetime((long) 28);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.maxLifetime = (short) -1;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean2 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-19");
        hikariConfig1.leakDetectionThreshold = 0L;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean7 = hikariConfig6.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str4 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.catalog = "SELECT 1";
        int int7 = hikariDataSource3.getminPoolSize();
        hikariDataSource3.isJdbc4connectionTest = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource3();
        java.lang.String str13 = hikariDataSource12.connectionInitSql;
        boolean boolean14 = hikariDataSource12.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        hikariDataSource12.serializedObjectSupporter = serializedObjectSupporter15;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter15.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        hikariDataSource3.serializedObjectSupporter = serializedObjectSupporter15;
        hikariDataSource3.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertNotNull(hikariConfig21);
        org.junit.Assert.assertNotNull(hikariConfig22);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        long long5 = hikariDataSource3.getLeakDetectionThreshold();
        hikariDataSource3.setisRegisterMbeans(false);
        hikariDataSource3.setIsolateInternalQueries(true);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = hikariConfig10.serializedObjectSupporter;
        long long12 = hikariConfig10.acquireRetryDelay;
        hikariConfig10.catalog = "";
        boolean boolean15 = hikariConfig10.isIsolateInternalQueries;
        hikariConfig10.idleTimeout = (byte) -1;
        long long18 = hikariConfig10.getACQUIRE_RETRY_DELAY();
        long long19 = hikariConfig10.idleTimeout;
        hikariDataSource3.copyState(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int8 = hikariConfig7.acquireIncrement;
        java.lang.String str9 = hikariConfig7.transactionIsolationName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter10.deserializeObjectHikariDataSource6();
        hikariConfig7.serializedObjectSupporter = serializedObjectSupporter10;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource1.setConnectionInitSql("HikariPool-33");
        long long4 = hikariDataSource1.leakDetectionThreshold;
        hikariDataSource1.transactionIsolation = 30;
        hikariDataSource1.jdbcUrl = "HikariPool-30";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        int int19 = hikariDataSource18.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-6" + "'", str16, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.setUseInstrumentation(false);
        java.lang.String str6 = hikariConfig2.connectionInitSql;
        int int7 = hikariConfig2.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.dataSourceClassName = "VALUES 1";
        java.lang.String str7 = hikariDataSource1.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str6 = hikariDataSource5.getPoolName();
        boolean boolean7 = hikariDataSource5.isAutoCommit;
        hikariDataSource5.setAcquireRetries(0);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-19" + "'", str6, "HikariPool-19");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        int int21 = hikariDataSource12.getAcquireIncrement();
        hikariDataSource12.settransactionIsolationName("VALUES 1");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        boolean boolean8 = hikariDataSource3.isInitializationFailFast;
        boolean boolean9 = hikariDataSource3.getisRegisterMbeans();
        hikariDataSource3.acquireRetryDelay = 0;
        java.lang.String str12 = hikariDataSource3.catalog;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setminPoolSize(29);
        hikariDataSource1.setConnectionInitSql("HikariPool-11");
        int int6 = hikariDataSource1.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource4.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource4.isIsolateInternalQueries = true;
        hikariDataSource4.setpoolNumber(28);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        hikariDataSource12.isInitializationFailFast = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource15();
        java.lang.String str23 = hikariDataSource22.transactionIsolationName;
        hikariDataSource12.dataSource = hikariDataSource22;
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
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setminPoolSize(29);
        long long4 = hikariDataSource1.getIDLE_TIMEOUT();
        boolean boolean5 = hikariDataSource1.getisReadOnly();
        java.lang.String str6 = hikariDataSource1.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        hikariConfig11.catalog = "HikariPool-33";
        hikariConfig11.transactionIsolationName = "HikariPool-20";
        long long20 = hikariConfig11.getIdleTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = hikariConfig11.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        hikariDataSource6.setisReadOnly(true);
        hikariDataSource6.connectionCustomizerClassName = "HikariPool-7";
        int int15 = hikariDataSource6.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig9.setmaxPoolSize(0);
        boolean boolean12 = hikariConfig9.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig2.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig2.getisRegisterMbeans();
        long long6 = hikariConfig2.getLeakDetectionThreshold();
        int int7 = hikariConfig2.getmaxPoolSize();
        hikariConfig2.setRegisterMbeans(false);
        int int10 = hikariConfig2.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        long long18 = hikariDataSource15.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariDataSource15.connectionCustomizer;
        hikariDataSource15.setInitializationFailFast(false);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        hikariConfig16.setConnectionTestQuery("");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.settransactionIsolationName("HikariPool-28");
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = hikariDataSource6.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        java.lang.String str10 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.setMinimumPoolSize(0);
        boolean boolean13 = hikariDataSource1.isRegisterMbeans;
        hikariDataSource1.acquireRetries = 39;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.maxLifetime = 13;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        hikariDataSource1.setisAutoCommit(false);
        hikariDataSource1.setmaxPoolSize(8);
        int int17 = hikariDataSource1.transactionIsolation;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter18.deserializeObjectHikariDataSource3();
        java.lang.String str21 = hikariDataSource20.connectionInitSql;
        boolean boolean22 = hikariDataSource20.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter23.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariDataSource20.serializedObjectSupporter = serializedObjectSupporter23;
        hikariDataSource20.isJdbc4connectionTest = true;
        int int31 = hikariDataSource20.getMinimumPoolSize();
        boolean boolean32 = hikariDataSource20.isJdbc4ConnectionTest();
        hikariDataSource20.setAcquireRetryDelay(1L);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(hikariConfig24);
        org.junit.Assert.assertNotNull(hikariConfig25);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariConfig27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        int int10 = hikariConfig1.acquireIncrement;
        java.lang.String str11 = hikariConfig1.poolName;
        boolean boolean12 = hikariConfig1.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        boolean boolean5 = hikariConfig3.getisInitializationFailFast();
        int int6 = hikariConfig3.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource8.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int10 = hikariDataSource9.getAcquireRetries();
        hikariDataSource9.setmaxPoolSize((-1));
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isReadOnly = false;
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.minPoolSize = '#';
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource8();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter9.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter9;
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter9.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-33" + "'", str13, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariDataSource17);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource4.setTransactionIsolation("HikariPool-5");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter13.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter13.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter13.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter13.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter13.deserializeObjectHikariDataSource2();
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource20);
        hikariDataSource20.minPoolSize = 58;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource4.setCatalog("HikariPool-28");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter7.deserializeObjectHikariConfig2();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter7.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter7.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter7.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter7.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        hikariDataSource4.setDataSource((javax.sql.DataSource) hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        java.lang.String str13 = hikariDataSource1.poolName;
        boolean boolean14 = hikariDataSource1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-28" + "'", str13, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig7.connectionCustomizerClassName = "HikariPool-28";
        boolean boolean10 = hikariConfig7.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource4.setJdbcUrl("HikariPool-19");
        boolean boolean7 = hikariDataSource4.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        hikariDataSource1.setTransactionIsolation("HikariPool-15");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        hikariConfig1.setisReadOnly(false);
        hikariConfig1.acquireRetryDelay = 19;
        hikariConfig1.setminPoolSize(60);
        hikariConfig1.jdbcUrl = "HikariPool-15";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter5.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter5.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter5.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter5.deserializeObjectHikariConfig3();
        java.util.Properties properties14 = hikariConfig13.dataSourceProperties;
        hikariConfig4.dataSourceProperties = properties14;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setCatalog("HikariPool-32");
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int20 = hikariDataSource15.getAcquireIncrement();
        java.lang.String str21 = hikariDataSource15.getConnectionTestQuery();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "VALUES 1" + "'", str21, "VALUES 1");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        long long6 = hikariConfig1.getMAX_LIFETIME();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setmaxPoolSize((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        int int14 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-33" + "'", str10, "HikariPool-33");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource5.setMaxLifetime((long) 3);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        hikariDataSource3.connectionInitSql = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        hikariDataSource12.setTransactionIsolation("HikariPool-28");
        hikariDataSource12.setRegisterMbeans(false);
        hikariDataSource12.isRegisterMbeans = true;
        hikariDataSource12.setMaximumPoolSize(12);
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
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        int int21 = hikariDataSource12.getAcquireIncrement();
        hikariDataSource12.setMaximumPoolSize(4);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
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
        org.junit.Assert.assertNotNull(simpleLogger11);
        org.junit.Assert.assertNotNull(hikariConfig12);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.acquireIncrement = 2;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter16.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter16.deserializeObjectHikariDataSource9();
        hikariDataSource20.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource20.setMaximumPoolSize((int) '#');
        boolean boolean25 = hikariDataSource20.isJdbc4connectionTest;
        boolean boolean26 = hikariDataSource20.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-32", (java.lang.Object) hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig10.dataSourceClassName = "HikariPool-22";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTestQuery = "SELECT 1";
        boolean boolean11 = hikariConfig1.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = hikariDataSource3.serializedObjectSupporter;
        hikariDataSource3.setminPoolSize(0);
        java.lang.String str7 = hikariDataSource3.getDataSourceClassName();
        int int8 = hikariDataSource3.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setConnectionCustomizerClassName("SELECT 1");
        long long6 = hikariConfig1.getConnectionTimeout();
        long long7 = hikariConfig1.getIDLE_TIMEOUT();
        hikariConfig1.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        boolean boolean10 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter19.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter19.deserializeObjectHikariDataSource2();
        boolean boolean22 = hikariDataSource21.getisReadOnly();
        java.util.Properties properties23 = hikariDataSource21.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig16.dataSourceProperties = properties23;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str13, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        java.lang.String str27 = hikariDataSource17.jdbcUrl;
        boolean boolean28 = hikariDataSource17.isRegisterMbeans;
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        long long7 = hikariConfig1.idleTimeout;
        int int8 = hikariConfig1.acquireRetries;
        hikariConfig1.dataSourceClassName = "HikariPool-28";
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.zaxxer.hikari.HikariConfig.poolNumber = '4';
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
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
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.dataSourceClassName = "VALUES 1";
        java.lang.String str7 = hikariDataSource1.getCatalog();
        hikariDataSource1.acquireRetryDelay = 22;
        boolean boolean10 = hikariDataSource1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        int int4 = hikariConfig1.getmaxPoolSize();
        hikariConfig1.setCatalog("HikariPool-33");
        int int7 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setLeakDetectionThreshold((long) 41);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str6 = hikariDataSource5.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        hikariDataSource12.setDataSourceClassName("HikariPool-33");
        hikariDataSource12.isInitializationFailFast = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int9 = hikariConfig8.maxPoolSize;
        java.lang.String str10 = hikariConfig8.catalog;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        java.lang.String str27 = hikariDataSource17.poolName;
        hikariDataSource17.setisJdbc4connectionTest(false);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-28" + "'", str27, "HikariPool-28");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = true;
        int int11 = hikariConfig1.transactionIsolation;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.jdbcUrl = "HikariPool-19";
        boolean boolean15 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        hikariConfig15.setIsolateInternalQueries(true);
        int int18 = hikariConfig15.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        hikariDataSource16.setRegisterMbeans(false);
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        hikariDataSource16.catalog = "hi!";
        long long19 = hikariDataSource16.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource16();
        hikariDataSource21.catalog = "hi!";
        long long24 = hikariDataSource21.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter25.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource28 = hikariDataSource27.dataSource;
        hikariDataSource21.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource27);
        hikariDataSource16.setDataSource((javax.sql.DataSource) hikariDataSource27);
        java.lang.String str31 = hikariDataSource27.getJdbcUrl();
        java.lang.String str32 = hikariDataSource27.poolName;
        hikariDataSource1.dataSource = hikariDataSource27;
        long long34 = hikariDataSource27.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-28" + "'", str32, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        long long12 = hikariDataSource10.getACQUIRE_RETRY_DELAY();
        hikariDataSource10.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str9 = hikariDataSource8.getConnectionTestQuery();
        long long10 = hikariDataSource8.maxLifetime;
        long long11 = hikariDataSource8.getAcquireRetryDelay();
        hikariDataSource8.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource40 = serializedObjectSupporter38.deserializeObjectHikariDataSource10();
        hikariDataSource40.connectionTestQuery = "HikariPool-6";
        hikariDataSource40.setisIsolateInternalQueries(true);
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
        org.junit.Assert.assertNotNull(hikariDataSource40);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        long long8 = hikariConfig1.getConnectionTimeout();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.transactionIsolationName = "hi!";
        boolean boolean7 = hikariDataSource3.isAutoCommit();
        long long8 = hikariDataSource3.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = hikariDataSource6.catalog;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        long long6 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.connectionTimeout = 'a';
        long long9 = hikariConfig1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setConnectionTimeout(600000L);
        hikariDataSource2.setJdbc4ConnectionTest(false);
        int int9 = hikariDataSource2.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.getisInitializationFailFast();
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long19 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 22L + "'", long19 == 22L);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        hikariDataSource1.validate();
        hikariDataSource1.setLeakDetectionThreshold((long) 4);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(hikariConfig16);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        hikariDataSource1.connectionTimeout = 0;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireIncrement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig6.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        hikariDataSource1.isInitializationFailFast = false;
        hikariDataSource1.poolName = "HikariPool-19";
        int int9 = hikariDataSource1.getminPoolSize();
        hikariDataSource1.setCatalog("HikariPool-15");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setpoolNumber(0);
        int int10 = hikariConfig6.getMinimumPoolSize();
        hikariConfig6.setisRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        long long14 = hikariConfig1.getIDLE_TIMEOUT();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str16 = hikariConfig1.poolName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter17.deserializeObjectHikariConfig2();
        hikariConfig18.poolName = "";
        boolean boolean21 = hikariConfig18.getisJdbc4connectionTest();
        hikariConfig18.setisRegisterMbeans(false);
        hikariConfig18.setTransactionIsolation("HikariPool-28");
        hikariConfig18.transactionIsolationName = "HikariPool-32";
        boolean boolean28 = hikariConfig18.isIsolateInternalQueries;
        hikariConfig1.copyState(hikariConfig18);
        boolean boolean30 = hikariConfig18.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SELECT 1" + "'", str15, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig3.setisIsolateInternalQueries(true);
        hikariConfig3.setisReadOnly(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = hikariConfig3.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        long long8 = hikariDataSource7.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        boolean boolean5 = hikariDataSource1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter17.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter17.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter17.deserializeObjectHikariDataSource8();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter17.deserializeObjectHikariDataSource1();
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource22);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-33" + "'", str21, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource22);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str4 = hikariDataSource3.poolName;
        long long5 = hikariDataSource3.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str2, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-0" + "'", str4, "HikariPool-0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        hikariDataSource12.setisInitializationFailFast(false);
        hikariDataSource12.isInitializationFailFast = false;
        int int21 = hikariDataSource12.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        int int8 = hikariConfig7.acquireIncrement;
        hikariConfig7.setisReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long9 = hikariDataSource8.maxLifetime;
        boolean boolean10 = hikariDataSource8.getisInitializationFailFast();
        hikariDataSource8.setCatalog("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        long long6 = hikariConfig2.getLeakDetectionThreshold();
        long long7 = hikariConfig2.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig2.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.settransactionIsolationName("HikariPool-30");
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.leakDetectionThreshold = 10L;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetryDelay((long) 3);
        long long7 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setminPoolSize(29);
        hikariDataSource1.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setConnectionTimeout(600000L);
        long long7 = hikariDataSource2.acquireRetryDelay;
        java.lang.String str8 = hikariDataSource2.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "VALUES 1" + "'", str8, "VALUES 1");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        boolean boolean16 = hikariConfig15.getisRegisterMbeans();
        long long17 = hikariConfig15.maxLifetime;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter11.deserializeObjectHikariDataSource4();
        java.lang.String str19 = hikariDataSource18.gettransactionIsolationName();
        hikariDataSource18.setisReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-32" + "'", str14, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.getJdbcUrl();
        boolean boolean5 = hikariConfig3.getisRegisterMbeans();
        boolean boolean6 = hikariConfig3.getisJdbc4connectionTest();
        hikariConfig3.setIdleTimeout((long) 2);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        long long4 = hikariConfig1.getIDLE_TIMEOUT();
        boolean boolean5 = hikariConfig1.isAutoCommit();
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        long long7 = hikariConfig1.getIdleTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.lang.String str13 = serializedObjectSupporter8.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        java.lang.String str15 = serializedObjectSupporter8.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties17 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32" + "'", str11, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SELECT 1" + "'", str15, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(hikariConfig18);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        boolean boolean7 = hikariDataSource1.getisRegisterMbeans();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter8.deserializeObjectHikariDataSource6();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource12);
        boolean boolean14 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.maxPoolSize = ' ';
        boolean boolean17 = hikariDataSource1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        long long33 = hikariDataSource20.getIDLE_TIMEOUT();
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 600000L + "'", long33 == 600000L);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.poolName = "HikariPool-28";
        int int5 = hikariDataSource1.acquireRetries;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setConnectionTimeout((long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        javax.sql.DataSource dataSource8 = hikariDataSource7.getDataSource();
        java.lang.String str9 = hikariDataSource7.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        int int9 = hikariDataSource8.acquireIncrement;
        java.util.Properties properties10 = hikariDataSource8.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setUser");
        } catch (java.lang.RuntimeException e) {
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.catalog = "";
        boolean boolean6 = hikariConfig2.getisInitializationFailFast();
        hikariConfig2.setRegisterMbeans(true);
        hikariConfig2.setisIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        hikariConfig12.settransactionIsolationName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter16.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter16.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter16.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter16.deserializeObjectHikariDataSource8();
        boolean boolean21 = hikariDataSource20.getisJdbc4connectionTest();
        java.lang.String str22 = hikariDataSource20.connectionTestQuery;
        hikariDataSource20.connectionTestQuery = "HikariPool-28";
        hikariDataSource15.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertNotNull(hikariConfig18);
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "VALUES 1" + "'", str22, "VALUES 1");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        boolean boolean4 = hikariDataSource3.isInitializationFailFast;
        java.lang.String str5 = hikariDataSource3.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource5.setCatalog("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter5.deserializeObjectHikariDataSource2();
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
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        hikariDataSource2.setDataSourceClassName("HikariPool-33");
        hikariDataSource2.setIsolateInternalQueries(true);
        hikariDataSource2.setUseInstrumentation(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        hikariConfig6.setIsolateInternalQueries(true);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-5" + "'", str39, "HikariPool-5");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        int int5 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setConnectionTestQuery("");
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        java.lang.String str9 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        long long5 = hikariDataSource3.getLeakDetectionThreshold();
        hikariDataSource3.setMaximumPoolSize(5);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.lang.String str13 = serializedObjectSupporter8.deserializeObjectString5();
        java.lang.String str14 = serializedObjectSupporter8.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter8.deserializeObjectHikariDataSource10();
        java.lang.String str16 = hikariDataSource15.connectionCustomizerClassName;
        hikariDataSource3.dataSource = hikariDataSource15;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-32" + "'", str11, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SELECT 1" + "'", str14, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
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
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        hikariConfig3.setisReadOnly(false);
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
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource11.setMinimumPoolSize(38);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str8, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        java.lang.String str17 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setisAutoCommit(false);
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean7 = hikariConfig6.isIsolateInternalQueries;
        hikariConfig6.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = hikariDataSource3.serializedObjectSupporter;
        java.lang.String str5 = hikariDataSource3.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-13" + "'", str5, "HikariPool-13");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
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
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        hikariDataSource1.setAcquireRetryDelay((long) 1);
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
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties3 = hikariDataSource2.dataSourceProperties;
        hikariDataSource2.setisReadOnly(true);
        hikariDataSource2.setRegisterMbeans(true);
        hikariDataSource2.setisReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        hikariConfig1.jdbcUrl = "HikariPool-6";
        boolean boolean8 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.isIsolateInternalQueries = true;
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setIdleTimeout(0L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        hikariDataSource2.isRegisterMbeans = false;
        java.lang.String str6 = hikariDataSource2.connectionCustomizerClassName;
        java.util.Properties properties7 = hikariDataSource2.getDataSourceProperties();
        hikariDataSource2.jdbcUrl = "TRANSACTION_REPEATABLE_READ";
        hikariDataSource2.isJdbc4connectionTest = true;
        boolean boolean12 = hikariDataSource2.isRegisterMbeans;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource5.transactionIsolationName = "HikariPool-6";
        hikariDataSource5.setPoolName("com.zaxxer.hikari.mocks.StubDataSource");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig2();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.catalog = "";
        java.util.Properties properties16 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariDataSource5.dataSourceProperties = properties16;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        hikariDataSource2.setUseInstrumentation(true);
        long long20 = hikariDataSource2.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariDataSource2.getConnectionCustomizer();
        java.lang.String str22 = hikariDataSource2.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(simpleLogger10);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        int int5 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAutoCommit(false);
        boolean boolean8 = hikariConfig1.getisInitializationFailFast();
        boolean boolean9 = hikariConfig1.getisIsolateInternalQueries();
        int int10 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        boolean boolean4 = hikariDataSource1.isInitializationFailFast;
        long long5 = hikariDataSource1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        hikariConfig1.connectionTestQuery = "HikariPool-33";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        hikariConfig4.addDataSourceProperty("hi!", (java.lang.Object) hikariDataSource7);
        long long9 = hikariConfig4.getACQUIRE_RETRY_DELAY();
        java.lang.String str10 = hikariConfig4.getConnectionInitSql();
        hikariConfig4.setRegisterMbeans(true);
        long long13 = hikariConfig4.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.setConnectionInitSql("VALUES 1");
        hikariConfig4.transactionIsolationName = "HikariPool-5";
        hikariConfig4.setMaxLifetime((long) (byte) -1);
        hikariConfig4.setRegisterMbeans(true);
        hikariConfig4.setMaxLifetime((long) 100);
        int int15 = hikariConfig4.minPoolSize;
        long long16 = hikariConfig4.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str4 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.catalog = "SELECT 1";
        int int7 = hikariDataSource3.getminPoolSize();
        long long8 = hikariDataSource3.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariDataSource3.getConnectionCustomizer();
        hikariDataSource3.setpoolNumber(53);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        java.lang.String str14 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        boolean boolean8 = hikariConfig3.isJdbc4connectionTest;
        hikariConfig3.setIdleTimeout((long) 2);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource14 = hikariDataSource13.dataSource;
        int int15 = hikariDataSource13.maxPoolSize;
        boolean boolean16 = hikariDataSource13.isJdbc4ConnectionTest();
        int int17 = hikariDataSource13.maxPoolSize;
        hikariConfig3.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource13);
        boolean boolean19 = hikariDataSource13.getisJdbc4connectionTest();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = hikariDataSource13.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        int int5 = hikariDataSource4.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.String str21 = serializedObjectSupporter10.deserializeObjectString8();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-33" + "'", str21, "HikariPool-33");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        hikariDataSource8.setminPoolSize((int) (short) 1);
        hikariDataSource8.validate();
        boolean boolean12 = hikariDataSource8.isJdbc4connectionTest;
        int int13 = hikariDataSource8.getMinimumPoolSize();
        boolean boolean14 = hikariDataSource8.getisInitializationFailFast();
        hikariDataSource8.setpoolNumber(22);
        hikariDataSource8.setAcquireRetries((int) (byte) 1);
        hikariConfig6.dataSource = hikariDataSource8;
        hikariDataSource8.connectionCustomizerClassName = "HikariPool-28";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        hikariDataSource12.dataSourceClassName = "HikariPool-32";
        hikariDataSource12.isReadOnly = false;
        hikariDataSource12.setConnectionCustomizerClassName("");
        hikariDataSource12.setminPoolSize(10);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource4.minPoolSize = 35;
        int int7 = hikariDataSource4.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        java.lang.String str6 = hikariDataSource1.getConnectionInitSql();
        hikariDataSource1.leakDetectionThreshold = 13;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        hikariConfig1.dataSourceClassName = "SELECT 1";
        hikariConfig1.setisJdbc4connectionTest(true);
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setisIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.setMinimumPoolSize(31);
        int int7 = hikariDataSource3.getmaxPoolSize();
        java.lang.String str8 = hikariDataSource3.connectionCustomizerClassName;
        boolean boolean9 = hikariDataSource3.getisJdbc4connectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        hikariDataSource1.isInitializationFailFast = false;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = (byte) -1;
        int int10 = hikariDataSource1.acquireIncrement;
        hikariDataSource1.connectionCustomizerClassName = "";
        hikariDataSource1.setConnectionInitSql("SELECT 1");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        hikariDataSource16.catalog = "hi!";
        long long19 = hikariDataSource16.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource16();
        hikariDataSource21.catalog = "hi!";
        long long24 = hikariDataSource21.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter25.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource28 = hikariDataSource27.dataSource;
        hikariDataSource21.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource27);
        hikariDataSource16.setDataSource((javax.sql.DataSource) hikariDataSource27);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter31 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter31.deserializeObjectHikariDataSource16();
        java.lang.String str33 = hikariDataSource32.poolName;
        hikariDataSource32.setisReadOnly(true);
        hikariDataSource27.setDataSource((javax.sql.DataSource) hikariDataSource32);
        hikariDataSource32.setIsolateInternalQueries(false);
        long long39 = hikariDataSource32.getLeakDetectionThreshold();
        hikariDataSource32.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter42 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource43 = serializedObjectSupporter42.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource44 = serializedObjectSupporter42.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource45 = serializedObjectSupporter42.deserializeObjectHikariDataSource17();
        hikariDataSource45.maxLifetime = 0L;
        hikariDataSource45.setisReadOnly(true);
        hikariDataSource45.transactionIsolationName = "hi!";
        hikariDataSource32.setDataSource((javax.sql.DataSource) hikariDataSource45);
        hikariDataSource1.setDataSource((javax.sql.DataSource) hikariDataSource45);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariDataSource27);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNotNull(hikariDataSource32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-28" + "'", str33, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource43);
        org.junit.Assert.assertNotNull(hikariDataSource44);
        org.junit.Assert.assertNotNull(hikariDataSource45);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireIncrement = (short) 0;
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        hikariConfig12.acquireRetryDelay = 0;
        hikariConfig12.idleTimeout = 0L;
        hikariConfig12.setConnectionTestQuery("");
        java.lang.String str19 = hikariConfig12.connectionCustomizerClassName;
        hikariConfig1.copyState(hikariConfig12);
        java.lang.String str21 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str21, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.util.Properties properties3 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource2.transactionIsolation = (-1);
        hikariDataSource2.isReadOnly = true;
        int int7 = hikariDataSource2.getAcquireRetries();
        hikariDataSource2.setJdbc4ConnectionTest(true);
        hikariDataSource2.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str4 = hikariDataSource3.getPoolName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-18" + "'", str4, "HikariPool-18");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource4.setMaximumPoolSize((int) '#');
        boolean boolean9 = hikariDataSource4.isJdbc4connectionTest;
        long long10 = hikariDataSource4.idleTimeout;
        hikariDataSource4.setCatalog("");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        java.lang.String str10 = hikariDataSource1.jdbcUrl;
        long long11 = hikariDataSource1.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        hikariDataSource17.isReadOnly = true;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str23 = hikariConfig22.getConnectionCustomizerClassName();
        java.lang.String str24 = hikariConfig22.getConnectionTestQuery();
        hikariConfig22.isReadOnly = false;
        int int27 = hikariConfig22.getAcquireRetries();
        hikariConfig22.minPoolSize = '#';
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter30 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter30.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter30.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource33 = serializedObjectSupporter30.deserializeObjectHikariDataSource8();
        java.lang.String str34 = serializedObjectSupporter30.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource35 = serializedObjectSupporter30.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = serializedObjectSupporter30.deserializeObjectHikariConfig3();
        hikariConfig22.serializedObjectSupporter = serializedObjectSupporter30;
        hikariDataSource17.addDataSourceProperty("HikariPool-5", (java.lang.Object) serializedObjectSupporter30);
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
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(hikariDataSource31);
        org.junit.Assert.assertNotNull(hikariDataSource32);
        org.junit.Assert.assertNotNull(hikariDataSource33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-33" + "'", str34, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource35);
        org.junit.Assert.assertNotNull(hikariConfig36);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        hikariConfig8.isRegisterMbeans = false;
        hikariConfig8.setisAutoCommit(true);
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
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        long long18 = hikariDataSource15.leakDetectionThreshold;
        hikariDataSource15.catalog = "HikariPool-11";
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig9.setDataSourceClassName("HikariPool-17");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isReadOnly = false;
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.minPoolSize = '#';
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource8();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter9.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str17 = serializedObjectSupporter9.deserializeObjectString4();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-33" + "'", str13, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str17, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        hikariDataSource8.setConnectionTestQuery("");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties3 = hikariDataSource2.dataSourceProperties;
        hikariDataSource2.setisReadOnly(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariDataSource2.connectionCustomizer;
        boolean boolean7 = hikariDataSource2.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig7.connectionCustomizer;
        hikariConfig7.jdbcUrl = "HikariPool-22";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        hikariDataSource2.setAcquireIncrement((int) ' ');
        long long7 = hikariDataSource2.getCONNECTION_TIMEOUT();
        int int8 = hikariDataSource2.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        long long11 = hikariDataSource10.getConnectionTimeout();
        long long12 = hikariDataSource10.getCONNECTION_TIMEOUT();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource10.setConnectionTimeout((long) 25);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource9();
        java.util.Properties properties17 = hikariDataSource16.getDataSourceProperties();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter18.deserializeObjectHikariConfig2();
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter18.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter18.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter18.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter18.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        hikariDataSource16.serializedObjectSupporter = serializedObjectSupporter18;
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
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(hikariConfig19);
        org.junit.Assert.assertNotNull(hikariConfig20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str21, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource22);
        org.junit.Assert.assertNotNull(hikariDataSource23);
        org.junit.Assert.assertNotNull(hikariConfig24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertNotNull(hikariConfig27);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        hikariConfig10.setisAutoCommit(false);
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
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int8 = hikariConfig7.getminPoolSize();
        long long9 = hikariConfig7.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean10 = hikariDataSource9.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.getJdbcUrl();
        hikariConfig3.leakDetectionThreshold = 1;
        int int7 = hikariConfig3.getTransactionIsolation();
        long long8 = hikariConfig3.maxLifetime;
        java.lang.String str9 = hikariConfig3.getCatalog();
        hikariConfig3.setAcquireRetryDelay((long) 4);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource2.isIsolateInternalQueries = true;
        java.lang.String str5 = hikariDataSource2.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SELECT 1" + "'", str10, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig11);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        int int4 = hikariConfig1.getmaxPoolSize();
        int int5 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.maxPoolSize = (short) 10;
        long long8 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        hikariConfig10.setpoolNumber(39);
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
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        int int6 = hikariConfig1.acquireIncrement;
        hikariConfig1.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig1.transactionIsolation = 8;
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setmaxPoolSize(59);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int3 = hikariConfig2.getAcquireRetries();
        hikariConfig2.transactionIsolationName = "SELECT 1";
        hikariConfig2.setisJdbc4connectionTest(true);
        hikariConfig2.connectionInitSql = "HikariPool-18";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        int int6 = hikariDataSource3.acquireRetries;
        hikariDataSource3.setAcquireRetryDelay((long) 29);
        boolean boolean9 = hikariDataSource3.isReadOnly;
        int int10 = hikariDataSource3.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long9 = hikariDataSource8.maxLifetime;
        boolean boolean10 = hikariDataSource8.getisInitializationFailFast();
        boolean boolean11 = hikariDataSource8.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.setMinimumPoolSize(31);
        int int7 = hikariDataSource3.getmaxPoolSize();
        java.lang.String str8 = hikariDataSource3.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        hikariDataSource17.acquireRetries = 10;
        java.lang.String str29 = hikariDataSource17.getCatalog();
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
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter5.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter5.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource8 = hikariDataSource7.dataSource;
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        java.lang.String str10 = hikariDataSource1.dataSourceClassName;
        boolean boolean11 = hikariDataSource1.isReadOnly;
        java.lang.String str12 = hikariDataSource1.getCatalog();
        hikariDataSource1.connectionInitSql = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource7.isJdbc4connectionTest = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.setisInitializationFailFast(false);
        hikariDataSource2.setConnectionTimeout(600000L);
        long long7 = hikariDataSource2.acquireRetryDelay;
        boolean boolean8 = hikariDataSource2.getisIsolateInternalQueries();
        hikariDataSource2.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        hikariDataSource2.setLeakDetectionThreshold(1L);
        java.util.Properties properties5 = hikariDataSource2.getDataSourceProperties();
        hikariDataSource2.transactionIsolationName = "TRANSACTION_REPEATABLE_READ";
        int int8 = hikariDataSource2.getTransactionIsolation();
        hikariDataSource2.leakDetectionThreshold = 0L;
        hikariDataSource2.transactionIsolation = 55;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource9.transactionIsolationName = "HikariPool-0";
        boolean boolean12 = hikariDataSource9.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str8, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int8 = hikariDataSource7.getAcquireIncrement();
        hikariDataSource7.leakDetectionThreshold = 24;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        boolean boolean8 = hikariConfig6.isAutoCommit();
        hikariConfig6.isRegisterMbeans = true;
        hikariConfig6.setDataSourceClassName("HikariPool-20");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        boolean boolean16 = hikariConfig13.getisIsolateInternalQueries();
        boolean boolean17 = hikariConfig13.getisInitializationFailFast();
        hikariConfig13.settransactionIsolationName("SELECT 1");
        long long20 = hikariConfig13.connectionTimeout;
        hikariConfig13.dataSourceClassName = "HikariPool-4";
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        boolean boolean25 = hikariDataSource17.isAutoCommit();
        hikariDataSource17.isAutoCommit = false;
        javax.sql.DataSource dataSource28 = hikariDataSource17.getDataSource();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter29 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter29.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter29.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter29.deserializeObjectHikariDataSource12();
        java.lang.String str33 = hikariDataSource32.dataSourceClassName;
        hikariDataSource32.catalog = "SELECT 1";
        int int36 = hikariDataSource32.getminPoolSize();
        hikariDataSource32.isJdbc4connectionTest = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter39 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource40 = serializedObjectSupporter39.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource41 = serializedObjectSupporter39.deserializeObjectHikariDataSource3();
        java.lang.String str42 = hikariDataSource41.connectionInitSql;
        boolean boolean43 = hikariDataSource41.isIsolateInternalQueries();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter44 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = serializedObjectSupporter44.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig46 = serializedObjectSupporter44.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource47 = serializedObjectSupporter44.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = serializedObjectSupporter44.deserializeObjectHikariConfig3();
        hikariDataSource41.serializedObjectSupporter = serializedObjectSupporter44;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = serializedObjectSupporter44.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig51 = serializedObjectSupporter44.deserializeObjectHikariConfig1();
        hikariDataSource32.serializedObjectSupporter = serializedObjectSupporter44;
        hikariDataSource17.dataSource = hikariDataSource32;
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNotNull(hikariDataSource30);
        org.junit.Assert.assertNotNull(hikariDataSource31);
        org.junit.Assert.assertNotNull(hikariDataSource32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource40);
        org.junit.Assert.assertNotNull(hikariDataSource41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(hikariConfig45);
        org.junit.Assert.assertNotNull(hikariConfig46);
        org.junit.Assert.assertNotNull(hikariDataSource47);
        org.junit.Assert.assertNotNull(hikariConfig48);
        org.junit.Assert.assertNotNull(hikariConfig50);
        org.junit.Assert.assertNotNull(hikariConfig51);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig6.setmaxPoolSize(39);
        boolean boolean9 = hikariConfig6.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SELECT 1" + "'", str9, "SELECT 1");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        hikariConfig6.maxPoolSize = 60;
        java.util.Properties properties10 = hikariConfig6.getDataSourceProperties();
        hikariDataSource1.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        boolean boolean13 = hikariDataSource1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        boolean boolean21 = hikariDataSource15.isInitializationFailFast;
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        java.lang.String str17 = serializedObjectSupporter10.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter10.deserializeObjectHikariDataSource12();
        hikariDataSource9.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource18);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-6" + "'", str17, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource18);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        boolean boolean15 = hikariDataSource3.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean7 = hikariConfig6.isReadOnly();
        hikariConfig6.idleTimeout = 8;
        hikariConfig6.setConnectionCustomizerClassName("HikariPool-4");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        boolean boolean14 = hikariDataSource3.isRegisterMbeans();
        hikariDataSource3.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.setisAutoCommit(false);
        hikariDataSource1.connectionInitSql = "HikariPool-4";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        hikariDataSource12.setTransactionIsolation("HikariPool-28");
        long long19 = hikariDataSource12.getACQUIRE_RETRY_DELAY();
        int int20 = hikariDataSource12.getminPoolSize();
        boolean boolean21 = hikariDataSource12.isIsolateInternalQueries();
        hikariDataSource12.setConnectionCustomizerClassName("HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        javax.sql.DataSource dataSource6 = hikariDataSource5.getDataSource();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        hikariConfig3.jdbcUrl = "VALUES 1";
        boolean boolean8 = hikariConfig3.isRegisterMbeans;
        int int9 = hikariConfig3.getMaximumPoolSize();
        hikariConfig3.maxLifetime = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig3.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig2.setAutoCommit(true);
        long long5 = hikariConfig2.connectionTimeout;
        hikariConfig2.setMaxLifetime((long) 4);
        hikariConfig2.setAutoCommit(true);
        boolean boolean10 = hikariConfig2.isReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter18.deserializeObjectHikariConfig3();
        long long27 = hikariConfig26.getCONNECTION_TIMEOUT();
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
        org.junit.Assert.assertNotNull(hikariConfig26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setInitializationFailFast(true);
        hikariDataSource2.setisIsolateInternalQueries(false);
        boolean boolean7 = hikariDataSource2.isJdbc4connectionTest;
        long long8 = hikariDataSource2.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        hikariDataSource1.isInitializationFailFast = false;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = (byte) -1;
        int int10 = hikariDataSource1.acquireIncrement;
        hikariDataSource1.connectionCustomizerClassName = "";
        hikariDataSource1.setAcquireRetries(52);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig4.setDriverClassName("HikariPool-13");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-13' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        boolean boolean7 = hikariDataSource1.getisRegisterMbeans();
        hikariDataSource1.setisJdbc4connectionTest(false);
        javax.sql.DataSource dataSource10 = hikariDataSource1.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
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
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str13, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
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
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        int int21 = hikariDataSource12.getAcquireIncrement();
        int int22 = hikariDataSource12.maxPoolSize;
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        hikariDataSource12.setTransactionIsolation("HikariPool-28");
        hikariDataSource12.setRegisterMbeans(false);
        hikariDataSource12.isRegisterMbeans = true;
        boolean boolean23 = hikariDataSource12.isReadOnly();
        boolean boolean24 = hikariDataSource12.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource4.setCatalog("HikariPool-28");
        hikariDataSource4.setAcquireIncrement(22);
        hikariDataSource4.poolName = "HikariPool-33";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource9();
        hikariDataSource13.acquireIncrement = '#';
        int int16 = hikariDataSource13.getAcquireIncrement();
        hikariDataSource13.connectionTestQuery = "HikariPool-32";
        hikariDataSource13.setpoolNumber(1);
        boolean boolean21 = hikariDataSource13.isAutoCommit;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString6();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString3();
        hikariDataSource13.addDataSourceProperty("HikariPool-19", (java.lang.Object) serializedObjectSupporter23);
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter23.deserializeObjectHikariDataSource15();
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource29);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(hikariConfig24);
        org.junit.Assert.assertNotNull(hikariDataSource25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str26, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-6" + "'", str27, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource29);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        int int5 = hikariDataSource4.maxPoolSize;
        boolean boolean6 = hikariDataSource4.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.transactionIsolationName = "hi!";
        hikariDataSource3.setRegisterMbeans(false);
        java.lang.String str9 = hikariDataSource3.catalog;
        boolean boolean10 = hikariDataSource3.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter11.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-33" + "'", str16, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig17);
        org.junit.Assert.assertNotNull(hikariDataSource18);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        hikariConfig1.settransactionIsolationName("HikariPool-33");
        boolean boolean16 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        int int5 = hikariDataSource4.maxPoolSize;
        hikariDataSource4.setInitializationFailFast(true);
        hikariDataSource4.connectionTimeout = 35;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long7 = hikariConfig1.acquireRetryDelay;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.transactionIsolation = 9;
        hikariConfig1.transactionIsolationName = "HikariPool-0";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = hikariConfig3.getJdbcUrl();
        hikariConfig3.leakDetectionThreshold = 1;
        int int7 = hikariConfig3.getTransactionIsolation();
        java.lang.String str8 = hikariConfig3.getPoolName();
        hikariConfig3.setMinimumPoolSize(59);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.transactionIsolationName = "hi!";
        hikariDataSource3.setRegisterMbeans(false);
        boolean boolean9 = hikariDataSource3.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        int int24 = hikariConfig1.getAcquireRetries();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        hikariDataSource1.setConnectionCustomizerClassName("hi!");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.lang.String str17 = hikariDataSource12.poolName;
        hikariDataSource12.jdbcUrl = "hi!";
        java.lang.String str20 = hikariDataSource12.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-28" + "'", str17, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-28" + "'", str20, "HikariPool-28");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        boolean boolean21 = hikariDataSource17.isJdbc4connectionTest;
        hikariDataSource17.setMaxLifetime((long) 23);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SELECT 1" + "'", str8, "SELECT 1");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        int int18 = hikariConfig6.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisAutoCommit();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setminPoolSize((int) (short) 1);
        hikariConfig1.leakDetectionThreshold = 9;
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        hikariConfig1.maxPoolSize = (byte) 0;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        long long12 = hikariConfig10.getIDLE_TIMEOUT();
        hikariConfig10.setisRegisterMbeans(true);
        boolean boolean15 = hikariConfig10.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource4.setMaxLifetime((long) 0);
        long long9 = hikariDataSource4.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig3.transactionIsolationName = "HikariPool-20";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter13.deserializeObjectHikariConfig2();
        hikariConfig14.acquireRetryDelay = 0;
        hikariConfig14.idleTimeout = 0L;
        hikariConfig14.setConnectionTestQuery("");
        java.util.Properties properties21 = hikariConfig14.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties21;
        hikariConfig11.setIsolateInternalQueries(true);
        boolean boolean25 = hikariConfig11.isIsolateInternalQueries();
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
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        int int4 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setJdbc4ConnectionTest(false);
        java.lang.String str7 = hikariDataSource1.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource3 = hikariDataSource2.dataSource;
        hikariDataSource2.setpoolNumber(19);
        hikariDataSource2.setConnectionTestQuery("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariConfig5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
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
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource5.acquireRetries = 31;
        long long8 = hikariDataSource5.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.poolName = "HikariPool-28";
        hikariDataSource1.connectionTimeout = 100;
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.setConnectionInitSql("HikariPool-6");
        hikariDataSource1.setisAutoCommit(true);
        java.util.Properties properties12 = hikariDataSource1.getDataSourceProperties();
        int int13 = hikariDataSource1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-5");
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource6.setJdbcUrl("");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str12 = hikariConfig11.jdbcUrl;
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter10.deserializeObjectHikariConfig1();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        java.lang.String str15 = serializedObjectSupporter10.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        java.util.Properties properties17 = serializedObjectSupporter10.deserializeObjectProperties1();
        hikariConfig9.setDataSourceProperties(properties17);
        int int19 = hikariConfig9.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-32" + "'", str13, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SELECT 1" + "'", str15, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource16();
        java.lang.String str5 = hikariDataSource4.poolName;
        hikariDataSource2.dataSource = hikariDataSource4;
        hikariDataSource4.setMaximumPoolSize((int) (byte) 10);
        java.lang.String str9 = hikariDataSource4.catalog;
        long long10 = hikariDataSource4.getConnectionTimeout();
        hikariDataSource4.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-32" + "'", str9, "HikariPool-32");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.catalog = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        hikariDataSource1.setMaxLifetime(600000L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource4.setCatalog("HikariPool-28");
        hikariDataSource4.setDataSourceClassName("VALUES 1");
        hikariDataSource4.catalog = "HikariPool-24";
        hikariDataSource4.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str1, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-6" + "'", str2, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTestQuery = "SELECT 1";
        hikariConfig1.setisRegisterMbeans(true);
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAcquireRetries((int) (short) 1);
        long long16 = hikariConfig1.getConnectionTimeout();
        long long17 = hikariConfig1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SELECT 1" + "'", str13, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        boolean boolean3 = hikariDataSource2.isReadOnly;
        hikariDataSource2.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = (short) 100;
        int int13 = hikariConfig1.minPoolSize;
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        int int15 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-33" + "'", str6, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        int int3 = hikariDataSource1.minPoolSize;
        java.lang.String str4 = hikariDataSource1.getPoolName();
        java.lang.String str5 = hikariDataSource1.getPoolName();
        hikariDataSource1.isJdbc4connectionTest = false;
        java.util.Properties properties8 = hikariDataSource1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.getPoolName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28" + "'", str4, "HikariPool-28");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-28" + "'", str5, "HikariPool-28");
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-20" + "'", str10, "HikariPool-20");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        int int11 = hikariDataSource6.getpoolNumber();
        java.lang.String str12 = hikariDataSource6.transactionIsolationName;
        hikariDataSource6.setIdleTimeout((long) (byte) 10);
        hikariDataSource6.setReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
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
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.setisReadOnly(true);
        long long5 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str6 = hikariDataSource1.getJdbcUrl();
        int int7 = hikariDataSource1.getMaximumPoolSize();
        long long8 = hikariDataSource1.maxLifetime;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        java.lang.String str10 = hikariDataSource1.jdbcUrl;
        boolean boolean11 = hikariDataSource1.isInitializationFailFast();
        boolean boolean12 = hikariDataSource1.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-6" + "'", str12, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig13);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        javax.sql.DataSource dataSource6 = hikariDataSource1.dataSource;
        hikariDataSource1.connectionCustomizerClassName = "SELECT 1";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariDataSource1.connectionCustomizer;
        long long10 = hikariDataSource1.getConnectionTimeout();
        javax.sql.DataSource dataSource11 = hikariDataSource1.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        hikariDataSource3.setisReadOnly(true);
        boolean boolean8 = hikariDataSource3.isInitializationFailFast;
        java.lang.String str9 = hikariDataSource3.getConnectionTestQuery();
        hikariDataSource3.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        int int5 = hikariConfig4.maxPoolSize;
        long long6 = hikariConfig4.acquireRetryDelay;
        boolean boolean7 = hikariConfig4.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setMaximumPoolSize(60);
        hikariConfig1.setisJdbc4connectionTest(false);
        long long10 = hikariConfig1.acquireRetryDelay;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource16();
        java.lang.String str14 = hikariDataSource13.poolName;
        hikariDataSource13.setisReadOnly(true);
        long long17 = hikariDataSource13.getConnectionTimeout();
        boolean boolean18 = hikariDataSource13.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource16();
        hikariDataSource21.catalog = "hi!";
        long long24 = hikariDataSource21.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource16();
        hikariDataSource26.catalog = "hi!";
        long long29 = hikariDataSource26.getMAX_LIFETIME();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter30 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter30.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource32 = serializedObjectSupporter30.deserializeObjectHikariDataSource3();
        javax.sql.DataSource dataSource33 = hikariDataSource32.dataSource;
        hikariDataSource26.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource32);
        hikariDataSource21.setDataSource((javax.sql.DataSource) hikariDataSource32);
        java.lang.String str36 = hikariDataSource32.getJdbcUrl();
        hikariDataSource32.setAcquireRetries((int) '#');
        long long39 = hikariDataSource32.getCONNECTION_TIMEOUT();
        hikariDataSource13.addDataSourceProperty("", (java.lang.Object) hikariDataSource32);
        hikariConfig1.setDataSource((javax.sql.DataSource) hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28" + "'", str14, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(hikariDataSource21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1800000L + "'", long29 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource31);
        org.junit.Assert.assertNotNull(hikariDataSource32);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = 60;
        hikariConfig0.setisReadOnly(true);
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.acquireIncrement = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        long long12 = hikariConfig1.getMAX_LIFETIME();
        hikariConfig1.setminPoolSize((int) (byte) 0);
        int int15 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        boolean boolean10 = hikariConfig1.getisRegisterMbeans();
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        boolean boolean17 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionTestQuery = "SELECT 1";
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        int int12 = hikariConfig1.getMinimumPoolSize();
        boolean boolean13 = hikariConfig1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        boolean boolean4 = hikariDataSource2.isIsolateInternalQueries();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        boolean boolean6 = hikariDataSource2.getisAutoCommit();
        java.lang.String str7 = hikariDataSource2.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource4.acquireIncrement = 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
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
        hikariDataSource3.connectionInitSql = "VALUES 1";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        int int7 = hikariDataSource4.acquireRetries;
        hikariDataSource4.setAcquireRetryDelay((long) 12);
        hikariDataSource4.setRegisterMbeans(true);
        hikariDataSource4.setisRegisterMbeans(false);
        hikariDataSource4.isInitializationFailFast = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str6 = hikariConfig5.jdbcUrl;
        hikariConfig5.maxLifetime = 35;
        hikariConfig5.setisRegisterMbeans(true);
        hikariConfig5.leakDetectionThreshold = (byte) -1;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean5 = hikariDataSource4.getisJdbc4connectionTest();
        java.lang.String str6 = hikariDataSource4.connectionTestQuery;
        hikariDataSource4.connectionTestQuery = "HikariPool-28";
        java.lang.String str9 = hikariDataSource4.getPoolName();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15" + "'", str9, "HikariPool-15");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig2.setAutoCommit(true);
        int int5 = hikariConfig2.getAcquireRetries();
        java.lang.String str6 = hikariConfig2.getPoolName();
        hikariConfig2.validate();
        java.lang.String str8 = hikariConfig2.poolName;
        long long9 = hikariConfig2.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-6" + "'", str8, "HikariPool-6");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter14.deserializeObjectHikariConfig2();
        hikariConfig15.poolName = "";
        boolean boolean18 = hikariConfig15.getisJdbc4connectionTest();
        hikariConfig15.setisRegisterMbeans(false);
        hikariConfig15.maxPoolSize = 10;
        hikariConfig15.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig15.serializedObjectSupporter = serializedObjectSupporter25;
        java.lang.String str27 = serializedObjectSupporter25.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter25.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter25.deserializeObjectHikariDataSource14();
        hikariConfig2.addDataSourceProperty("HikariPool-15", (java.lang.Object) serializedObjectSupporter25);
        com.zaxxer.hikari.HikariDataSource hikariDataSource31 = serializedObjectSupporter25.deserializeObjectHikariDataSource16();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SELECT 1" + "'", str27, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig28);
        org.junit.Assert.assertNotNull(hikariDataSource29);
        org.junit.Assert.assertNotNull(hikariDataSource31);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        long long5 = hikariDataSource4.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        java.lang.String str6 = hikariConfig1.catalog;
        hikariConfig1.setmaxPoolSize(9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
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
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str7, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = hikariConfig0.serializedObjectSupporter;
        boolean boolean2 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.leakDetectionThreshold = 5;
        hikariConfig0.setConnectionInitSql("HikariPool-18");
        org.junit.Assert.assertNull(serializedObjectSupporter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setisJdbc4connectionTest(false);
        hikariConfig1.setIdleTimeout((long) 22);
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionCustomizerClassName = "";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 22L + "'", long9 == 22L);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        java.lang.String str14 = hikariDataSource1.dataSourceClassName;
        boolean boolean15 = hikariDataSource1.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str14, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.util.Properties properties3 = hikariDataSource2.dataSourceProperties;
        hikariDataSource2.setisReadOnly(true);
        boolean boolean6 = hikariDataSource2.getisRegisterMbeans();
        int int7 = hikariDataSource2.maxPoolSize;
        java.lang.String str8 = hikariDataSource2.getConnectionTestQuery();
        boolean boolean9 = hikariDataSource2.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "VALUES 1" + "'", str8, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        boolean boolean5 = hikariDataSource4.isIsolateInternalQueries();
        long long6 = hikariDataSource4.idleTimeout;
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.validate();
        boolean boolean5 = hikariDataSource1.isJdbc4connectionTest;
        int int6 = hikariDataSource1.getMinimumPoolSize();
        hikariDataSource1.setMaxLifetime(5000L);
        hikariDataSource1.setLeakDetectionThreshold((long) (short) 1);
        int int11 = hikariDataSource1.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource2.setAcquireIncrement((int) '#');
        java.lang.String str5 = hikariDataSource2.gettransactionIsolationName();
        hikariDataSource2.validate();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        int int4 = hikariDataSource3.getmaxPoolSize();
        hikariDataSource3.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.connectionTestQuery = "";
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.acquireIncrement = 4;
        boolean boolean9 = hikariConfig1.getisIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        hikariConfig1.transactionIsolationName = "HikariPool-32";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        int int15 = hikariConfig14.getAcquireRetries();
        hikariConfig1.copyState(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource4.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource4.setMaximumPoolSize((int) '#');
        boolean boolean9 = hikariDataSource4.isJdbc4connectionTest;
        boolean boolean10 = hikariDataSource4.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariDataSource4.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString8();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str11, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-33" + "'", str12, "HikariPool-33");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        hikariConfig1.connectionTestQuery = "hi!";
        hikariConfig1.maxLifetime = (short) -1;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        hikariConfig1.setisJdbc4connectionTest(true);
        long long14 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer2;
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.getisAutoCommit();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setminPoolSize((int) (short) 1);
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        java.lang.String str10 = hikariDataSource8.getPoolName();
        boolean boolean11 = hikariDataSource8.isInitializationFailFast;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-22" + "'", str10, "HikariPool-22");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource2.acquireIncrement = '#';
        hikariDataSource2.isInitializationFailFast = false;
        long long7 = hikariDataSource2.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariDataSource2.connectionCustomizer = iConnectionCustomizer8;
        java.lang.String str10 = hikariDataSource2.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        int int13 = hikariConfig1.maxPoolSize;
        int int14 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean4 = hikariDataSource3.isIsolateInternalQueries;
        hikariDataSource3.setConnectionTestQuery("TRANSACTION_REPEATABLE_READ");
        boolean boolean7 = hikariDataSource3.isRegisterMbeans();
        long long8 = hikariDataSource3.connectionTimeout;
        long long9 = hikariDataSource3.idleTimeout;
        hikariDataSource3.setJdbc4ConnectionTest(false);
        hikariDataSource3.dataSourceClassName = "HikariPool-4";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        hikariDataSource1.maxLifetime = (byte) 1;
        hikariDataSource1.setMaxLifetime(10L);
        hikariDataSource1.validate();
        boolean boolean9 = hikariDataSource1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig6.setJdbcUrl("HikariPool-20");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource2.dataSourceClassName = "HikariPool-28";
        boolean boolean5 = hikariDataSource2.isAutoCommit;
        boolean boolean6 = hikariDataSource2.getisInitializationFailFast();
        hikariDataSource2.transactionIsolationName = "HikariPool-28";
        hikariDataSource2.setReadOnly(false);
        int int11 = hikariDataSource2.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        boolean boolean4 = hikariConfig1.getisJdbc4connectionTest();
        hikariConfig1.setisRegisterMbeans(false);
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.jdbcUrl = "";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter11;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig13);
        org.junit.Assert.assertNotNull(hikariConfig14);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str3 = hikariConfig2.jdbcUrl;
        hikariConfig2.maxPoolSize = 19;
        int int6 = hikariConfig2.acquireIncrement;
        hikariConfig2.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource1.setminPoolSize((int) (short) 1);
        boolean boolean4 = hikariDataSource1.isInitializationFailFast;
        int int5 = hikariDataSource1.minPoolSize;
        hikariDataSource1.idleTimeout = (-1);
        boolean boolean8 = hikariDataSource1.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        hikariDataSource6.setisReadOnly(true);
        hikariDataSource6.connectionCustomizerClassName = "HikariPool-7";
        java.lang.String str15 = hikariDataSource6.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean5 = hikariConfig4.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.maxLifetime = 0L;
        int int6 = hikariDataSource3.acquireRetries;
        hikariDataSource3.setRegisterMbeans(false);
        long long9 = hikariDataSource3.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        boolean boolean5 = hikariConfig1.getisIsolateInternalQueries();
        boolean boolean6 = hikariConfig1.getisReadOnly();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig9.connectionCustomizer = iConnectionCustomizer10;
        boolean boolean12 = hikariConfig9.getisInitializationFailFast();
        hikariConfig9.setCatalog("HikariPool-28");
        hikariConfig9.setmaxPoolSize(0);
        long long17 = hikariConfig9.connectionTimeout;
        hikariConfig1.addDataSourceProperty("HikariPool-15", (java.lang.Object) hikariConfig9);
        hikariConfig1.catalog = "";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        boolean boolean16 = hikariConfig14.getisIsolateInternalQueries();
        boolean boolean17 = hikariConfig14.getisAutoCommit();
        long long18 = hikariConfig14.getAcquireRetryDelay();
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
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertNotNull(hikariConfig9);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = hikariDataSource1.poolName;
        hikariDataSource1.poolName = "HikariPool-28";
        boolean boolean5 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.connectionTimeout = 9;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-28" + "'", str2, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.zaxxer.hikari.HikariConfig.poolNumber = 11;
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str4 = hikariConfig3.getConnectionTestQuery();
        long long5 = hikariConfig3.idleTimeout;
        int int6 = hikariConfig3.maxPoolSize;
        hikariConfig3.dataSourceClassName = "HikariPool-4";
        hikariConfig3.isRegisterMbeans = false;
        long long11 = hikariConfig3.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        java.lang.String str18 = hikariDataSource15.catalog;
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.util.Properties properties11 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        hikariDataSource1.setAcquireRetryDelay((long) 1);
        hikariDataSource1.setpoolNumber((int) (short) 0);
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
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.acquireRetryDelay = 0;
        int int4 = hikariConfig1.maxPoolSize;
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        long long6 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.acquireRetryDelay = 28;
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        java.lang.String str17 = hikariDataSource16.poolName;
        int int18 = hikariDataSource16.minPoolSize;
        java.lang.String str19 = hikariDataSource16.getPoolName();
        hikariConfig1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-28" + "'", str17, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-28" + "'", str19, "HikariPool-28");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        hikariConfig1.isRegisterMbeans = true;
        long long23 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hikariConfig14);
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-32" + "'", str16, "HikariPool-32");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter8.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter8.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter8.deserializeObjectHikariConfig2();
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
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(hikariConfig18);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        long long4 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str7 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig1.poolName = "";
        hikariConfig1.setJdbcUrl("HikariPool-6");
        long long6 = hikariConfig1.idleTimeout;
        int int7 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str8 = hikariDataSource7.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        long long4 = hikariDataSource3.leakDetectionThreshold;
        int int5 = hikariDataSource3.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter3.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter3.deserializeObjectHikariConfig2();
        java.lang.String str6 = serializedObjectSupporter3.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter3.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter3.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter3.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter3.deserializeObjectHikariDataSource15();
        java.util.Properties properties11 = serializedObjectSupporter3.deserializeObjectProperties1();
        hikariDataSource2.setDataSourceProperties(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SELECT 1" + "'", str6, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig7.poolName = "HikariPool-17";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean9 = hikariDataSource8.isRegisterMbeans();
        hikariDataSource8.settransactionIsolationName("HikariPool-5");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        boolean boolean13 = hikariConfig8.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SELECT 1" + "'", str5, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}
