import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        long long0 = com.zaxxer.hikari.HikariConfig.CONNECTION_TIMEOUT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 5000L + "'", long0 == 5000L);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.zaxxer.hikari.HikariConfig.poolNumber = (short) 100;
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        long long0 = com.zaxxer.hikari.HikariConfig.ACQUIRE_RETRY_DELAY;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 750L + "'", long0 == 750L);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        long long0 = com.zaxxer.hikari.HikariConfig.MAX_LIFETIME;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1800000L + "'", long0 == 1800000L);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        int int8 = hikariDataSource7.getAcquireIncrement();
        boolean boolean9 = hikariDataSource7.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariDataSource7.connectionCustomizer = iConnectionCustomizer10;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.addDataSourceProperty("", (java.lang.Object) iConnectionCustomizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = com.zaxxer.hikari.HikariConfig.poolNumber;
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 105 + "'", int0 == 105);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
        hikariDataSource3.isInitializationFailFast = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("com.zaxxer.hikari.mocks.StubDataSource");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file com.zaxxer.hikari.mocks.StubDataSource was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.zaxxer.hikari.HikariConfig.poolNumber = '#';
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
        hikariDataSource5.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-4" + "'", str11, "HikariPool-4");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        long long0 = com.zaxxer.hikari.HikariConfig.IDLE_TIMEOUT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 600000L + "'", long0 == 600000L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.minPoolSize = 100;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        hikariDataSource2.settransactionIsolationName("HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.addDataSourceProperty("HikariPool-33", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str5 = hikariDataSource1.dataSourceClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL hi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.idleTimeout;
        hikariDataSource1.jdbcUrl = "HikariPool-32";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setConnectionCustomizerClassName("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean3 = hikariDataSource2.getisRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setDriverClassName("TRANSACTION_REPEATABLE_READ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'TRANSACTION_REPEATABLE_READ' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.setisRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.zaxxer.hikari.HikariConfig.poolNumber = (-1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.zaxxer.hikari.HikariConfig.poolNumber = (short) 10;
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        boolean boolean6 = hikariDataSource1.isRegisterMbeans;
        hikariDataSource1.setMaxLifetime((long) (byte) -1);
        hikariDataSource1.setAcquireRetries((int) (byte) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str5 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.connectionTimeout = 100L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        int int6 = hikariDataSource1.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setConnectionTimeout((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariDataSource3.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter12.deserializeObjectHikariDataSource4();
        java.lang.String str15 = hikariDataSource14.jdbcUrl;
        hikariDataSource5.setDataSource((javax.sql.DataSource) hikariDataSource14);
        hikariDataSource14.idleTimeout = 0L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        long long14 = hikariDataSource12.getLeakDetectionThreshold();
        hikariDataSource12.maxPoolSize = (short) 1;
        java.util.Properties properties17 = hikariDataSource12.dataSourceProperties;
        hikariDataSource3.setDataSourceProperties(properties17);
        long long19 = hikariDataSource3.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.connectionTimeout = (byte) 1;
        java.lang.String str7 = hikariDataSource1.transactionIsolationName;
        java.lang.String str8 = hikariDataSource1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.maxPoolSize = (-1);
        hikariConfig0.catalog = "TRANSACTION_REPEATABLE_READ";
        hikariConfig0.setIdleTimeout((long) 'a');
        java.lang.String str7 = hikariConfig0.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str7, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.idleTimeout = (-1L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.zaxxer.hikari.HikariConfig.poolNumber = (short) -1;
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setMaximumPoolSize((int) ' ');
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries();
        boolean boolean10 = hikariDataSource1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        long long10 = hikariDataSource8.leakDetectionThreshold;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        int int7 = hikariDataSource1.getAcquireIncrement();
        int int8 = hikariDataSource1.getminPoolSize();
        hikariDataSource1.minPoolSize = (-1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAcquireRetryDelay((long) 105);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        java.lang.String str4 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource5.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        boolean boolean4 = hikariDataSource1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        hikariDataSource1.setIsolateInternalQueries(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireRetryDelay((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        boolean boolean4 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.setInitializationFailFast(false);
        hikariDataSource1.setCatalog("TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.maxPoolSize = (-1);
        hikariConfig0.catalog = "TRANSACTION_REPEATABLE_READ";
        java.lang.String str5 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        long long5 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-32 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        int int10 = hikariConfig4.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str5 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setLeakDetectionThreshold(100L);
        java.lang.String str5 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setAcquireRetries(4);
        hikariConfig0.setmaxPoolSize((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.setmaxPoolSize((int) ' ');
        int int8 = hikariDataSource1.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        hikariDataSource3.maxLifetime = (short) 0;
        hikariDataSource3.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        hikariConfig4.connectionTimeout = (short) 10;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        hikariDataSource4.setisReadOnly(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource4.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        java.lang.String str6 = hikariDataSource1.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        int int4 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        java.lang.String str8 = hikariDataSource4.getConnectionInitSql();
        boolean boolean9 = hikariDataSource4.getisIsolateInternalQueries();
        hikariDataSource4.acquireRetries = (short) 1;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        long long14 = hikariDataSource12.getLeakDetectionThreshold();
        hikariDataSource12.maxPoolSize = (short) 1;
        java.util.Properties properties17 = hikariDataSource12.dataSourceProperties;
        hikariDataSource3.setDataSourceProperties(properties17);
        int int19 = hikariDataSource3.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource4.setConnectionInitSql("");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource2.idleTimeout = (short) -1;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.util.Properties properties5 = serializedObjectSupporter0.deserializeObjectProperties1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource3.setAcquireRetries(0);
        hikariDataSource3.setIdleTimeout((long) 1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        boolean boolean6 = hikariDataSource1.isIsolateInternalQueries();
        hikariDataSource1.setisInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        hikariDataSource1.catalog = "SELECT 1";
        int int8 = hikariDataSource1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        long long10 = hikariDataSource5.getMaxLifetime();
        hikariDataSource5.setminPoolSize(10);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        java.util.Properties properties3 = hikariDataSource1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean3 = hikariDataSource2.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariDataSource2.jdbcUrl;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setDriverClassName("VALUES 1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'VALUES 1' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setminPoolSize(0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        boolean boolean2 = hikariConfig1.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean5 = hikariDataSource4.getisReadOnly();
        hikariDataSource4.setMaximumPoolSize(4);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        hikariDataSource1.connectionTestQuery = "HikariPool-33";
        hikariDataSource1.settransactionIsolationName("TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        boolean boolean9 = hikariDataSource1.isInitializationFailFast;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        hikariDataSource4.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.setmaxPoolSize((int) ' ');
        boolean boolean8 = hikariDataSource1.isAutoCommit();
        boolean boolean9 = hikariDataSource1.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        hikariDataSource5.setTransactionIsolation("");
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.zaxxer.hikari.HikariConfig.poolNumber = (byte) 100;
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.setAutoCommit(false);
        hikariDataSource1.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean3 = hikariDataSource2.isJdbc4ConnectionTest();
        hikariDataSource2.setMaxLifetime((long) (byte) 10);
        hikariDataSource2.connectionTimeout = 10;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        long long3 = hikariDataSource2.getIdleTimeout();
        int int4 = hikariDataSource2.getAcquireRetries();
        hikariDataSource2.setisIsolateInternalQueries(false);
        hikariDataSource2.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file  was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.maxLifetime = 10;
        boolean boolean6 = hikariDataSource1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setpoolNumber((int) 'a');
        hikariDataSource1.setAcquireRetryDelay((long) 4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        hikariDataSource1.serializedObjectSupporter = serializedObjectSupporter8;
        boolean boolean10 = hikariDataSource1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        int int4 = hikariDataSource3.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        boolean boolean6 = hikariDataSource3.getisJdbc4connectionTest();
        hikariDataSource3.poolName = "HikariPool-32";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        boolean boolean5 = hikariDataSource4.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter3.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter3.deserializeObjectHikariDataSource3();
        hikariDataSource6.setIdleTimeout((long) (byte) 1);
        hikariDataSource6.leakDetectionThreshold = (short) 0;
        hikariDataSource6.acquireIncrement = 0;
        int int13 = hikariDataSource6.acquireIncrement;
        boolean boolean14 = hikariDataSource6.isIsolateInternalQueries();
        hikariConfig0.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource6);
        long long16 = hikariConfig0.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        java.lang.String str5 = hikariDataSource1.transactionIsolationName;
        boolean boolean6 = hikariDataSource1.isRegisterMbeans;
        long long7 = hikariDataSource1.maxLifetime;
        hikariDataSource1.setisReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource3.setAcquireRetries(0);
        hikariDataSource3.jdbcUrl = "SELECT 1";
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setDriverClassName("HikariPool-6");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-6' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-30 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertNotNull(hikariConfig1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        int int6 = hikariDataSource1.getmaxPoolSize();
        long long7 = hikariDataSource1.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        boolean boolean4 = hikariDataSource3.isAutoCommit();
        int int5 = hikariDataSource3.getminPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file hi! was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        java.lang.String str4 = hikariDataSource1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str2 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean3 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setMaxLifetime((long) 0);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-6" + "'", str3, "HikariPool-6");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariDataSource1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        hikariDataSource7.setisReadOnly(false);
        hikariDataSource7.setisIsolateInternalQueries(false);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        int int13 = hikariDataSource1.getpoolNumber();
        java.lang.String str14 = hikariDataSource1.getCatalog();
        boolean boolean15 = hikariDataSource1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean3 = hikariDataSource2.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariDataSource2.jdbcUrl;
        boolean boolean5 = hikariDataSource2.getisRegisterMbeans();
        java.lang.String str6 = hikariDataSource2.getConnectionInitSql();
        java.lang.String str7 = hikariDataSource2.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.setmaxPoolSize((int) ' ');
        boolean boolean8 = hikariDataSource1.isAutoCommit();
        java.lang.String str9 = hikariDataSource1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        hikariDataSource1.connectionInitSql = "SELECT 1";
        boolean boolean11 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        hikariDataSource1.acquireRetries = 4;
        hikariDataSource1.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        int int4 = hikariDataSource1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        int int7 = hikariDataSource4.getmaxPoolSize();
        javax.sql.DataSource dataSource8 = hikariDataSource4.dataSource;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource2();
        int int11 = hikariDataSource10.getAcquireIncrement();
        long long12 = hikariDataSource10.getLeakDetectionThreshold();
        hikariDataSource10.maxPoolSize = (short) 1;
        int int15 = hikariDataSource10.getmaxPoolSize();
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource10);
        hikariDataSource10.validate();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariDataSource10.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        int int7 = hikariDataSource1.getAcquireIncrement();
        long long8 = hikariDataSource1.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariDataSource1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        hikariDataSource7.setisReadOnly(false);
        hikariDataSource7.setisIsolateInternalQueries(false);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        int int13 = hikariDataSource1.getpoolNumber();
        java.lang.String str14 = hikariDataSource1.getCatalog();
        hikariDataSource1.setAcquireIncrement(1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 105 + "'", int13 == 105);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource4.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        boolean boolean4 = hikariDataSource1.getisAutoCommit();
        int int5 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-4");
        hikariDataSource1.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.maxPoolSize = (-1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer12;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        long long5 = hikariDataSource4.acquireRetryDelay;
        hikariDataSource4.setisIsolateInternalQueries(false);
        hikariDataSource4.setAcquireRetries(3);
        int int10 = hikariDataSource4.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        hikariDataSource4.setPoolName("HikariPool-6");
        java.lang.String str12 = hikariDataSource4.getCatalog();
        boolean boolean13 = hikariDataSource4.getisReadOnly();
        hikariDataSource4.setReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        long long16 = hikariConfig14.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        long long9 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str10 = hikariDataSource1.getJdbcUrl();
        hikariDataSource1.isAutoCommit = false;
        hikariDataSource1.setisIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        boolean boolean2 = hikariDataSource1.getisAutoCommit();
        hikariDataSource1.setConnectionCustomizerClassName("com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource3.isAutoCommit = true;
        boolean boolean6 = hikariDataSource3.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        boolean boolean7 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.connectionTestQuery = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        boolean boolean6 = hikariDataSource3.isRegisterMbeans;
        boolean boolean7 = hikariDataSource3.isInitializationFailFast;
        hikariDataSource3.setConnectionCustomizerClassName("VALUES 1");
        hikariDataSource3.setIdleTimeout(5000L);
        hikariDataSource3.setpoolNumber((int) ' ');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.maxPoolSize = (-1);
        hikariConfig0.catalog = "TRANSACTION_REPEATABLE_READ";
        hikariConfig0.setisRegisterMbeans(true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        long long6 = hikariDataSource1.maxLifetime;
        int int7 = hikariDataSource1.acquireRetries;
        int int8 = hikariDataSource1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.setAutoCommit(false);
        int int9 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setIdleTimeout(100L);
        hikariDataSource4.isReadOnly = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.lang.String str11 = hikariDataSource3.dataSourceClassName;
        boolean boolean12 = hikariDataSource3.getisIsolateInternalQueries();
        hikariDataSource3.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        java.lang.Class<?> wildcardClass5 = hikariDataSource3.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource3.setJdbcUrl("VALUES 1");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = hikariDataSource3.serializedObjectSupporter;
        boolean boolean7 = hikariDataSource3.isJdbc4ConnectionTest();
        long long8 = hikariDataSource3.acquireRetryDelay;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setDriverClassName("test");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'test' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        boolean boolean6 = hikariDataSource3.isRegisterMbeans;
        hikariDataSource3.maxPoolSize = (byte) 10;
        boolean boolean9 = hikariDataSource3.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        int int9 = hikariDataSource8.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        hikariDataSource3.validate();
        hikariDataSource3.settransactionIsolationName("TRANSACTION_READ_COMMITTED");
        hikariDataSource3.setisReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        boolean boolean3 = hikariDataSource1.isAutoCommit();
        java.lang.String str4 = hikariDataSource1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setCatalog("hi!");
        java.lang.String str5 = hikariDataSource2.transactionIsolationName;
        hikariDataSource2.setMaxLifetime(4L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        int int9 = hikariDataSource1.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.setisReadOnly(true);
        boolean boolean9 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.connectionInitSql = "HikariPool-2";
        int int12 = hikariDataSource1.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource4.setConnectionTimeout(750L);
        hikariDataSource4.acquireRetries = 101;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        int int9 = hikariDataSource8.getAcquireIncrement();
        boolean boolean10 = hikariDataSource8.isJdbc4connectionTest;
        java.lang.String str11 = hikariDataSource8.jdbcUrl;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource5.addDataSourceProperty("hi!", (java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        hikariDataSource1.setAcquireRetryDelay((long) '4');
        long long6 = hikariDataSource1.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        hikariDataSource2.setisReadOnly(true);
        long long6 = hikariDataSource2.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        boolean boolean16 = hikariConfig9.getisJdbc4connectionTest();
        hikariConfig9.jdbcUrl = "";
        boolean boolean19 = hikariConfig9.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        long long14 = hikariDataSource12.getLeakDetectionThreshold();
        hikariDataSource12.maxPoolSize = (short) 1;
        java.util.Properties properties17 = hikariDataSource12.dataSourceProperties;
        hikariDataSource3.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean20 = hikariConfig19.isIsolateInternalQueries;
        java.lang.String str21 = hikariConfig19.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource4.addDataSourceProperty("HikariPool-2", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        hikariDataSource3.setDataSourceClassName("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource3.acquireRetryDelay = (short) 10;
        long long6 = hikariDataSource3.getConnectionTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource2();
        int int9 = hikariDataSource8.getAcquireIncrement();
        long long10 = hikariDataSource8.connectionTimeout;
        int int11 = hikariDataSource8.maxPoolSize;
        boolean boolean12 = hikariDataSource8.isIsolateInternalQueries;
        hikariDataSource3.dataSource = hikariDataSource8;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setDriverClassName("VALUES 1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'VALUES 1' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 500L + "'", long10 == 500L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.String str11 = hikariDataSource3.dataSourceClassName;
        hikariDataSource3.setMinimumPoolSize((int) '4');
        boolean boolean14 = hikariDataSource3.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.util.Properties properties11 = hikariDataSource3.getDataSourceProperties();
        hikariDataSource3.setAcquireRetryDelay((long) '4');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.String str14 = hikariDataSource5.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter10.deserializeObjectHikariDataSource6();
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
        org.junit.Assert.assertNotNull(hikariDataSource18);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-6" + "'", str9, "HikariPool-6");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.settransactionIsolationName("HikariPool-2");
        hikariDataSource1.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource3.setAcquireRetries(0);
        java.lang.String str6 = hikariDataSource3.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        java.lang.String str11 = hikariDataSource3.dataSourceClassName;
        java.lang.String str12 = hikariDataSource3.getConnectionCustomizerClassName();
        hikariDataSource3.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        hikariDataSource3.isAutoCommit = true;
        long long6 = hikariDataSource3.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.transactionIsolationName = "";
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setDriverClassName("VALUES 1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'VALUES 1' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        long long3 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionInitSql("test");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        boolean boolean4 = hikariDataSource3.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        hikariDataSource3.validate();
        hikariDataSource3.settransactionIsolationName("TRANSACTION_READ_COMMITTED");
        hikariDataSource3.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariDataSource1.getConnectionCustomizer();
        javax.sql.DataSource dataSource6 = hikariDataSource1.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.String str19 = hikariDataSource1.transactionIsolationName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str19, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setisAutoCommit(false);
        hikariDataSource4.setRegisterMbeans(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = hikariDataSource4.serializedObjectSupporter;
        hikariDataSource4.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        java.util.Properties properties3 = hikariDataSource1.getDataSourceProperties();
        hikariDataSource1.poolName = "test";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        hikariConfig0.setReadOnly(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        int int5 = hikariDataSource3.getAcquireRetries();
        hikariDataSource3.transactionIsolationName = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.String str11 = hikariDataSource3.dataSourceClassName;
        boolean boolean12 = hikariDataSource3.getisIsolateInternalQueries();
        boolean boolean13 = hikariDataSource3.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.Class<?> wildcardClass7 = hikariDataSource6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        boolean boolean6 = hikariDataSource3.isRegisterMbeans;
        boolean boolean7 = hikariDataSource3.isInitializationFailFast;
        hikariDataSource3.setConnectionCustomizerClassName("VALUES 1");
        hikariDataSource3.setIdleTimeout(5000L);
        java.lang.String str12 = hikariDataSource3.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "VALUES 1" + "'", str12, "VALUES 1");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource6.transactionIsolation = 5;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        java.util.Properties properties3 = hikariDataSource1.getDataSourceProperties();
        hikariDataSource1.connectionInitSql = "HikariPool-2";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        int int29 = hikariDataSource16.transactionIsolation;
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        boolean boolean4 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.dataSourceClassName = "SELECT 1";
        hikariDataSource1.isJdbc4connectionTest = true;
        hikariDataSource1.setDataSourceClassName("hi!");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        boolean boolean5 = hikariDataSource1.isReadOnly;
        long long6 = hikariDataSource1.getIDLE_TIMEOUT();
        long long7 = hikariDataSource1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        hikariDataSource3.maxLifetime = (short) 0;
        hikariDataSource3.minPoolSize = (short) 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        hikariDataSource3.minPoolSize = 0;
        java.util.Properties properties8 = hikariDataSource3.getDataSourceProperties();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter10 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter10.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter10.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter10.deserializeObjectHikariDataSource11();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString3();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter10.deserializeObjectHikariConfig3();
        java.lang.String str16 = serializedObjectSupporter10.deserializeObjectString8();
        hikariDataSource3.addDataSourceProperty("HikariPool-30", (java.lang.Object) serializedObjectSupporter10);
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter10.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-6" + "'", str14, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-33" + "'", str16, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource18);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        long long6 = hikariDataSource1.maxLifetime;
        int int7 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setTransactionIsolation("TRANSACTION_READ_COMMITTED");
        boolean boolean10 = hikariDataSource1.getisAutoCommit();
        boolean boolean11 = hikariDataSource1.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.setisRegisterMbeans(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.settransactionIsolationName("HikariPool-2");
        java.lang.String str6 = hikariDataSource1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str6, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean7 = hikariDataSource6.isReadOnly;
        java.lang.String str8 = hikariDataSource6.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        long long16 = hikariDataSource1.idleTimeout;
        boolean boolean17 = hikariDataSource1.isIsolateInternalQueries;
        boolean boolean18 = hikariDataSource1.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource2.setAutoCommit(true);
        hikariDataSource2.validate();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        hikariDataSource1.setpoolNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource3.acquireRetryDelay = (short) 10;
        long long6 = hikariDataSource3.getConnectionTimeout();
        hikariDataSource3.setisReadOnly(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        hikariDataSource3.setMinimumPoolSize((int) '4');
        hikariDataSource3.acquireIncrement = 1;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setDriverClassName("SELECT 1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'SELECT 1' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setCatalog("hi!");
        java.lang.String str5 = hikariDataSource2.transactionIsolationName;
        hikariDataSource2.validate();
        long long7 = hikariDataSource2.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "HikariPool-33";
        hikariDataSource1.setisJdbc4connectionTest(true);
        boolean boolean6 = hikariDataSource1.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource5.setRegisterMbeans(true);
        hikariDataSource5.isJdbc4connectionTest = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.getLeakDetectionThreshold();
        int int8 = hikariDataSource1.getmaxPoolSize();
        hikariDataSource1.acquireRetries = 100;
        javax.sql.DataSource dataSource11 = hikariDataSource1.dataSource;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        hikariDataSource1.isAutoCommit = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.lang.String str11 = hikariDataSource3.dataSourceClassName;
        java.lang.String str12 = hikariDataSource3.getConnectionCustomizerClassName();
        hikariDataSource3.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariConfig0.serializedObjectSupporter;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource17();
        hikariDataSource5.isReadOnly = false;
        hikariDataSource5.setisIsolateInternalQueries(true);
        hikariConfig0.setDataSource((javax.sql.DataSource) hikariDataSource5);
        hikariConfig0.setConnectionInitSql("TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str7 = hikariDataSource6.connectionTestQuery;
        boolean boolean8 = hikariDataSource6.getisReadOnly();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource4();
        hikariDataSource10.jdbcUrl = "HikariPool-33";
        java.util.Properties properties13 = hikariDataSource10.dataSourceProperties;
        hikariDataSource6.dataSourceProperties = properties13;
        hikariDataSource6.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-30");
        int int10 = hikariDataSource1.minPoolSize;
        hikariDataSource1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        boolean boolean7 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.connectionTestQuery = "HikariPool-6";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        hikariDataSource12.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        hikariDataSource4.jdbcUrl = "HikariPool-4";
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        int int4 = hikariDataSource1.minPoolSize;
        hikariDataSource1.setMinimumPoolSize((int) (short) 0);
        hikariDataSource1.setPoolName("HikariPool-2");
        int int9 = hikariDataSource1.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource4.maxLifetime = (short) 10;
        int int7 = hikariDataSource4.acquireRetries;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str4 = hikariDataSource3.getConnectionCustomizerClassName();
        hikariDataSource3.maxLifetime = (short) 1;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        int int10 = hikariDataSource3.acquireIncrement;
        boolean boolean11 = hikariDataSource3.isIsolateInternalQueries();
        hikariDataSource3.setMaximumPoolSize(5);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource3.setDriverClassName("SELECT 1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'SELECT 1' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter11.deserializeObjectHikariDataSource12();
        boolean boolean18 = hikariDataSource17.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.setmaxPoolSize(105);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.setmaxPoolSize(105);
        hikariDataSource1.transactionIsolationName = "HikariPool-32";
        long long7 = hikariDataSource1.getIdleTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        hikariDataSource1.connectionInitSql = "SELECT 1";
        boolean boolean11 = hikariDataSource1.getisIsolateInternalQueries();
        java.lang.String str12 = hikariDataSource1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        hikariDataSource1.acquireIncrement = (byte) 0;
        hikariDataSource1.setisRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        long long16 = hikariDataSource1.getACQUIRE_RETRY_DELAY();
        long long17 = hikariDataSource1.getConnectionTimeout();
        long long18 = hikariDataSource1.getMAX_LIFETIME();
        long long19 = hikariDataSource1.acquireRetryDelay;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 500L + "'", long17 == 500L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.maxPoolSize = (-1);
        int int3 = hikariConfig0.getmaxPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig7.idleTimeout = 4L;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariConfig7);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        long long3 = hikariDataSource2.getIdleTimeout();
        int int4 = hikariDataSource2.getAcquireRetries();
        hikariDataSource2.setisIsolateInternalQueries(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setDriverClassName("TRANSACTION_REPEATABLE_READ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'TRANSACTION_REPEATABLE_READ' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str5 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        int int8 = hikariDataSource1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str4, "TRANSACTION_REPEATABLE_READ");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        int int7 = hikariDataSource1.getAcquireIncrement();
        int int8 = hikariDataSource1.getminPoolSize();
        hikariDataSource1.setpoolNumber(1);
        long long11 = hikariDataSource1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        int int6 = hikariDataSource1.getmaxPoolSize();
        hikariDataSource1.setMinimumPoolSize(35);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        int int5 = hikariDataSource2.acquireIncrement;
        hikariDataSource2.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        java.lang.String str10 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "HikariPool-33";
        hikariDataSource1.setisJdbc4connectionTest(true);
        long long6 = hikariDataSource1.idleTimeout;
        hikariDataSource1.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.String str16 = hikariDataSource15.gettransactionIsolationName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "TRANSACTION_READ_COMMITTED" + "'", str16, "TRANSACTION_READ_COMMITTED");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        java.lang.String str8 = hikariDataSource1.jdbcUrl;
        int int9 = hikariDataSource1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.util.Properties properties11 = hikariDataSource3.getDataSourceProperties();
        hikariDataSource3.setConnectionInitSql("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-6" + "'", str7, "HikariPool-6");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        java.lang.String str4 = hikariDataSource1.jdbcUrl;
        hikariDataSource1.setAutoCommit(false);
        hikariDataSource1.isInitializationFailFast = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        javax.sql.DataSource dataSource16 = hikariConfig14.getDataSource();
        hikariConfig14.setisJdbc4connectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig14.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        hikariConfig4.acquireRetryDelay = 4;
        int int7 = hikariConfig4.getTransactionIsolation();
        int int8 = hikariConfig4.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.Class<?> wildcardClass8 = hikariDataSource7.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        hikariDataSource1.setConnectionInitSql("HikariPool-4");
        java.lang.String str15 = hikariDataSource1.dataSourceClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 500L + "'", long9 == 500L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str15, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource3.acquireRetryDelay = (short) 10;
        long long6 = hikariDataSource3.getConnectionTimeout();
        boolean boolean7 = hikariDataSource3.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        int int4 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = hikariConfig4.getCatalog();
        java.lang.String str6 = hikariConfig4.getConnectionInitSql();
        hikariConfig4.setConnectionInitSql("HikariPool-13");
        hikariConfig4.setAcquireRetries((int) ' ');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter12.deserializeObjectHikariDataSource4();
        java.lang.String str15 = hikariDataSource14.jdbcUrl;
        hikariDataSource5.setDataSource((javax.sql.DataSource) hikariDataSource14);
        hikariDataSource14.setIdleTimeout(0L);
        int int19 = hikariDataSource14.acquireIncrement;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        boolean boolean4 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.dataSourceClassName = "SELECT 1";
        int int7 = hikariDataSource1.minPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str4, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource7.setMaxLifetime(0L);
        hikariDataSource7.setisRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        int int4 = hikariDataSource2.getTransactionIsolation();
        hikariDataSource2.setAcquireRetries(9);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.transactionIsolation = '#';
        boolean boolean5 = hikariDataSource1.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource2.setisRegisterMbeans(true);
        int int5 = hikariDataSource2.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setLeakDetectionThreshold(100L);
        hikariConfig0.setisAutoCommit(false);
        hikariConfig0.setisReadOnly(false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.zaxxer.hikari.HikariConfig.poolNumber = (byte) 1;
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setisInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariDataSource3.connectionCustomizer = iConnectionCustomizer6;
        java.util.Properties properties8 = hikariDataSource3.dataSourceProperties;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        int int6 = hikariDataSource4.getminPoolSize();
        boolean boolean7 = hikariDataSource4.isRegisterMbeans();
        hikariDataSource4.addDataSourceProperty("hi!", (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        boolean boolean6 = hikariDataSource3.isRegisterMbeans;
        boolean boolean7 = hikariDataSource3.isInitializationFailFast;
        hikariDataSource3.setConnectionCustomizerClassName("VALUES 1");
        hikariDataSource3.setAutoCommit(true);
        hikariDataSource3.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource5.setConnectionCustomizerClassName("hi!");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        int int10 = hikariDataSource9.getAcquireIncrement();
        hikariDataSource9.settransactionIsolationName("hi!");
        hikariDataSource9.isInitializationFailFast = true;
        long long15 = hikariDataSource9.idleTimeout;
        boolean boolean16 = hikariDataSource9.isJdbc4connectionTest;
        long long17 = hikariDataSource9.getLeakDetectionThreshold();
        hikariDataSource5.dataSource = hikariDataSource9;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.isInitializationFailFast;
        long long7 = hikariDataSource1.idleTimeout;
        java.lang.String str8 = hikariDataSource1.connectionCustomizerClassName;
        hikariDataSource1.isReadOnly = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        java.lang.String str4 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.setpoolNumber(0);
        boolean boolean7 = hikariDataSource1.isInitializationFailFast;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter8.deserializeObjectHikariDataSource1();
        int int11 = hikariDataSource10.maxPoolSize;
        boolean boolean12 = hikariDataSource10.getisJdbc4connectionTest();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "VALUES 1" + "'", str4, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(hikariConfig9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAcquireRetryDelay((long) 105);
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        java.lang.String str6 = hikariDataSource2.poolName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-15" + "'", str6, "HikariPool-15");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        boolean boolean11 = hikariDataSource1.isAutoCommit();
        int int12 = hikariDataSource1.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setmaxPoolSize(10);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        hikariDataSource3.setPoolName("TRANSACTION_READ_COMMITTED");
        hikariDataSource3.setMaximumPoolSize((int) '4');
        int int8 = hikariDataSource3.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        java.lang.String str3 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setIdleTimeout(100L);
        hikariDataSource4.validate();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        long long4 = hikariDataSource1.getMAX_LIFETIME();
        long long5 = hikariDataSource1.getCONNECTION_TIMEOUT();
        int int6 = hikariDataSource1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean5 = hikariDataSource4.isReadOnly();
        int int6 = hikariDataSource4.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties7 = serializedObjectSupporter6.deserializeObjectProperties1();
        hikariConfig4.addDataSourceProperty("HikariPool-32", (java.lang.Object) serializedObjectSupporter6);
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter6.deserializeObjectHikariDataSource16();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer2;
        int int4 = hikariDataSource1.transactionIsolation;
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        int int6 = hikariDataSource1.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource1.setConnectionInitSql("TRANSACTION_REPEATABLE_READ");
        java.lang.String str4 = hikariDataSource1.getConnectionTestQuery();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "VALUES 1" + "'", str4, "VALUES 1");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean8 = hikariDataSource1.isAutoCommit;
        boolean boolean9 = hikariDataSource1.isAutoCommit();
        boolean boolean10 = hikariDataSource1.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = hikariDataSource2.jdbcUrl;
        hikariDataSource2.isJdbc4connectionTest = false;
        int int6 = hikariDataSource2.getAcquireRetries();
        java.lang.String str7 = hikariDataSource2.jdbcUrl;
        boolean boolean8 = hikariDataSource2.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        long long5 = hikariDataSource1.getCONNECTION_TIMEOUT();
        hikariDataSource1.leakDetectionThreshold = (short) -1;
        boolean boolean8 = hikariDataSource1.getisInitializationFailFast();
        hikariDataSource1.isInitializationFailFast = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        boolean boolean5 = hikariDataSource1.getisInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariDataSource1.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        hikariDataSource4.isInitializationFailFast = false;
        hikariDataSource4.setConnectionCustomizerClassName("HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource2.setAutoCommit(true);
        hikariDataSource2.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        long long5 = hikariDataSource4.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource2();
        int int8 = hikariDataSource7.getAcquireIncrement();
        long long9 = hikariDataSource7.getLeakDetectionThreshold();
        hikariDataSource7.maxPoolSize = (short) 1;
        boolean boolean12 = hikariDataSource7.isInitializationFailFast;
        hikariDataSource4.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource4.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        boolean boolean3 = hikariDataSource2.getisRegisterMbeans();
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setDataSourceProperties(properties4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariDataSource1.getConnectionCustomizer();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource17();
        hikariDataSource7.setisReadOnly(false);
        hikariDataSource7.setisIsolateInternalQueries(false);
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource7);
        hikariDataSource7.setisIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.String str17 = hikariDataSource9.getJdbcUrl();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        int int5 = hikariDataSource2.acquireIncrement;
        hikariDataSource2.jdbcUrl = "TRANSACTION_READ_COMMITTED";
        hikariDataSource2.setConnectionTestQuery("hi!");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        hikariConfig4.poolName = "TRANSACTION_READ_COMMITTED";
        int int12 = hikariConfig4.getAcquireIncrement();
        hikariConfig4.isInitializationFailFast = true;
        java.lang.String str15 = hikariConfig4.getJdbcUrl();
        java.lang.String str16 = hikariConfig4.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        java.lang.String str4 = hikariDataSource3.gettransactionIsolationName();
        hikariDataSource3.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        boolean boolean3 = hikariDataSource2.isJdbc4connectionTest;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariDataSource2.serializedObjectSupporter;
        boolean boolean4 = hikariDataSource2.getisAutoCommit();
        java.lang.String str5 = hikariDataSource2.getConnectionTestQuery();
        hikariDataSource2.maxLifetime = 0L;
        hikariDataSource2.poolName = "TRANSACTION_READ_COMMITTED";
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.zaxxer.hikari.HikariConfig.poolNumber = 99;
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setTransactionIsolation("");
        java.lang.String str5 = hikariDataSource1.getPoolName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-2" + "'", str5, "HikariPool-2");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        java.lang.String str10 = hikariDataSource8.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource4.setDriverClassName("HikariPool-9");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-9' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.poolName = "SELECT 1";
        boolean boolean5 = hikariDataSource1.isReadOnly();
        long long6 = hikariDataSource1.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.maxPoolSize = (-1);
        int int3 = hikariConfig0.getmaxPoolSize();
        java.lang.String str4 = hikariConfig0.catalog;
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource2.connectionTimeout = 35;
        long long5 = hikariDataSource2.leakDetectionThreshold;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource2.setDriverClassName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'hi!' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        boolean boolean5 = hikariDataSource4.isRegisterMbeans;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource4();
        hikariDataSource7.jdbcUrl = "HikariPool-33";
        java.util.Properties properties10 = hikariDataSource7.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setisJdbc4connectionTest(true);
        hikariDataSource4.copyState(hikariConfig11);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setAcquireRetries(105);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariDataSource1.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariConfig0.serializedObjectSupporter;
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.catalog;
        hikariConfig0.setisInitializationFailFast(false);
        java.lang.String str8 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.maxLifetime = 10L;
        hikariDataSource4.setDataSourceClassName("SELECT 1");
        hikariDataSource4.setisIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer2;
        int int4 = hikariDataSource1.transactionIsolation;
        boolean boolean5 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.maxLifetime = 5;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        boolean boolean5 = hikariDataSource1.isRegisterMbeans();
        hikariDataSource1.setPoolName("hi!");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.setMaxLifetime((long) (byte) 0);
        long long6 = hikariDataSource1.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.setLeakDetectionThreshold(0L);
        hikariDataSource1.transactionIsolationName = "com.zaxxer.hikari.mocks.StubDataSource";
        int int15 = hikariDataSource1.acquireIncrement;
        java.lang.String str16 = hikariDataSource1.connectionCustomizerClassName;
        hikariDataSource1.connectionInitSql = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        boolean boolean7 = hikariDataSource1.getisJdbc4connectionTest();
        hikariDataSource1.isRegisterMbeans = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAcquireRetryDelay((long) 105);
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer4;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        boolean boolean4 = hikariDataSource1.getisAutoCommit();
        int int5 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-4");
        boolean boolean8 = hikariDataSource1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        boolean boolean4 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.setisJdbc4connectionTest(true);
        hikariDataSource1.setDataSourceClassName("");
        java.lang.Class<?> wildcardClass9 = hikariDataSource1.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        javax.sql.DataSource dataSource13 = hikariDataSource1.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        java.util.Properties properties4 = hikariDataSource1.dataSourceProperties;
        java.lang.String str5 = hikariDataSource1.getConnectionTestQuery();
        hikariDataSource1.setmaxPoolSize((int) ' ');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer8;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        boolean boolean3 = hikariDataSource2.getisRegisterMbeans();
        hikariDataSource2.maxLifetime = 100L;
        java.lang.String str6 = hikariDataSource2.getCatalog();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        java.lang.String str5 = hikariConfig0.jdbcUrl;
        hikariConfig0.setReadOnly(false);
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        java.lang.String str4 = hikariDataSource1.jdbcUrl;
        hikariDataSource1.validate();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        long long6 = hikariDataSource2.getAcquireRetryDelay();
        int int7 = hikariDataSource2.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        boolean boolean3 = hikariDataSource1.isAutoCommit;
        boolean boolean4 = hikariDataSource1.isRegisterMbeans;
        int int5 = hikariDataSource1.transactionIsolation;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.setisAutoCommit(false);
        hikariDataSource4.setRegisterMbeans(true);
        hikariDataSource4.setMaxLifetime((long) 2);
        hikariDataSource4.setIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource10();
        java.lang.String str16 = hikariDataSource15.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = hikariDataSource4.transactionIsolationName;
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariConfig0.serializedObjectSupporter;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter4 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter4.deserializeObjectHikariDataSource17();
        hikariDataSource5.isReadOnly = false;
        hikariDataSource5.setisIsolateInternalQueries(true);
        hikariConfig0.setDataSource((javax.sql.DataSource) hikariDataSource5);
        boolean boolean11 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        java.lang.String str5 = hikariDataSource2.getConnectionTestQuery();
        int int6 = hikariDataSource2.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        hikariDataSource2.setAutoCommit(true);
        java.lang.String str5 = hikariDataSource2.gettransactionIsolationName();
        boolean boolean6 = hikariDataSource2.isReadOnly();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        boolean boolean10 = hikariConfig4.getisRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        boolean boolean5 = hikariDataSource1.isIsolateInternalQueries;
        hikariDataSource1.setMaximumPoolSize((int) ' ');
        int int8 = hikariDataSource1.getTransactionIsolation();
        java.lang.String str9 = hikariDataSource1.connectionTestQuery;
        hikariDataSource1.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariDataSource7.connectionCustomizer;
        java.lang.String str9 = hikariDataSource7.connectionTestQuery;
        hikariDataSource7.setLeakDetectionThreshold((long) (-1));
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "VALUES 1" + "'", str9, "VALUES 1");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        long long6 = hikariDataSource5.idleTimeout;
        boolean boolean7 = hikariDataSource5.isInitializationFailFast;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        int int4 = hikariConfig3.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig3.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        long long8 = hikariDataSource1.getMaxLifetime();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        long long6 = hikariDataSource1.maxLifetime;
        int int7 = hikariDataSource1.acquireRetries;
        hikariDataSource1.setTransactionIsolation("TRANSACTION_READ_COMMITTED");
        boolean boolean10 = hikariDataSource1.getisAutoCommit();
        hikariDataSource1.acquireIncrement = 35;
        java.lang.String str13 = hikariDataSource1.connectionCustomizerClassName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-6");
        hikariDataSource1.idleTimeout = '4';
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        long long3 = hikariDataSource2.getIdleTimeout();
        hikariDataSource2.setConnectionTestQuery("HikariPool-30");
        java.util.Properties properties6 = hikariDataSource2.dataSourceProperties;
        boolean boolean7 = hikariDataSource2.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setLeakDetectionThreshold(100L);
        hikariConfig0.setisAutoCommit(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        java.util.Properties properties6 = hikariDataSource1.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setConnectionInitSql("VALUES 1");
        boolean boolean10 = hikariDataSource1.getisAutoCommit();
        boolean boolean11 = hikariDataSource1.getisInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        java.util.Properties properties3 = hikariDataSource1.getDataSourceProperties();
        boolean boolean4 = hikariDataSource1.isReadOnly();
        hikariDataSource1.setCatalog("VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        int int4 = hikariDataSource3.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.util.Properties properties7 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        java.lang.String str11 = hikariDataSource1.connectionInitSql;
        boolean boolean12 = hikariDataSource1.getisRegisterMbeans();
        hikariDataSource1.setisInitializationFailFast(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource10();
        java.util.Properties properties17 = hikariDataSource16.dataSourceProperties;
        hikariDataSource1.setDataSourceProperties(properties17);
        int int19 = hikariDataSource1.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(hikariDataSource16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        hikariDataSource4.setPoolName("HikariPool-6");
        java.lang.String str12 = hikariDataSource4.getCatalog();
        hikariDataSource4.setIsolateInternalQueries(false);
        java.lang.Class<?> wildcardClass15 = hikariDataSource4.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        hikariDataSource4.setisReadOnly(true);
        hikariDataSource4.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        hikariDataSource1.minPoolSize = 97;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter3.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter3.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter3.deserializeObjectHikariDataSource3();
        hikariDataSource6.setIdleTimeout((long) (byte) 1);
        hikariDataSource6.leakDetectionThreshold = (short) 0;
        hikariDataSource6.acquireIncrement = 0;
        int int13 = hikariDataSource6.acquireIncrement;
        boolean boolean14 = hikariDataSource6.isIsolateInternalQueries();
        hikariConfig0.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource6);
        boolean boolean16 = hikariDataSource6.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setmaxPoolSize((int) (short) -1);
        int int3 = hikariConfig0.acquireRetries;
        hikariConfig0.setisAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        hikariDataSource1.setMaximumPoolSize((int) (short) 10);
        int int13 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setConnectionInitSql("");
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.addDataSourceProperty("HikariPool-13", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = hikariConfig4.getCatalog();
        java.lang.String str6 = hikariConfig4.getConnectionInitSql();
        int int7 = hikariConfig4.minPoolSize;
        java.lang.String str8 = hikariConfig4.gettransactionIsolationName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        hikariConfig4.poolName = "TRANSACTION_READ_COMMITTED";
        int int12 = hikariConfig4.getAcquireIncrement();
        hikariConfig4.isInitializationFailFast = true;
        java.lang.String str15 = hikariConfig4.getJdbcUrl();
        hikariConfig4.setConnectionTimeout(0L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-32" + "'", str8, "HikariPool-32");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        int int3 = hikariDataSource1.getMinimumPoolSize();
        hikariDataSource1.maxPoolSize = (byte) 1;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        hikariDataSource1.setMaximumPoolSize((int) (short) 10);
        int int13 = hikariDataSource1.getpoolNumber();
        hikariDataSource1.setConnectionInitSql("");
        boolean boolean16 = hikariDataSource1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariDataSource1.connectionCustomizer;
        int int6 = hikariDataSource1.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        hikariDataSource4.setPoolName("HikariPool-6");
        java.lang.String str12 = hikariDataSource4.getCatalog();
        boolean boolean13 = hikariDataSource4.getisReadOnly();
        long long14 = hikariDataSource4.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-6" + "'", str6, "HikariPool-6");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariDataSource3.connectionCustomizer;
        long long5 = hikariDataSource3.getIdleTimeout();
        long long6 = hikariDataSource3.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-30");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-30' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.setUseInstrumentation(true);
        hikariDataSource1.validate();
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        hikariDataSource6.transactionIsolationName = "hi!";
        boolean boolean10 = hikariDataSource6.isRegisterMbeans();
        long long11 = hikariDataSource6.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        hikariDataSource1.acquireIncrement = (byte) 100;
        java.lang.String str7 = hikariDataSource1.getConnectionInitSql();
        long long8 = hikariDataSource1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setConnectionInitSql("HikariPool-33");
        hikariConfig0.isJdbc4connectionTest = true;
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.catalog = "HikariPool-4";
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariConfig0.serializedObjectSupporter;
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.connectionInitSql;
        int int5 = hikariDataSource3.maxPoolSize;
        hikariDataSource3.setMaxLifetime((long) 97);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str2 = hikariConfig1.connectionCustomizerClassName;
        int int3 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        hikariDataSource1.jdbcUrl = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariDataSource1.connectionCustomizer;
        hikariDataSource1.setMaximumPoolSize(4);
        java.lang.String str5 = hikariDataSource1.connectionTestQuery;
        long long6 = hikariDataSource1.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.util.Properties properties8 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        boolean boolean6 = hikariConfig5.isAutoCommit;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource1.setDriverClassName("HikariPool-30");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-30' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig4.catalog = "HikariPool-12";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        hikariDataSource1.poolName = "HikariPool-33";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        boolean boolean8 = hikariDataSource7.isIsolateInternalQueries;
        int int9 = hikariDataSource7.getAcquireIncrement();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = hikariDataSource3.getConnectionInitSql();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        java.lang.String str4 = hikariConfig1.jdbcUrl;
        boolean boolean5 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        boolean boolean3 = hikariDataSource2.isJdbc4ConnectionTest();
        int int4 = hikariDataSource2.getpoolNumber();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        hikariDataSource5.dataSourceClassName = "HikariPool-6";
        hikariDataSource5.setpoolNumber(35);
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
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.acquireRetries = '#';
        hikariDataSource1.catalog = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.setAutoCommit(false);
        hikariDataSource1.transactionIsolation = 'a';
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource10();
        hikariDataSource12.jdbcUrl = "hi!";
        long long15 = hikariDataSource12.getMAX_LIFETIME();
        long long16 = hikariDataSource12.getCONNECTION_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties18 = serializedObjectSupporter17.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter17.deserializeObjectHikariDataSource8();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString8();
        java.util.Properties properties21 = serializedObjectSupporter17.deserializeObjectProperties1();
        hikariDataSource12.setDataSourceProperties(properties21);
        hikariDataSource1.setDataSourceProperties(properties21);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(hikariDataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-33" + "'", str20, "HikariPool-33");
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        java.lang.String str8 = hikariDataSource1.jdbcUrl;
        boolean boolean9 = hikariDataSource1.isInitializationFailFast;
        long long10 = hikariDataSource1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("VALUES 1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file VALUES 1 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        boolean boolean10 = hikariDataSource3.getisReadOnly();
        hikariDataSource3.isIsolateInternalQueries = false;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = null;
        hikariDataSource3.connectionCustomizer = iConnectionCustomizer4;
        boolean boolean6 = hikariDataSource3.isAutoCommit;
        hikariDataSource3.setisIsolateInternalQueries(false);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.isJdbc4connectionTest = false;
        int int6 = hikariDataSource1.acquireRetries;
        java.lang.String str7 = hikariDataSource1.connectionTestQuery;
        long long8 = hikariDataSource1.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "VALUES 1" + "'", str7, "VALUES 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter11.deserializeObjectHikariDataSource10();
        hikariDataSource15.setisIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        long long4 = hikariDataSource1.getCONNECTION_TIMEOUT();
        hikariDataSource1.setMaxLifetime(500L);
        java.lang.String str7 = hikariDataSource1.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariDataSource3.connectionCustomizer;
        long long5 = hikariDataSource3.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        long long14 = hikariDataSource12.getLeakDetectionThreshold();
        hikariDataSource12.maxPoolSize = (short) 1;
        java.util.Properties properties17 = hikariDataSource12.dataSourceProperties;
        hikariDataSource3.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str21 = hikariConfig20.getCatalog();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource2.setConnectionInitSql("VALUES 1");
        hikariDataSource2.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        boolean boolean6 = hikariDataSource3.isRegisterMbeans;
        hikariDataSource3.setConnectionCustomizerClassName("TRANSACTION_READ_COMMITTED");
        hikariDataSource3.setConnectionTestQuery("HikariPool-20");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariDataSource1.connectionCustomizer;
        hikariDataSource1.setMaximumPoolSize(4);
        hikariDataSource1.settransactionIsolationName("HikariPool-33");
        long long7 = hikariDataSource1.leakDetectionThreshold;
        hikariDataSource1.setpoolNumber(0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        java.lang.String str4 = hikariDataSource1.getConnectionTestQuery();
        java.lang.String str5 = hikariDataSource1.connectionTestQuery;
        hikariDataSource1.setLeakDetectionThreshold((long) (short) 1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "VALUES 1" + "'", str4, "VALUES 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.zaxxer.hikari.HikariConfig.poolNumber = 103;
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        long long5 = hikariDataSource4.acquireRetryDelay;
        hikariDataSource4.setisIsolateInternalQueries(false);
        java.util.Properties properties8 = hikariDataSource4.getDataSourceProperties();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        boolean boolean5 = hikariDataSource4.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str3 = hikariDataSource2.connectionInitSql;
        int int4 = hikariDataSource2.getTransactionIsolation();
        boolean boolean5 = hikariDataSource2.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.minPoolSize = (short) -1;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        java.lang.String str4 = hikariDataSource1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.connectionTimeout = (byte) 1;
        java.lang.String str7 = hikariDataSource1.transactionIsolationName;
        int int8 = hikariDataSource1.getMinimumPoolSize();
        boolean boolean9 = hikariDataSource1.isReadOnly();
        long long10 = hikariDataSource1.getMaxLifetime();
        int int11 = hikariDataSource1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        javax.sql.DataSource dataSource16 = hikariConfig14.getDataSource();
        hikariConfig14.isInitializationFailFast = false;
        hikariConfig14.setMinimumPoolSize(0);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        boolean boolean7 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str8 = hikariDataSource1.jdbcUrl;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        java.util.Properties properties6 = hikariDataSource1.dataSourceProperties;
        boolean boolean7 = hikariDataSource1.isJdbc4ConnectionTest();
        hikariDataSource1.isIsolateInternalQueries = false;
        int int10 = hikariDataSource1.acquireIncrement;
        hikariDataSource1.minPoolSize = 33;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        boolean boolean12 = hikariDataSource1.isAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 500L + "'", long9 == 500L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setConnectionInitSql("HikariPool-33");
        hikariConfig0.isJdbc4connectionTest = true;
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.catalog = "HikariPool-4";
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource16();
        int int11 = hikariDataSource10.minPoolSize;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        hikariDataSource1.settransactionIsolationName("HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariConfig12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        java.lang.String str10 = hikariDataSource1.catalog;
        java.lang.String str11 = hikariDataSource1.poolName;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-2" + "'", str11, "HikariPool-2");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.util.Properties properties19 = hikariDataSource5.dataSourceProperties;
        hikariDataSource5.isInitializationFailFast = false;
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
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource2.setJdbcUrl("com.zaxxer.hikari.mocks.StubDataSource");
        java.lang.String str5 = hikariDataSource2.getConnectionTestQuery();
        hikariDataSource2.idleTimeout = (short) 10;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VALUES 1" + "'", str5, "VALUES 1");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        long long4 = hikariDataSource1.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter5 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties6 = serializedObjectSupporter5.deserializeObjectProperties1();
        hikariDataSource1.dataSourceProperties = properties6;
        hikariDataSource1.setJdbc4ConnectionTest(true);
        long long10 = hikariDataSource1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.jdbcUrl = "HikariPool-33";
        hikariDataSource1.setAcquireIncrement((int) (byte) 1);
        hikariDataSource1.setAcquireRetries((int) (short) 0);
        java.lang.String str8 = hikariDataSource1.jdbcUrl;
        boolean boolean9 = hikariDataSource1.isInitializationFailFast;
        int int10 = hikariDataSource1.getMinimumPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-33" + "'", str8, "HikariPool-33");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int8 = hikariDataSource7.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SELECT 1" + "'", str4, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        boolean boolean8 = hikariDataSource7.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        java.lang.String str5 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        long long8 = hikariDataSource1.leakDetectionThreshold;
        int int9 = hikariDataSource1.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        long long7 = hikariDataSource4.getACQUIRE_RETRY_DELAY();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource3.acquireRetryDelay = (short) 10;
        long long6 = hikariDataSource3.getConnectionTimeout();
        java.lang.String str7 = hikariDataSource3.gettransactionIsolationName();
        boolean boolean8 = hikariDataSource3.isRegisterMbeans();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_READ_COMMITTED" + "'", str7, "TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        hikariConfig0.setConnectionInitSql("HikariPool-33");
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.poolName = "HikariPool-12";
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        long long6 = hikariDataSource1.acquireRetryDelay;
        hikariDataSource1.connectionTimeout = (short) -1;
        long long9 = hikariDataSource1.getConnectionTimeout();
        java.lang.String str10 = hikariDataSource1.getJdbcUrl();
        java.lang.String str11 = hikariDataSource1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str11, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean8 = hikariDataSource1.isAutoCommit;
        long long9 = hikariDataSource1.getIDLE_TIMEOUT();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setJdbc4ConnectionTest(false);
        hikariDataSource3.setisIsolateInternalQueries(false);
        hikariDataSource3.setIdleTimeout(0L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        hikariDataSource8.transactionIsolationName = "HikariPool-2";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariDataSource8.connectionCustomizer;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int6 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionTimeout(100L);
        hikariDataSource1.setpoolNumber((int) (byte) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariDataSource1.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = hikariConfig4.getCatalog();
        java.lang.String str6 = hikariConfig4.getConnectionInitSql();
        int int7 = hikariConfig4.minPoolSize;
        hikariConfig4.setConnectionInitSql("HikariPool-12");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariDataSource6.getConnectionCustomizer();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.setisReadOnly(false);
        long long4 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-99");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        hikariDataSource1.connectionTestQuery = "HikariPool-33";
        hikariDataSource1.setisJdbc4connectionTest(true);
        int int6 = hikariDataSource1.getmaxPoolSize();
        hikariDataSource1.setAcquireRetryDelay((long) 99);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        hikariDataSource1.catalog = "HikariPool-4";
        hikariDataSource1.setisIsolateInternalQueries(true);
        hikariDataSource1.setAcquireIncrement(4);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource6.settransactionIsolationName("HikariPool-97");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        hikariDataSource3.setPoolName("HikariPool-4");
        hikariDataSource3.maxLifetime = 1;
        hikariDataSource3.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.setMaxLifetime((long) (byte) 0);
        boolean boolean6 = hikariDataSource1.isAutoCommit();
        hikariDataSource1.acquireRetries = 0;
        boolean boolean9 = hikariDataSource1.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        int int10 = hikariDataSource4.getTransactionIsolation();
        java.lang.String str11 = hikariDataSource4.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource4.setJdbcUrl("SELECT 1");
        hikariDataSource4.setInitializationFailFast(true);
        hikariDataSource4.setIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        boolean boolean4 = hikariDataSource3.getisInitializationFailFast();
        boolean boolean5 = hikariDataSource3.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        hikariConfig6.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariConfig6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig2.setpoolNumber(3);
        hikariConfig2.setisReadOnly(true);
        boolean boolean7 = hikariConfig2.getisAutoCommit();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariConfig2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        hikariDataSource1.connectionTimeout = (-1);
        hikariDataSource1.leakDetectionThreshold = 'a';
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        long long6 = hikariDataSource1.idleTimeout;
        hikariDataSource1.setInitializationFailFast(true);
        boolean boolean9 = hikariDataSource1.isInitializationFailFast();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        hikariDataSource5.acquireIncrement = 14;
        boolean boolean20 = hikariDataSource5.isAutoCommit;
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int6 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionTimeout(100L);
        hikariDataSource1.setpoolNumber((int) (byte) 100);
        hikariDataSource1.transactionIsolation = 101;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource8.setDriverClassName("VALUES 1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'VALUES 1' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        java.lang.String str5 = hikariDataSource4.gettransactionIsolationName();
        hikariDataSource4.setAcquireRetryDelay((long) 100);
        boolean boolean8 = hikariDataSource4.isInitializationFailFast;
        boolean boolean9 = hikariDataSource4.isReadOnly;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        hikariDataSource1.setConnectionInitSql("test");
        boolean boolean15 = hikariDataSource1.getisIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setisRegisterMbeans(false);
        java.lang.String str3 = hikariConfig0.connectionInitSql;
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        hikariConfig0.setisRegisterMbeans(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        boolean boolean8 = hikariDataSource1.isAutoCommit;
        long long9 = hikariDataSource1.maxLifetime;
        hikariDataSource1.setisInitializationFailFast(false);
        hikariDataSource1.setIdleTimeout(4L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.zaxxer.hikari.HikariConfig.poolNumber = 101;
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.maxPoolSize = (short) 1;
        boolean boolean6 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.poolName = "hi!";
        hikariDataSource1.setJdbc4ConnectionTest(true);
        hikariDataSource1.setMaximumPoolSize((int) (short) 10);
        long long13 = hikariDataSource1.getMAX_LIFETIME();
        long long14 = hikariDataSource1.idleTimeout;
        int int15 = hikariDataSource1.acquireRetries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.connectionTestQuery = "TRANSACTION_REPEATABLE_READ";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource8.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str6, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        long long16 = hikariConfig14.getACQUIRE_RETRY_DELAY();
        hikariConfig14.setisInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        hikariDataSource4.poolName = "VALUES 1";
        hikariDataSource4.minPoolSize = (byte) 100;
        int int10 = hikariDataSource4.getTransactionIsolation();
        long long11 = hikariDataSource4.idleTimeout;
        java.lang.String str12 = hikariDataSource4.connectionInitSql;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource7.minPoolSize = 97;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-32" + "'", str4, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-32" + "'", str5, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str5 = hikariConfig4.getCatalog();
        java.lang.String str6 = hikariConfig4.getConnectionInitSql();
        hikariConfig4.setConnectionInitSql("HikariPool-13");
        hikariConfig4.setAutoCommit(true);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        long long3 = hikariDataSource2.getIdleTimeout();
        int int4 = hikariDataSource2.getAcquireRetries();
        boolean boolean5 = hikariDataSource2.isInitializationFailFast;
        boolean boolean6 = hikariDataSource2.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str9, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-33" + "'", str10, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-33" + "'", str11, "HikariPool-33");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = simpleLogger6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        hikariDataSource5.setAcquireIncrement((int) (short) 1);
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
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        hikariDataSource3.setAutoCommit(false);
        hikariDataSource3.minPoolSize = 0;
        java.util.Properties properties8 = hikariDataSource3.getDataSourceProperties();
        hikariDataSource3.setisInitializationFailFast(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties12 = serializedObjectSupporter11.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter11.deserializeObjectHikariDataSource8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter11.deserializeObjectHikariDataSource12();
        java.util.Properties properties15 = serializedObjectSupporter11.deserializeObjectProperties1();
        hikariDataSource3.setDataSourceProperties(properties15);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.getminPoolSize();
        hikariConfig0.setMinimumPoolSize(103);
        java.lang.String str6 = hikariConfig0.poolName;
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setisReadOnly(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-105" + "'", str6, "HikariPool-105");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        int int6 = hikariDataSource5.getAcquireIncrement();
        boolean boolean7 = hikariDataSource5.getisIsolateInternalQueries();
        boolean boolean8 = hikariDataSource5.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter7.deserializeObjectHikariDataSource17();
        hikariDataSource10.setInitializationFailFast(true);
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setpoolNumber((int) 'a');
        hikariDataSource1.setAcquireRetryDelay((long) 4);
        hikariDataSource1.setConnectionTestQuery("hi!");
        hikariDataSource1.setConnectionTestQuery("com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.validate();
        java.util.Properties properties3 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setDataSourceClassName("HikariPool-4");
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        hikariDataSource2.setMaxLifetime((long) 100);
        long long5 = hikariDataSource2.acquireRetryDelay;
        long long6 = hikariDataSource2.getAcquireRetryDelay();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource2();
        int int10 = hikariDataSource9.getAcquireIncrement();
        boolean boolean11 = hikariDataSource9.isJdbc4connectionTest;
        hikariDataSource9.setMaxLifetime((long) (byte) 0);
        boolean boolean14 = hikariDataSource9.isAutoCommit;
        boolean boolean15 = hikariDataSource9.isAutoCommit();
        boolean boolean16 = hikariDataSource9.isIsolateInternalQueries();
        hikariDataSource2.addDataSourceProperty("", (java.lang.Object) boolean16);
        hikariDataSource2.maxPoolSize = (short) 0;
        boolean boolean20 = hikariDataSource2.isReadOnly();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.setisReadOnly(false);
        hikariDataSource1.setisIsolateInternalQueries(false);
        int int6 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionTimeout(100L);
        hikariDataSource1.transactionIsolationName = "";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        hikariDataSource5.setisJdbc4connectionTest(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter14 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter14.deserializeObjectHikariDataSource2();
        java.lang.String str16 = serializedObjectSupporter14.deserializeObjectString5();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter14.deserializeObjectHikariDataSource8();
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter14.deserializeObjectHikariDataSource5();
        hikariDataSource5.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource20);
        int int22 = hikariDataSource5.maxPoolSize;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-4" + "'", str11, "HikariPool-4");
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SELECT 1" + "'", str16, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str17, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-32" + "'", str19, "HikariPool-32");
        org.junit.Assert.assertNotNull(hikariDataSource20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        hikariDataSource1.connectionTimeout = (-1);
        boolean boolean8 = hikariDataSource1.isInitializationFailFast;
        java.util.Properties properties9 = hikariDataSource1.dataSourceProperties;
        java.lang.Class<?> wildcardClass10 = hikariDataSource1.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        long long4 = hikariDataSource3.getCONNECTION_TIMEOUT();
        long long5 = hikariDataSource3.getMAX_LIFETIME();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        hikariDataSource1.jdbcUrl = "HikariPool-32";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.zaxxer.hikari.HikariConfig.poolNumber = 114;
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        int int4 = hikariDataSource1.maxPoolSize;
        java.lang.String str5 = hikariDataSource1.getCatalog();
        hikariDataSource1.catalog = "HikariPool-4";
        hikariDataSource1.setisIsolateInternalQueries(true);
        hikariDataSource1.transactionIsolation = (byte) 1;
        int int12 = hikariDataSource1.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        boolean boolean4 = hikariDataSource1.getisIsolateInternalQueries();
        hikariDataSource1.minPoolSize = (-1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter3 = hikariDataSource2.serializedObjectSupporter;
        hikariDataSource2.setCatalog("hi!");
        hikariDataSource2.maxLifetime = (byte) 10;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource7.idleTimeout = 100;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        long long18 = hikariDataSource5.getACQUIRE_RETRY_DELAY();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter2 = hikariDataSource1.serializedObjectSupporter;
        hikariDataSource1.setIsolateInternalQueries(true);
        hikariDataSource1.acquireIncrement = (byte) 100;
        boolean boolean7 = hikariDataSource1.isIsolateInternalQueries();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setConnectionInitSql("VALUES 1");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariDataSource1.connectionCustomizer = iConnectionCustomizer10;
        hikariDataSource1.setMinimumPoolSize(33);
        hikariDataSource1.setAutoCommit(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        hikariDataSource6.setInitializationFailFast(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str5, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str19 = hikariDataSource1.dataSourceClassName;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str19, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        hikariDataSource1.setisRegisterMbeans(true);
        boolean boolean7 = hikariDataSource1.isJdbc4connectionTest;
        int int8 = hikariDataSource1.transactionIsolation;
        java.lang.Class<?> wildcardClass9 = hikariDataSource1.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        long long3 = hikariDataSource2.getLeakDetectionThreshold();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource3.setConnectionTestQuery("HikariPool-32");
        hikariDataSource3.setisIsolateInternalQueries(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource5.leakDetectionThreshold = 5000L;
        long long8 = hikariDataSource5.maxLifetime;
        hikariDataSource5.transactionIsolationName = "HikariPool-20";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("TRANSACTION_READ_COMMITTED");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file TRANSACTION_READ_COMMITTED was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        hikariDataSource1.jdbcUrl = "hi!";
        boolean boolean4 = hikariDataSource1.getisJdbc4connectionTest();
        long long5 = hikariDataSource1.getCONNECTION_TIMEOUT();
        hikariDataSource1.leakDetectionThreshold = (short) -1;
        boolean boolean8 = hikariDataSource1.getisInitializationFailFast();
        boolean boolean9 = hikariDataSource1.isIsolateInternalQueries;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.connectionTestQuery = "HikariPool-33";
        int int3 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        java.lang.String str5 = hikariConfig0.jdbcUrl;
        hikariConfig0.setReadOnly(false);
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.Properties properties1 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        hikariDataSource3.setminPoolSize((int) (short) 10);
        java.lang.String str6 = hikariDataSource3.jdbcUrl;
        int int7 = hikariDataSource3.getAcquireRetries();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        hikariDataSource1.isReadOnly = false;
        hikariDataSource1.minPoolSize = (byte) 0;
        hikariDataSource1.validate();
        hikariDataSource1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        hikariConfig5.settransactionIsolationName("HikariPool-4");
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-6" + "'", str4, "HikariPool-6");
        org.junit.Assert.assertNotNull(hikariConfig5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource2();
        int int13 = hikariDataSource12.getAcquireIncrement();
        long long14 = hikariDataSource12.getLeakDetectionThreshold();
        hikariDataSource12.maxPoolSize = (short) 1;
        java.util.Properties properties17 = hikariDataSource12.dataSourceProperties;
        hikariDataSource3.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean20 = hikariConfig19.isIsolateInternalQueries;
        java.lang.String str21 = hikariConfig19.getConnectionTestQuery();
        long long22 = hikariConfig19.getAcquireRetryDelay();
        int int23 = hikariConfig19.getmaxPoolSize();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "VALUES 1" + "'", str10, "VALUES 1");
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        int int3 = hikariDataSource1.getMaximumPoolSize();
        hikariDataSource1.setCatalog("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.setCatalog("TRANSACTION_REPEATABLE_READ");
        hikariDataSource1.setConnectionInitSql("VALUES 1");
        hikariDataSource1.setReadOnly(true);
        long long12 = hikariDataSource1.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str2 = hikariDataSource1.dataSourceClassName;
        hikariDataSource1.isRegisterMbeans = true;
        long long5 = hikariDataSource1.connectionTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNotNull(hikariConfig4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.getLeakDetectionThreshold();
        hikariDataSource1.setpoolNumber((int) (short) -1);
        int int6 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setMinimumPoolSize((int) (short) 1);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariConfig hikariConfig1 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        hikariConfig1.catalog = "HikariPool-33";
        hikariConfig1.maxLifetime = (byte) -1;
        long long6 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter7 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter7.deserializeObjectHikariDataSource5();
        hikariConfig1.serializedObjectSupporter = serializedObjectSupporter7;
        long long10 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNotNull(hikariConfig1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        hikariDataSource3.acquireRetryDelay = (short) 10;
        java.lang.String str6 = hikariDataSource3.gettransactionIsolationName();
        hikariDataSource3.isRegisterMbeans = true;
        long long9 = hikariDataSource3.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TRANSACTION_READ_COMMITTED" + "'", str6, "TRANSACTION_READ_COMMITTED");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        hikariDataSource1.setAcquireRetries((int) (short) 100);
        boolean boolean15 = hikariDataSource1.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        java.lang.String str10 = hikariDataSource1.catalog;
        int int11 = hikariDataSource1.getTransactionIsolation();
        hikariDataSource1.idleTimeout = (-1L);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        hikariDataSource3.setAcquireRetries(0);
        javax.sql.DataSource dataSource6 = hikariDataSource3.getDataSource();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        hikariDataSource1.connectionTimeout = 500L;
        java.lang.String str6 = hikariDataSource1.connectionTestQuery;
        hikariDataSource1.acquireRetries = 4;
        hikariDataSource1.isRegisterMbeans = true;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VALUES 1" + "'", str6, "VALUES 1");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        int int5 = hikariDataSource4.getTransactionIsolation();
        long long6 = hikariDataSource4.getAcquireRetryDelay();
        boolean boolean7 = hikariDataSource4.isReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        hikariDataSource4.jdbcUrl = "HikariPool-97";
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariConfig3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        long long3 = hikariDataSource1.connectionTimeout;
        hikariDataSource1.setisIsolateInternalQueries(true);
        hikariDataSource1.setReadOnly(true);
        hikariDataSource1.setReadOnly(false);
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        long long5 = hikariDataSource4.getConnectionTimeout();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str3, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariDataSource1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter6.deserializeObjectHikariDataSource7();
        hikariDataSource1.copyState((com.zaxxer.hikari.HikariConfig) hikariDataSource8);
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource8.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariDataSource4.copyState(hikariConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Exception copying HikariConfig state: null");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        hikariDataSource3.setIdleTimeout((long) (byte) 1);
        hikariDataSource3.leakDetectionThreshold = (short) 0;
        hikariDataSource3.acquireIncrement = 0;
        hikariDataSource3.isReadOnly = true;
        java.lang.String str12 = hikariDataSource3.getDataSourceClassName();
        boolean boolean13 = hikariDataSource3.getisReadOnly();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str12, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        hikariDataSource1.settransactionIsolationName("hi!");
        hikariDataSource1.acquireRetries = (short) 10;
        hikariDataSource1.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        hikariDataSource1.poolName = "";
        long long11 = hikariDataSource1.idleTimeout;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        int int2 = hikariDataSource1.getAcquireIncrement();
        boolean boolean3 = hikariDataSource1.isJdbc4connectionTest;
        boolean boolean4 = hikariDataSource1.getisAutoCommit();
        int int5 = hikariDataSource1.maxPoolSize;
        hikariDataSource1.setConnectionCustomizerClassName("HikariPool-4");
        hikariDataSource1.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariDataSource1.maxPoolSize = (-1);
        hikariDataSource1.acquireRetries = 0;
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.Class<?> wildcardClass14 = hikariDataSource1.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}
