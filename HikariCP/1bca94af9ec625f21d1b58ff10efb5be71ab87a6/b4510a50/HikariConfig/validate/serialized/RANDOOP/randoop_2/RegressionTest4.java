import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-6");
        long long12 = hikariConfig5.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger15 = serializedObjectSupporter13.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter13.deserializeObjectHikariDataSource10();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter13;
        hikariConfig5.setisInitializationFailFast(false);
        int int21 = hikariConfig5.getMinimumPoolSize();
        java.lang.String str22 = hikariConfig5.poolName;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(simpleLogger15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-28" + "'", str22, "HikariPool-28");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig5.setTransactionIsolation("com.zaxxer.hikari.mocks.StubDataSource");
        long long14 = hikariConfig5.getConnectionTimeout();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        long long21 = hikariConfig5.getIdleTimeout();
        hikariConfig5.setisAutoCommit(true);
        long long24 = hikariConfig5.connectionTimeout;
        java.lang.String str25 = hikariConfig5.connectionTestQuery;
        hikariConfig5.setMaxLifetime((long) 25);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        java.util.Properties properties25 = hikariConfig5.dataSourceProperties;
        java.lang.String str26 = hikariConfig5.getDataSourceClassName();
        int int27 = hikariConfig5.maxPoolSize;
        java.lang.String str28 = hikariConfig5.poolName;
        hikariConfig5.maxPoolSize = 112;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-32" + "'", str28, "HikariPool-32");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig13.connectionCustomizer;
        long long26 = hikariConfig13.getAcquireRetryDelay();
        javax.sql.DataSource dataSource27 = hikariConfig13.dataSource;
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-42");
        long long30 = hikariConfig13.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig5.poolName = "HikariPool-33";
        long long12 = hikariConfig5.getConnectionTimeout();
        boolean boolean13 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.connectionInitSql = "HikariPool-57";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        java.lang.String str10 = hikariConfig5.transactionIsolationName;
        boolean boolean11 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.isInitializationFailFast = false;
        javax.sql.DataSource dataSource14 = hikariConfig5.dataSource;
        hikariConfig5.setAcquireRetryDelay((long) '4');
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter17.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter17.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter17.deserializeObjectHikariConfig3();
        java.util.Properties properties21 = serializedObjectSupporter17.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setRegisterMbeans(true);
        hikariConfig22.setAcquireRetryDelay(10L);
        boolean boolean27 = hikariConfig22.getisInitializationFailFast();
        hikariConfig22.idleTimeout = 0L;
        hikariConfig22.connectionTimeout = (byte) 0;
        int int32 = hikariConfig22.getpoolNumber();
        java.util.Properties properties33 = hikariConfig22.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties33);
        javax.sql.DataSource dataSource35 = hikariConfig5.getDataSource();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 39 + "'", int32 == 39);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(dataSource35);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-33" + "'", str7, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariConfig9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        hikariConfig5.maxPoolSize = '#';
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-13");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig5.dataSourceProperties = properties10;
        hikariConfig5.setLeakDetectionThreshold((long) (byte) -1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig5.connectionCustomizer = iConnectionCustomizer15;
        boolean boolean17 = hikariConfig5.isRegisterMbeans();
        hikariConfig5.connectionCustomizerClassName = "HikariPool-72";
        java.lang.String str20 = hikariConfig5.gettransactionIsolationName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig5.connectionCustomizer;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.setPoolName("TRANSACTION_REPEATABLE_READ");
        long long15 = hikariConfig5.getCONNECTION_TIMEOUT();
        hikariConfig5.setMaxLifetime((long) (short) 1);
        boolean boolean18 = hikariConfig5.isInitializationFailFast;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisAutoCommit();
        int int11 = hikariConfig5.getAcquireIncrement();
        hikariConfig5.setmaxPoolSize((int) (short) 100);
        hikariConfig5.setConnectionTestQuery("HikariPool-57");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-6");
        long long12 = hikariConfig5.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger15 = serializedObjectSupporter13.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter13.deserializeObjectHikariDataSource10();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter13;
        hikariConfig5.setisInitializationFailFast(false);
        hikariConfig5.setConnectionInitSql("HikariPool-123");
        hikariConfig5.setLeakDetectionThreshold((long) 100);
        hikariConfig5.setMaximumPoolSize(27);
        boolean boolean27 = hikariConfig5.getisInitializationFailFast();
        int int28 = hikariConfig5.maxPoolSize;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(simpleLogger15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 27 + "'", int28 == 27);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        long long6 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setInitializationFailFast(true);
        java.lang.String str9 = hikariConfig5.catalog;
        hikariConfig5.setAutoCommit(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariConfig4);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.isInitializationFailFast = true;
        long long11 = hikariConfig5.getCONNECTION_TIMEOUT();
        hikariConfig5.setMaxLifetime((long) (byte) 1);
        hikariConfig5.minPoolSize = 0;
        int int16 = hikariConfig5.getmaxPoolSize();
        hikariConfig5.connectionTimeout = 18;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        java.lang.String str13 = hikariConfig5.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString8();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        hikariConfig5.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter15);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter15.deserializeObjectHikariDataSource5();
        java.lang.String str25 = serializedObjectSupporter15.deserializeObjectString8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-33" + "'", str18, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-33" + "'", str19, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariConfig22);
        org.junit.Assert.assertNull(hikariDataSource23);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-33" + "'", str25, "HikariPool-33");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long18 = hikariConfig5.leakDetectionThreshold;
        boolean boolean19 = hikariConfig5.getisRegisterMbeans();
        hikariConfig5.acquireRetries = (byte) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = hikariConfig5.serializedObjectSupporter;
        hikariConfig5.isJdbc4connectionTest = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter25.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter25.deserializeObjectHikariConfig3();
        java.util.Properties properties29 = serializedObjectSupporter25.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setRegisterMbeans(true);
        hikariConfig30.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        java.util.Properties properties35 = hikariConfig30.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties35);
        hikariConfig5.maxPoolSize = 52;
        hikariConfig5.isRegisterMbeans = false;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
        org.junit.Assert.assertNull(hikariDataSource26);
        org.junit.Assert.assertNull(hikariConfig27);
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        hikariConfig5.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        int int20 = hikariConfig5.transactionIsolation;
        hikariConfig5.settransactionIsolationName("HikariPool-38");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setisAutoCommit(true);
        hikariConfig5.setAcquireRetryDelay((long) (short) 0);
        hikariConfig5.catalog = "hi!";
        boolean boolean18 = hikariConfig5.getisJdbc4connectionTest();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        long long21 = hikariConfig5.getIdleTimeout();
        hikariConfig5.setisAutoCommit(true);
        long long24 = hikariConfig5.connectionTimeout;
        org.slf4j.Logger logger25 = hikariConfig5.getLOGGER();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNotNull(logger25);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long18 = hikariConfig5.leakDetectionThreshold;
        boolean boolean19 = hikariConfig5.getisRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig5.getConnectionCustomizer();
        hikariConfig5.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.setPoolName("TRANSACTION_REPEATABLE_READ");
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-162");
        hikariConfig5.transactionIsolationName = "HikariPool-61";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter11 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter11.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter11.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter11.deserializeObjectHikariConfig3();
        java.util.Properties properties15 = serializedObjectSupporter11.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig16.dataSource = dataSource19;
        hikariConfig16.connectionInitSql = "HikariPool-33";
        hikariConfig16.setAcquireIncrement(52);
        hikariConfig5.addDataSourceProperty("HikariPool-23", (java.lang.Object) hikariConfig16);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNull(hikariConfig14);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        hikariConfig5.setUseInstrumentation(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig5.getConnectionCustomizer();
        hikariConfig5.setAcquireRetryDelay(1L);
        boolean boolean12 = hikariConfig5.getisRegisterMbeans();
        boolean boolean13 = hikariConfig5.isJdbc4connectionTest;
        long long14 = hikariConfig5.getAcquireRetryDelay();
        int int15 = hikariConfig5.getAcquireRetries();
        java.util.Properties properties16 = hikariConfig5.dataSourceProperties;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.setAcquireRetryDelay(10L);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig5.dataSource = dataSource10;
        long long12 = hikariConfig5.connectionTimeout;
        boolean boolean13 = hikariConfig5.isAutoCommit();
        hikariConfig5.connectionCustomizerClassName = "HikariPool-137";
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig5.addDataSourceProperty("HikariPool-91", (java.lang.Object) boolean18);
        boolean boolean20 = hikariConfig5.isAutoCommit;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter22.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter22.deserializeObjectHikariConfig1();
        hikariConfig5.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter22);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter26.deserializeObjectHikariDataSource2();
        java.util.Properties properties29 = serializedObjectSupporter26.deserializeObjectProperties1();
        hikariConfig5.setDataSourceProperties(properties29);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(hikariDataSource23);
        org.junit.Assert.assertNull(hikariConfig24);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertNull(hikariDataSource28);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long18 = hikariConfig5.leakDetectionThreshold;
        boolean boolean19 = hikariConfig5.getisRegisterMbeans();
        hikariConfig5.acquireRetries = (byte) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter22 = hikariConfig5.serializedObjectSupporter;
        hikariConfig5.maxLifetime = (short) 10;
        hikariConfig5.setRegisterMbeans(false);
        int int27 = hikariConfig5.acquireRetries;
        hikariConfig5.acquireRetries = 2;
        boolean boolean30 = hikariConfig5.isInitializationFailFast;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        java.lang.String str10 = hikariConfig5.transactionIsolationName;
        boolean boolean11 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.isInitializationFailFast = false;
        int int14 = hikariConfig5.acquireRetries;
        hikariConfig5.setUseInstrumentation(false);
        hikariConfig5.setMaximumPoolSize(1);
        long long19 = hikariConfig5.getAcquireRetryDelay();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.lang.String str18 = hikariConfig5.getConnectionInitSql();
        java.lang.String str19 = hikariConfig5.getConnectionTestQuery();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        hikariConfig5.setTransactionIsolation("HikariPool-33");
        boolean boolean16 = hikariConfig5.isRegisterMbeans();
        hikariConfig5.setRegisterMbeans(true);
        java.lang.String str19 = hikariConfig5.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        hikariConfig5.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig5.setAutoCommit(true);
        javax.sql.DataSource dataSource22 = hikariConfig5.dataSource;
        long long23 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean24 = hikariConfig5.getisJdbc4connectionTest();
        java.lang.String str25 = hikariConfig5.getDataSourceClassName();
        boolean boolean26 = hikariConfig5.isAutoCommit();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-32" + "'", str2, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariConfig6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.isInitializationFailFast = true;
        long long11 = hikariConfig5.getCONNECTION_TIMEOUT();
        hikariConfig5.setMaxLifetime((long) (byte) 1);
        hikariConfig5.minPoolSize = 0;
        int int16 = hikariConfig5.getmaxPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig5.getConnectionCustomizer();
        hikariConfig5.setConnectionTestQuery("HikariPool-50");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.util.Properties properties6 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SELECT 1" + "'", str7, "SELECT 1");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-33" + "'", str9, "HikariPool-33");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig5.connectionCustomizerClassName = "HikariPool-97";
        boolean boolean14 = hikariConfig5.isJdbc4ConnectionTest();
        int int15 = hikariConfig5.transactionIsolation;
        boolean boolean16 = hikariConfig5.isAutoCommit();
        java.lang.String str17 = hikariConfig5.poolName;
        java.util.Properties properties18 = hikariConfig5.dataSourceProperties;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-78" + "'", str17, "HikariPool-78");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariConfig7);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setisAutoCommit(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig5.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig5.setisRegisterMbeans(false);
        hikariConfig5.setisInitializationFailFast(false);
        long long20 = hikariConfig5.getMaxLifetime();
        hikariConfig5.setisRegisterMbeans(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setminPoolSize((int) (short) 0);
        hikariConfig5.transactionIsolation = 10;
        int int16 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setisJdbc4connectionTest(true);
        boolean boolean19 = hikariConfig5.isInitializationFailFast();
        java.lang.String str20 = hikariConfig5.getCatalog();
        hikariConfig5.setDataSourceClassName("HikariPool-91");
        hikariConfig5.idleTimeout = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig5.getConnectionCustomizer();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        hikariConfig5.setisJdbc4connectionTest(false);
        long long23 = hikariConfig5.getConnectionTimeout();
        java.lang.String str24 = hikariConfig5.getConnectionTestQuery();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        boolean boolean20 = hikariConfig13.isRegisterMbeans;
        java.lang.String str21 = hikariConfig13.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString8();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter23);
        hikariConfig5.copyState(hikariConfig13);
        hikariConfig5.setAutoCommit(false);
        hikariConfig5.setConnectionInitSql("HikariPool-205");
        hikariConfig5.setminPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-33" + "'", str26, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-33" + "'", str27, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig28);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-6");
        hikariConfig5.setLeakDetectionThreshold((long) (byte) 10);
        int int14 = hikariConfig5.acquireRetries;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter21;
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter21.deserializeObjectHikariDataSource2();
        java.lang.String str25 = serializedObjectSupporter21.deserializeObjectString7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-32" + "'", str25, "HikariPool-32");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig5.poolName = "HikariPool-33";
        long long12 = hikariConfig5.getConnectionTimeout();
        hikariConfig5.dataSourceClassName = "SELECT 1";
        long long15 = hikariConfig5.getMaxLifetime();
        java.lang.String str16 = hikariConfig5.transactionIsolationName;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.util.Properties properties2 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setInitializationFailFast(false);
        hikariConfig3.acquireRetries = 27;
        hikariConfig3.setConnectionTestQuery("HikariPool-46");
        hikariConfig3.setCatalog("HikariPool-74");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(properties2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long18 = hikariConfig5.leakDetectionThreshold;
        boolean boolean19 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str20 = hikariConfig5.getCatalog();
        long long21 = hikariConfig5.leakDetectionThreshold;
        hikariConfig5.setIdleTimeout(5000L);
        hikariConfig5.isRegisterMbeans = false;
        hikariConfig5.setAutoCommit(false);
        javax.sql.DataSource dataSource28 = hikariConfig5.dataSource;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(dataSource28);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        hikariConfig5.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig5.setAutoCommit(true);
        javax.sql.DataSource dataSource22 = hikariConfig5.dataSource;
        long long23 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean24 = hikariConfig5.getisJdbc4connectionTest();
        java.lang.String str25 = hikariConfig5.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig5.connectionCustomizer;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setisAutoCommit(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig5.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig5.setMaxLifetime(0L);
        hikariConfig5.setTransactionIsolation("HikariPool-91");
        hikariConfig5.setTransactionIsolation("HikariPool-89");
        hikariConfig5.setAcquireRetryDelay((long) (short) 100);
        int int24 = hikariConfig5.getpoolNumber();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 95 + "'", int24 == 95);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str3, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        java.lang.String str13 = hikariConfig5.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getCatalog();
        boolean boolean17 = hikariConfig15.isAutoCommit();
        java.lang.String str18 = hikariConfig15.poolName;
        hikariConfig5.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) hikariConfig15);
        int int20 = hikariConfig15.maxPoolSize;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-96" + "'", str18, "HikariPool-96");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setminPoolSize((int) (short) 0);
        hikariConfig5.transactionIsolation = 10;
        int int16 = hikariConfig5.getTransactionIsolation();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig5.dataSource = dataSource17;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig5.dataSourceProperties = properties10;
        hikariConfig5.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean15 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.catalog = "hi!";
        java.lang.String str18 = hikariConfig5.connectionInitSql;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig5.setDataSource(dataSource19);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter21.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = serializedObjectSupporter21.deserializeObjectHikariConfig3();
        java.util.Properties properties25 = serializedObjectSupporter21.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setRegisterMbeans(true);
        hikariConfig26.isInitializationFailFast = true;
        boolean boolean31 = hikariConfig26.getisRegisterMbeans();
        long long32 = hikariConfig26.getIDLE_TIMEOUT();
        hikariConfig26.setminPoolSize((int) (short) 0);
        long long35 = hikariConfig26.getLeakDetectionThreshold();
        hikariConfig26.leakDetectionThreshold = (byte) 10;
        org.slf4j.Logger logger38 = hikariConfig26.getLOGGER();
        hikariConfig5.copyState(hikariConfig26);
        int int40 = hikariConfig5.acquireRetries;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(hikariConfig23);
        org.junit.Assert.assertNull(hikariConfig24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setpoolNumber(60);
        hikariConfig5.idleTimeout = 64;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setminPoolSize((int) (byte) -1);
        hikariConfig5.setpoolNumber((int) '#');
        int int16 = hikariConfig5.getminPoolSize();
        hikariConfig5.transactionIsolationName = "HikariPool-14";
        java.lang.String str19 = hikariConfig5.getConnectionInitSql();
        boolean boolean20 = hikariConfig5.getisAutoCommit();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-33" + "'", str19, "HikariPool-33");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        int int14 = hikariConfig5.getminPoolSize();
        hikariConfig5.setpoolNumber(17);
        org.slf4j.Logger logger17 = hikariConfig5.getLOGGER();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter18.deserializeObjectHikariConfig3();
        java.util.Properties properties22 = serializedObjectSupporter18.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter27 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource28 = serializedObjectSupporter27.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = serializedObjectSupporter27.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = serializedObjectSupporter27.deserializeObjectHikariConfig3();
        java.util.Properties properties31 = serializedObjectSupporter27.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig32.setMaxLifetime((long) (short) 0);
        hikariConfig23.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long36 = hikariConfig23.leakDetectionThreshold;
        boolean boolean37 = hikariConfig23.getisRegisterMbeans();
        hikariConfig23.acquireRetries = (byte) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter40 = hikariConfig23.serializedObjectSupporter;
        hikariConfig23.maxLifetime = (short) 10;
        hikariConfig23.setRegisterMbeans(false);
        int int45 = hikariConfig23.acquireRetries;
        hikariConfig5.copyState(hikariConfig23);
        boolean boolean47 = hikariConfig23.getisJdbc4connectionTest();
        hikariConfig23.isAutoCommit = true;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(hikariDataSource28);
        org.junit.Assert.assertNull(hikariConfig29);
        org.junit.Assert.assertNull(hikariConfig30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter21;
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter21.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter21.deserializeObjectHikariDataSource14();
        java.lang.String str26 = serializedObjectSupporter21.deserializeObjectString5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariDataSource25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "SELECT 1" + "'", str26, "SELECT 1");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.minPoolSize = ' ';
        hikariConfig5.acquireRetries = '#';
        hikariConfig5.setisInitializationFailFast(false);
        int int14 = hikariConfig5.maxPoolSize;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        hikariConfig5.isJdbc4connectionTest = true;
        hikariConfig5.dataSourceClassName = "HikariPool-32";
        hikariConfig5.setConnectionTestQuery("SELECT 1");
        hikariConfig5.maxPoolSize = 27;
        long long29 = hikariConfig5.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        java.util.Properties properties25 = hikariConfig5.dataSourceProperties;
        boolean boolean26 = hikariConfig5.isRegisterMbeans();
        hikariConfig5.connectionCustomizerClassName = "HikariPool-20";
        long long29 = hikariConfig5.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        long long25 = hikariConfig5.getCONNECTION_TIMEOUT();
        int int26 = hikariConfig5.getMaximumPoolSize();
        boolean boolean27 = hikariConfig5.isInitializationFailFast();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-32" + "'", str3, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-32" + "'", str7, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-32" + "'", str10, "HikariPool-32");
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        boolean boolean12 = hikariConfig5.getisInitializationFailFast();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        java.lang.String str13 = hikariConfig5.getCatalog();
        hikariConfig5.setisRegisterMbeans(true);
        boolean boolean16 = hikariConfig5.isAutoCommit;
        java.lang.String str17 = hikariConfig5.getCatalog();
        hikariConfig5.setisInitializationFailFast(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setAcquireIncrement(52);
        long long14 = hikariConfig5.connectionTimeout;
        hikariConfig5.settransactionIsolationName("HikariPool-7");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        hikariConfig5.isAutoCommit = true;
        hikariConfig5.maxLifetime = 100;
        hikariConfig5.setisInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter20 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter20.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter20.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = serializedObjectSupporter20.deserializeObjectHikariConfig3();
        java.util.Properties properties24 = serializedObjectSupporter20.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig25.dataSource = dataSource28;
        hikariConfig25.connectionInitSql = "HikariPool-33";
        hikariConfig25.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter35 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource36 = serializedObjectSupporter35.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource37 = serializedObjectSupporter35.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource38 = serializedObjectSupporter35.deserializeObjectHikariDataSource2();
        hikariConfig25.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) serializedObjectSupporter35);
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter35;
        java.util.Properties properties41 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource21);
        org.junit.Assert.assertNull(hikariConfig22);
        org.junit.Assert.assertNull(hikariConfig23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(hikariDataSource36);
        org.junit.Assert.assertNull(hikariDataSource37);
        org.junit.Assert.assertNull(hikariDataSource38);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        long long6 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.maxPoolSize = (short) 0;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter9.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter9.deserializeObjectHikariDataSource5();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        hikariConfig5.dataSourceProperties = properties13;
        hikariConfig5.setmaxPoolSize(0);
        hikariConfig5.setpoolNumber(11);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter19.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter19.deserializeObjectHikariConfig3();
        java.util.Properties properties23 = serializedObjectSupporter19.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter28 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter28.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = serializedObjectSupporter28.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = serializedObjectSupporter28.deserializeObjectHikariConfig3();
        java.util.Properties properties32 = serializedObjectSupporter28.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setMaxLifetime((long) (short) 0);
        hikariConfig24.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long37 = hikariConfig24.leakDetectionThreshold;
        boolean boolean38 = hikariConfig24.getisRegisterMbeans();
        hikariConfig24.acquireRetries = (byte) 100;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter41 = hikariConfig24.serializedObjectSupporter;
        hikariConfig24.isJdbc4connectionTest = false;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter44 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource45 = serializedObjectSupporter44.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig46 = serializedObjectSupporter44.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = serializedObjectSupporter44.deserializeObjectHikariConfig3();
        java.util.Properties properties48 = serializedObjectSupporter44.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig49.setRegisterMbeans(true);
        hikariConfig49.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        java.util.Properties properties54 = hikariConfig49.dataSourceProperties;
        hikariConfig24.setDataSourceProperties(properties54);
        hikariConfig24.isRegisterMbeans = true;
        hikariConfig24.acquireRetries = 32;
        hikariConfig24.connectionInitSql = "";
        hikariConfig5.copyState(hikariConfig24);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(hikariDataSource20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariConfig22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(hikariDataSource29);
        org.junit.Assert.assertNull(hikariConfig30);
        org.junit.Assert.assertNull(hikariConfig31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter41);
        org.junit.Assert.assertNull(hikariDataSource45);
        org.junit.Assert.assertNull(hikariConfig46);
        org.junit.Assert.assertNull(hikariConfig47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        long long6 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setPoolName("HikariPool-97");
        hikariConfig5.setisInitializationFailFast(false);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter12 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter12.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = serializedObjectSupporter12.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter12.deserializeObjectHikariConfig3();
        java.util.Properties properties16 = serializedObjectSupporter12.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getIDLE_TIMEOUT();
        hikariConfig17.setPoolName("HikariPool-97");
        hikariConfig17.setisInitializationFailFast(false);
        hikariConfig5.addDataSourceProperty("HikariPool-6", (java.lang.Object) hikariConfig17);
        hikariConfig5.setminPoolSize(10);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter26 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource27 = serializedObjectSupporter26.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter26.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = serializedObjectSupporter26.deserializeObjectHikariConfig3();
        java.util.Properties properties30 = serializedObjectSupporter26.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean32 = hikariConfig31.getisRegisterMbeans();
        java.lang.String str33 = hikariConfig31.getConnectionTestQuery();
        hikariConfig31.setAcquireRetries((int) '4');
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-6");
        long long38 = hikariConfig31.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter39 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource40 = serializedObjectSupporter39.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger41 = serializedObjectSupporter39.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource42 = serializedObjectSupporter39.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource43 = serializedObjectSupporter39.deserializeObjectHikariDataSource10();
        hikariConfig31.serializedObjectSupporter = serializedObjectSupporter39;
        java.util.Properties properties45 = serializedObjectSupporter39.deserializeObjectProperties1();
        hikariConfig5.setDataSourceProperties(properties45);
        java.lang.String str47 = hikariConfig5.transactionIsolationName;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariConfig14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource27);
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNull(hikariConfig29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 600000L + "'", long38 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource40);
        org.junit.Assert.assertNotNull(simpleLogger41);
        org.junit.Assert.assertNull(hikariDataSource42);
        org.junit.Assert.assertNull(hikariDataSource43);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig13.connectionCustomizer;
        long long26 = hikariConfig13.getAcquireRetryDelay();
        javax.sql.DataSource dataSource27 = hikariConfig13.dataSource;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter28 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter28.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = serializedObjectSupporter28.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = serializedObjectSupporter28.deserializeObjectHikariConfig3();
        java.util.Properties properties32 = serializedObjectSupporter28.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setMaximumPoolSize(1);
        hikariConfig13.copyState(hikariConfig33);
        java.lang.String str37 = hikariConfig13.getConnectionInitSql();
        int int38 = hikariConfig13.getAcquireIncrement();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(hikariDataSource29);
        org.junit.Assert.assertNull(hikariConfig30);
        org.junit.Assert.assertNull(hikariConfig31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        int int13 = hikariConfig5.getAcquireRetries();
        hikariConfig5.isRegisterMbeans = false;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELECT 1" + "'", str2, "SELECT 1");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setminPoolSize((int) (short) 0);
        long long14 = hikariConfig5.getLeakDetectionThreshold();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = hikariConfig5.serializedObjectSupporter;
        boolean boolean16 = hikariConfig5.isAutoCommit;
        long long17 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean18 = hikariConfig5.isAutoCommit();
        long long19 = hikariConfig5.getMaxLifetime();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        hikariConfig5.leakDetectionThreshold = 1;
        java.lang.String str27 = hikariConfig5.catalog;
        hikariConfig5.setisInitializationFailFast(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.poolName = "HikariPool-32";
        hikariConfig5.maxPoolSize = (-1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter17.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter17.deserializeObjectHikariConfig1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString8();
        java.lang.String str21 = serializedObjectSupporter17.deserializeObjectString8();
        java.util.Properties properties22 = serializedObjectSupporter17.deserializeObjectProperties1();
        hikariConfig5.dataSourceProperties = properties22;
        hikariConfig5.setpoolNumber(70);
        hikariConfig5.settransactionIsolationName("HikariPool-38");
        boolean boolean28 = hikariConfig5.isAutoCommit();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-33" + "'", str20, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-33" + "'", str21, "HikariPool-33");
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        hikariConfig5.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) serializedObjectSupporter15);
        hikariConfig5.setpoolNumber((-1));
        java.lang.String str22 = hikariConfig5.dataSourceClassName;
        hikariConfig5.maxPoolSize = '4';
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        java.lang.String str10 = hikariConfig5.transactionIsolationName;
        boolean boolean11 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.setisJdbc4connectionTest(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        java.util.Properties properties25 = hikariConfig5.dataSourceProperties;
        java.lang.String str26 = hikariConfig5.getDataSourceClassName();
        hikariConfig5.maxLifetime = (byte) -1;
        int int29 = hikariConfig5.acquireRetries;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        hikariConfig5.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter16.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter16.deserializeObjectHikariConfig3();
        java.util.Properties properties20 = serializedObjectSupporter16.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setMaximumPoolSize(1);
        hikariConfig5.copyState(hikariConfig21);
        hikariConfig5.setJdbc4ConnectionTest(false);
        hikariConfig5.setPoolName("HikariPool-6");
        javax.sql.DataSource dataSource29 = hikariConfig5.dataSource;
        int int30 = hikariConfig5.getMaximumPoolSize();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long18 = hikariConfig5.leakDetectionThreshold;
        boolean boolean19 = hikariConfig5.getisRegisterMbeans();
        hikariConfig5.acquireRetries = (byte) 100;
        hikariConfig5.setAutoCommit(true);
        hikariConfig5.setRegisterMbeans(true);
        long long26 = hikariConfig5.maxLifetime;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter6;
        hikariConfig5.connectionCustomizerClassName = "HikariPool-40";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        java.util.Properties properties25 = hikariConfig13.dataSourceProperties;
        hikariConfig13.connectionCustomizerClassName = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean28 = hikariConfig13.getisAutoCommit();
        java.lang.String str29 = hikariConfig13.getPoolName();
        hikariConfig13.setRegisterMbeans(false);
        int int32 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.leakDetectionThreshold = 112;
        int int35 = hikariConfig13.getTransactionIsolation();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-7" + "'", str29, "HikariPool-7");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        int int9 = hikariConfig5.minPoolSize;
        org.slf4j.Logger logger10 = hikariConfig5.getLOGGER();
        int int11 = hikariConfig5.maxPoolSize;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString2();
        hikariConfig5.addDataSourceProperty("SELECT 1", (java.lang.Object) str16);
        javax.sql.DataSource dataSource18 = hikariConfig5.dataSource;
        long long19 = hikariConfig5.getMaxLifetime();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str16, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        java.util.Properties properties9 = hikariConfig5.dataSourceProperties;
        hikariConfig5.connectionTimeout = 65;
        hikariConfig5.isRegisterMbeans = false;
        java.lang.String str14 = hikariConfig5.transactionIsolationName;
        hikariConfig5.setisInitializationFailFast(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        hikariConfig5.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) serializedObjectSupporter15);
        hikariConfig5.setisRegisterMbeans(false);
        long long22 = hikariConfig5.getMaxLifetime();
        long long23 = hikariConfig5.connectionTimeout;
        long long24 = hikariConfig5.maxLifetime;
        hikariConfig5.isAutoCommit = false;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.setAcquireRetryDelay(10L);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig5.dataSource = dataSource10;
        long long12 = hikariConfig5.connectionTimeout;
        boolean boolean13 = hikariConfig5.isAutoCommit();
        hikariConfig5.settransactionIsolationName("HikariPool-64");
        hikariConfig5.settransactionIsolationName("HikariPool-84");
        long long18 = hikariConfig5.getMAX_LIFETIME();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter6.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter6.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter6.deserializeObjectHikariDataSource3();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter6.deserializeObjectHikariConfig2();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter6;
        hikariConfig5.setPoolName("HikariPool-4");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertNull(hikariConfig13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        int int9 = hikariConfig5.minPoolSize;
        org.slf4j.Logger logger10 = hikariConfig5.getLOGGER();
        int int11 = hikariConfig5.maxPoolSize;
        int int12 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.setAcquireIncrement(60);
        hikariConfig5.maxPoolSize = (short) -1;
        java.lang.String str17 = hikariConfig5.getConnectionInitSql();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        int int10 = hikariConfig5.acquireRetries;
        hikariConfig5.idleTimeout = 17;
        int int13 = hikariConfig5.minPoolSize;
        boolean boolean14 = hikariConfig5.isInitializationFailFast;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig5.dataSource = dataSource7;
        int int9 = hikariConfig5.minPoolSize;
        hikariConfig5.isRegisterMbeans = false;
        hikariConfig5.minPoolSize = '4';
        java.util.Properties properties14 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig5.getConnectionCustomizer();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig5.dataSource = dataSource16;
        hikariConfig5.transactionIsolation = (byte) 10;
        hikariConfig5.setisInitializationFailFast(true);
        java.lang.String str22 = hikariConfig5.getDataSourceClassName();
        hikariConfig5.acquireRetries = 0;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        hikariConfig5.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter16.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter16.deserializeObjectHikariConfig3();
        java.util.Properties properties20 = serializedObjectSupporter16.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setMaximumPoolSize(1);
        hikariConfig5.copyState(hikariConfig21);
        hikariConfig5.setJdbc4ConnectionTest(false);
        java.lang.String str27 = hikariConfig5.getDataSourceClassName();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter28 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter28.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = serializedObjectSupporter28.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = serializedObjectSupporter28.deserializeObjectHikariConfig3();
        java.util.Properties properties32 = serializedObjectSupporter28.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter37 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource38 = serializedObjectSupporter37.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = serializedObjectSupporter37.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = serializedObjectSupporter37.deserializeObjectHikariConfig3();
        java.util.Properties properties41 = serializedObjectSupporter37.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig42.setMaxLifetime((long) (short) 0);
        hikariConfig33.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties46 = hikariConfig33.getDataSourceProperties();
        hikariConfig5.dataSourceProperties = properties46;
        int int48 = hikariConfig5.getminPoolSize();
        hikariConfig5.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(hikariDataSource29);
        org.junit.Assert.assertNull(hikariConfig30);
        org.junit.Assert.assertNull(hikariConfig31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(hikariDataSource38);
        org.junit.Assert.assertNull(hikariConfig39);
        org.junit.Assert.assertNull(hikariConfig40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-6");
        long long12 = hikariConfig5.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger15 = serializedObjectSupporter13.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter13.deserializeObjectHikariDataSource10();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter13;
        java.util.Properties properties19 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter13.deserializeObjectHikariDataSource5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(simpleLogger15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(hikariDataSource20);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SELECT 1" + "'", str3, "SELECT 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-79");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-79 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setminPoolSize((int) (short) 0);
        long long14 = hikariConfig5.getLeakDetectionThreshold();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = hikariConfig5.serializedObjectSupporter;
        boolean boolean16 = hikariConfig5.isAutoCommit;
        hikariConfig5.setCatalog("HikariPool-137");
        hikariConfig5.connectionInitSql = "HikariPool-65";
        hikariConfig5.setMinimumPoolSize(84);
        java.util.Properties properties23 = hikariConfig5.getDataSourceProperties();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        long long25 = hikariConfig5.getCONNECTION_TIMEOUT();
        boolean boolean26 = hikariConfig5.isAutoCommit();
        java.util.Properties properties27 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-67");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.setAcquireRetryDelay(10L);
        java.lang.String str10 = hikariConfig5.gettransactionIsolationName();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        java.lang.String str12 = hikariConfig5.transactionIsolationName;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str4, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-6" + "'", str5, "HikariPool-6");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        hikariConfig5.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) serializedObjectSupporter15);
        hikariConfig5.setisRegisterMbeans(false);
        long long22 = hikariConfig5.getMaxLifetime();
        hikariConfig5.setmaxPoolSize((int) (short) 100);
        hikariConfig5.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str27 = hikariConfig5.poolName;
        boolean boolean28 = hikariConfig5.getisInitializationFailFast();
        boolean boolean29 = hikariConfig5.isRegisterMbeans();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-28" + "'", str27, "HikariPool-28");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter1.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter1.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter1.deserializeObjectHikariDataSource15();
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter1;
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter1.deserializeObjectHikariDataSource12();
        java.lang.String str7 = serializedObjectSupporter1.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter1.deserializeObjectHikariDataSource4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter1.deserializeObjectHikariDataSource15();
        java.lang.String str10 = serializedObjectSupporter1.deserializeObjectString6();
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str7, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.lang.String str18 = hikariConfig5.getConnectionInitSql();
        java.lang.String str19 = hikariConfig5.getCatalog();
        org.slf4j.Logger logger20 = hikariConfig5.getLOGGER();
        java.lang.String str21 = hikariConfig5.poolName;
        hikariConfig5.setisInitializationFailFast(true);
        hikariConfig5.setisAutoCommit(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(logger20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-30" + "'", str21, "HikariPool-30");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        java.util.Properties properties18 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.setisInitializationFailFast(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter21 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter21.deserializeObjectHikariDataSource16();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter21;
        java.lang.String str24 = hikariConfig5.catalog;
        java.lang.String str25 = hikariConfig5.connectionCustomizerClassName;
        int int26 = hikariConfig5.maxPoolSize;
        hikariConfig5.setAcquireRetries(84);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isJdbc4connectionTest;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource16();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString7();
        org.slf4j.impl.SimpleLogger simpleLogger16 = serializedObjectSupporter13.deserializeObjectLogger1();
        org.slf4j.impl.SimpleLogger simpleLogger17 = serializedObjectSupporter13.deserializeObjectLogger1();
        org.slf4j.impl.SimpleLogger simpleLogger18 = serializedObjectSupporter13.deserializeObjectLogger1();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter13;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-32" + "'", str15, "HikariPool-32");
        org.junit.Assert.assertNotNull(simpleLogger16);
        org.junit.Assert.assertNotNull(simpleLogger17);
        org.junit.Assert.assertNotNull(simpleLogger18);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisAutoCommit();
        java.lang.String str11 = hikariConfig5.connectionTestQuery;
        java.lang.String str12 = hikariConfig5.gettransactionIsolationName();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.setJdbc4ConnectionTest(true);
        long long12 = hikariConfig5.connectionTimeout;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString6();
        java.lang.String str17 = serializedObjectSupporter13.deserializeObjectString5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter13;
        long long19 = hikariConfig5.getMaxLifetime();
        hikariConfig5.maxPoolSize = 52;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str16, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SELECT 1" + "'", str17, "SELECT 1");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig5.dataSource = dataSource7;
        int int9 = hikariConfig5.minPoolSize;
        hikariConfig5.isRegisterMbeans = false;
        hikariConfig5.minPoolSize = '4';
        java.util.Properties properties14 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isRegisterMbeans;
        hikariConfig15.transactionIsolationName = "HikariPool-56";
        hikariConfig15.setAutoCommit(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setisAutoCommit(true);
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.setIdleTimeout((long) 2);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-33" + "'", str3, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        int int14 = hikariConfig5.getminPoolSize();
        hikariConfig5.setpoolNumber(17);
        javax.sql.DataSource dataSource17 = hikariConfig5.getDataSource();
        hikariConfig5.isInitializationFailFast = false;
        int int20 = hikariConfig5.getpoolNumber();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 17 + "'", int20 == 17);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        long long6 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setPoolName("HikariPool-97");
        hikariConfig5.setisInitializationFailFast(false);
        hikariConfig5.poolName = "HikariPool-205";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = hikariConfig5.serializedObjectSupporter;
        long long14 = hikariConfig5.getLeakDetectionThreshold();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        java.util.Properties properties19 = serializedObjectSupporter15.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.getisRegisterMbeans();
        int int22 = hikariConfig20.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        java.util.Properties properties27 = serializedObjectSupporter23.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setRegisterMbeans(true);
        hikariConfig28.isInitializationFailFast = true;
        boolean boolean33 = hikariConfig28.getisRegisterMbeans();
        long long34 = hikariConfig28.getIDLE_TIMEOUT();
        hikariConfig28.setCatalog("HikariPool-33");
        hikariConfig28.isAutoCommit = true;
        hikariConfig20.copyState(hikariConfig28);
        java.util.Properties properties40 = hikariConfig28.dataSourceProperties;
        hikariConfig28.connectionCustomizerClassName = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean43 = hikariConfig28.getisAutoCommit();
        java.lang.String str44 = hikariConfig28.getPoolName();
        hikariConfig28.setRegisterMbeans(false);
        int int47 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setAcquireRetryDelay((long) 1);
        hikariConfig28.maxLifetime = (short) 100;
        hikariConfig28.isRegisterMbeans = true;
        hikariConfig28.settransactionIsolationName("HikariPool-20");
        hikariConfig5.copyState(hikariConfig28);
        java.lang.String str57 = hikariConfig28.connectionCustomizerClassName;
        long long58 = hikariConfig28.getConnectionTimeout();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertNull(hikariConfig26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 600000L + "'", long34 == 600000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "HikariPool-18" + "'", str44, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 5000L + "'", long58 == 5000L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        hikariConfig5.setIdleTimeout(0L);
        hikariConfig5.connectionInitSql = "HikariPool-96";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.zaxxer.hikari.HikariConfig.poolNumber = 1;
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setisAutoCommit(true);
        hikariConfig5.isInitializationFailFast = false;
        long long16 = hikariConfig5.getMAX_LIFETIME();
        hikariConfig5.setIdleTimeout(0L);
        hikariConfig5.connectionInitSql = "HikariPool-101";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.setAcquireRetryDelay(10L);
        java.lang.String str10 = hikariConfig5.gettransactionIsolationName();
        hikariConfig5.setAutoCommit(false);
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-72");
        long long15 = hikariConfig5.leakDetectionThreshold;
        hikariConfig5.setmaxPoolSize(46);
        hikariConfig5.catalog = "hi!";
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.setMaxLifetime((long) 36);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.settransactionIsolationName("com.zaxxer.hikari.mocks.StubDataSource");
        hikariConfig5.connectionCustomizerClassName = "HikariPool-97";
        boolean boolean14 = hikariConfig5.isJdbc4ConnectionTest();
        int int15 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.catalog = "";
        boolean boolean18 = hikariConfig5.isJdbc4ConnectionTest();
        long long19 = hikariConfig5.getMAX_LIFETIME();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getCatalog();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.maxLifetime = (-1L);
        org.slf4j.Logger logger6 = hikariConfig0.getLOGGER();
        javax.sql.DataSource dataSource7 = hikariConfig0.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer8;
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        long long11 = hikariConfig0.getIDLE_TIMEOUT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.isInitializationFailFast = true;
        long long11 = hikariConfig5.getCONNECTION_TIMEOUT();
        hikariConfig5.setMaxLifetime((long) (byte) 1);
        hikariConfig5.minPoolSize = 0;
        int int16 = hikariConfig5.getmaxPoolSize();
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-11");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setCatalog("HikariPool-33");
        hikariConfig5.isAutoCommit = true;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = serializedObjectSupporter16.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter16.deserializeObjectHikariConfig3();
        java.util.Properties properties20 = serializedObjectSupporter16.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setMaximumPoolSize(1);
        hikariConfig5.copyState(hikariConfig21);
        hikariConfig5.setJdbc4ConnectionTest(false);
        hikariConfig5.setConnectionInitSql("");
        hikariConfig5.connectionInitSql = "TRANSACTION_REPEATABLE_READ";
        long long31 = hikariConfig5.connectionTimeout;
        hikariConfig5.setUseInstrumentation(true);
        hikariConfig5.setTransactionIsolation("HikariPool-70");
        hikariConfig5.connectionTimeout = 100L;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariConfig18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        boolean boolean20 = hikariConfig13.isRegisterMbeans;
        java.lang.String str21 = hikariConfig13.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString8();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter23);
        hikariConfig5.copyState(hikariConfig13);
        hikariConfig13.settransactionIsolationName("");
        java.lang.String str33 = hikariConfig13.getConnectionInitSql();
        boolean boolean34 = hikariConfig13.isAutoCommit();
        long long35 = hikariConfig13.getMAX_LIFETIME();
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig13.setisInitializationFailFast(true);
        hikariConfig13.isAutoCommit = false;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-33" + "'", str26, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-33" + "'", str27, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource10();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariDataSource1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str2, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str4, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-57");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-57 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        int int8 = hikariConfig5.getMaximumPoolSize();
        long long9 = hikariConfig5.getAcquireRetryDelay();
        hikariConfig5.transactionIsolation = 64;
        org.slf4j.Logger logger12 = hikariConfig5.getLOGGER();
        java.lang.String str13 = hikariConfig5.getCatalog();
        int int14 = hikariConfig5.getMinimumPoolSize();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        long long18 = hikariConfig5.leakDetectionThreshold;
        boolean boolean19 = hikariConfig5.getisRegisterMbeans();
        hikariConfig5.acquireRetries = (byte) 100;
        boolean boolean22 = hikariConfig5.isInitializationFailFast;
        long long23 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean24 = hikariConfig5.getisRegisterMbeans();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = hikariConfig5.serializedObjectSupporter;
        java.lang.String str26 = hikariConfig5.connectionTestQuery;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        hikariConfig5.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) serializedObjectSupporter15);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter15.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource21 = serializedObjectSupporter15.deserializeObjectHikariDataSource6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource22 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter15.deserializeObjectHikariDataSource10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariDataSource21);
        org.junit.Assert.assertNull(hikariDataSource22);
        org.junit.Assert.assertNull(hikariDataSource23);
        org.junit.Assert.assertNull(hikariDataSource24);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-33" + "'", str5, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig6);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        boolean boolean20 = hikariConfig13.isRegisterMbeans;
        java.lang.String str21 = hikariConfig13.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString8();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter23);
        hikariConfig5.copyState(hikariConfig13);
        hikariConfig13.settransactionIsolationName("");
        java.lang.String str33 = hikariConfig13.getConnectionInitSql();
        boolean boolean34 = hikariConfig13.isAutoCommit();
        long long35 = hikariConfig13.getMAX_LIFETIME();
        hikariConfig13.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig13.setInitializationFailFast(false);
        long long40 = hikariConfig13.getMAX_LIFETIME();
        java.lang.String str41 = hikariConfig13.transactionIsolationName;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-33" + "'", str26, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-33" + "'", str27, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1800000L + "'", long40 == 1800000L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.zaxxer.hikari.HikariConfig.poolNumber = 101;
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setisAutoCommit(true);
        hikariConfig5.isInitializationFailFast = false;
        long long16 = hikariConfig5.getMAX_LIFETIME();
        java.util.Properties properties17 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        java.lang.String str13 = hikariConfig5.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString8();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        hikariConfig5.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter15);
        boolean boolean22 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.setAutoCommit(true);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter25 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource26 = serializedObjectSupporter25.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter25.deserializeObjectHikariConfig1();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource29 = serializedObjectSupporter25.deserializeObjectHikariDataSource11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource30 = serializedObjectSupporter25.deserializeObjectHikariDataSource16();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter25;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = serializedObjectSupporter25.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource33 = serializedObjectSupporter25.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource34 = serializedObjectSupporter25.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource35 = serializedObjectSupporter25.deserializeObjectHikariDataSource15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource36 = serializedObjectSupporter25.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource37 = serializedObjectSupporter25.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource38 = serializedObjectSupporter25.deserializeObjectHikariDataSource6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-33" + "'", str18, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-33" + "'", str19, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(hikariDataSource26);
        org.junit.Assert.assertNull(hikariConfig27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-33" + "'", str28, "HikariPool-33");
        org.junit.Assert.assertNull(hikariDataSource29);
        org.junit.Assert.assertNull(hikariDataSource30);
        org.junit.Assert.assertNull(hikariConfig32);
        org.junit.Assert.assertNull(hikariDataSource33);
        org.junit.Assert.assertNull(hikariDataSource34);
        org.junit.Assert.assertNull(hikariDataSource35);
        org.junit.Assert.assertNull(hikariDataSource36);
        org.junit.Assert.assertNull(hikariDataSource37);
        org.junit.Assert.assertNull(hikariDataSource38);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.setJdbc4ConnectionTest(true);
        long long12 = hikariConfig5.connectionTimeout;
        int int13 = hikariConfig5.getAcquireIncrement();
        hikariConfig5.setisJdbc4connectionTest(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig5.dataSource = dataSource7;
        int int9 = hikariConfig5.minPoolSize;
        hikariConfig5.isRegisterMbeans = false;
        hikariConfig5.setTransactionIsolation("HikariPool-31");
        boolean boolean14 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.setisRegisterMbeans(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TRANSACTION_REPEATABLE_READ" + "'", str7, "TRANSACTION_REPEATABLE_READ");
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        hikariConfig5.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig5.setAutoCommit(true);
        hikariConfig5.setJdbc4ConnectionTest(false);
        hikariConfig5.setAutoCommit(true);
        hikariConfig5.connectionCustomizerClassName = "HikariPool-14";
        hikariConfig5.setIdleTimeout((long) 60);
        hikariConfig5.setPoolName("HikariPool-46");
        hikariConfig5.setisAutoCommit(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        java.util.Properties properties25 = hikariConfig13.dataSourceProperties;
        hikariConfig13.connectionTestQuery = "HikariPool-33";
        hikariConfig13.setDataSourceClassName("HikariPool-31");
        hikariConfig13.acquireRetries = (short) 1;
        hikariConfig13.idleTimeout = 72;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        hikariConfig5.poolName = "HikariPool-32";
        java.util.Properties properties15 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setminPoolSize(47);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        int int7 = hikariConfig5.getminPoolSize();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        hikariConfig13.setCatalog("HikariPool-33");
        hikariConfig13.isAutoCommit = true;
        hikariConfig5.copyState(hikariConfig13);
        long long25 = hikariConfig5.getCONNECTION_TIMEOUT();
        int int26 = hikariConfig5.getMaximumPoolSize();
        long long27 = hikariConfig5.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig5.dataSource = dataSource8;
        hikariConfig5.connectionInitSql = "HikariPool-33";
        hikariConfig5.setminPoolSize((int) (byte) -1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter15.deserializeObjectHikariDataSource17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter15.deserializeObjectHikariDataSource2();
        hikariConfig5.addDataSourceProperty("TRANSACTION_REPEATABLE_READ", (java.lang.Object) serializedObjectSupporter15);
        hikariConfig5.setisRegisterMbeans(false);
        hikariConfig5.setRegisterMbeans(false);
        int int24 = hikariConfig5.acquireRetries;
        long long25 = hikariConfig5.getAcquireRetryDelay();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter1 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter1.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter1.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter1.deserializeObjectHikariDataSource15();
        hikariConfig0.serializedObjectSupporter = serializedObjectSupporter1;
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.connectionTestQuery;
        javax.sql.DataSource dataSource10 = hikariConfig0.dataSource;
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        java.lang.String str13 = hikariConfig5.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter15 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter15.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = serializedObjectSupporter15.deserializeObjectHikariConfig1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString8();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter15.deserializeObjectHikariConfig3();
        hikariConfig5.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter15);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter15.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource23 = serializedObjectSupporter15.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter15.deserializeObjectHikariDataSource15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-33" + "'", str18, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-33" + "'", str19, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariConfig22);
        org.junit.Assert.assertNull(hikariDataSource23);
        org.junit.Assert.assertNull(hikariDataSource24);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariDataSource17();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-33" + "'", str4, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str5, "com.zaxxer.hikari.mocks.StubDataSource");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter9 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter9.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter9.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = serializedObjectSupporter9.deserializeObjectHikariConfig3();
        java.util.Properties properties13 = serializedObjectSupporter9.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setMaxLifetime((long) (short) 0);
        hikariConfig5.addDataSourceProperty("com.zaxxer.hikari.mocks.StubDataSource", (java.lang.Object) (short) 0);
        hikariConfig5.connectionTestQuery = "com.zaxxer.hikari.mocks.StubDataSource";
        hikariConfig5.setAutoCommit(true);
        boolean boolean22 = hikariConfig5.isAutoCommit;
        long long23 = hikariConfig5.getConnectionTimeout();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter24 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource25 = serializedObjectSupporter24.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = serializedObjectSupporter24.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = serializedObjectSupporter24.deserializeObjectHikariConfig3();
        java.util.Properties properties28 = serializedObjectSupporter24.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setRegisterMbeans(true);
        boolean boolean32 = hikariConfig29.isJdbc4connectionTest;
        int int33 = hikariConfig29.minPoolSize;
        org.slf4j.Logger logger34 = hikariConfig29.getLOGGER();
        int int35 = hikariConfig29.maxPoolSize;
        org.slf4j.Logger logger36 = hikariConfig29.getLOGGER();
        hikariConfig5.copyState(hikariConfig29);
        hikariConfig5.setLeakDetectionThreshold((long) 46);
        hikariConfig5.setMinimumPoolSize(135);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNull(hikariConfig12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(hikariDataSource25);
        org.junit.Assert.assertNull(hikariConfig26);
        org.junit.Assert.assertNull(hikariConfig27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNotNull(logger36);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.connectionInitSql = "com.zaxxer.hikari.mocks.StubDataSource";
        int int10 = hikariConfig5.acquireRetries;
        hikariConfig5.idleTimeout = 17;
        java.lang.String str13 = hikariConfig5.transactionIsolationName;
        java.lang.String str14 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setAutoCommit(false);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        boolean boolean12 = hikariConfig5.isRegisterMbeans;
        java.lang.String str13 = hikariConfig5.getCatalog();
        hikariConfig5.poolName = "com.zaxxer.hikari.mocks.StubDataSource";
        boolean boolean16 = hikariConfig5.isAutoCommit;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter17 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter17.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = serializedObjectSupporter17.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter17.deserializeObjectHikariConfig3();
        java.util.Properties properties21 = serializedObjectSupporter17.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig5.dataSourceProperties = properties21;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig24.setPoolName("HikariPool-110");
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariConfig19);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.isInitializationFailFast = true;
        long long11 = hikariConfig5.getCONNECTION_TIMEOUT();
        hikariConfig5.setMaxLifetime((long) (byte) 1);
        int int14 = hikariConfig5.getAcquireRetries();
        hikariConfig5.setDataSourceClassName("");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter18 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource19 = serializedObjectSupporter18.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = serializedObjectSupporter18.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter18.deserializeObjectHikariConfig3();
        java.util.Properties properties22 = serializedObjectSupporter18.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getIDLE_TIMEOUT();
        hikariConfig23.setPoolName("HikariPool-97");
        hikariConfig23.setisInitializationFailFast(false);
        hikariConfig23.poolName = "HikariPool-205";
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter31 = hikariConfig23.serializedObjectSupporter;
        boolean boolean32 = hikariConfig23.getisJdbc4connectionTest();
        hikariConfig5.addDataSourceProperty("HikariPool-44", (java.lang.Object) hikariConfig23);
        boolean boolean34 = hikariConfig23.isRegisterMbeans;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(hikariDataSource19);
        org.junit.Assert.assertNull(hikariConfig20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertNull(serializedObjectSupporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        boolean boolean8 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.isInitializationFailFast = true;
        long long11 = hikariConfig5.getCONNECTION_TIMEOUT();
        hikariConfig5.setMaxLifetime((long) (byte) 1);
        int int14 = hikariConfig5.maxPoolSize;
        java.lang.String str15 = hikariConfig5.dataSourceClassName;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter16 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter16.deserializeObjectHikariDataSource16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource18 = serializedObjectSupporter16.deserializeObjectHikariDataSource5();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter16;
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter16.deserializeObjectHikariDataSource13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(hikariDataSource17);
        org.junit.Assert.assertNull(hikariDataSource18);
        org.junit.Assert.assertNull(hikariDataSource20);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        boolean boolean20 = hikariConfig13.isRegisterMbeans;
        java.lang.String str21 = hikariConfig13.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString8();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter23);
        hikariConfig5.copyState(hikariConfig13);
        hikariConfig13.settransactionIsolationName("");
        java.lang.String str33 = hikariConfig13.getConnectionInitSql();
        int int34 = hikariConfig13.getpoolNumber();
        hikariConfig13.setisAutoCommit(false);
        hikariConfig13.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-33" + "'", str26, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-33" + "'", str27, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 129 + "'", int34 == 129);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        hikariConfig5.setUseInstrumentation(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig5.getConnectionCustomizer();
        hikariConfig5.leakDetectionThreshold = 5000L;
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = serializedObjectSupporter13.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = serializedObjectSupporter13.deserializeObjectHikariConfig3();
        java.util.Properties properties17 = serializedObjectSupporter13.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter19 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource20 = serializedObjectSupporter19.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = serializedObjectSupporter19.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = serializedObjectSupporter19.deserializeObjectHikariConfig3();
        java.util.Properties properties23 = serializedObjectSupporter19.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig18.dataSourceProperties = properties23;
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        hikariConfig5.addDataSourceProperty("", (java.lang.Object) hikariConfig18);
        org.slf4j.Logger logger28 = hikariConfig5.getLOGGER();
        long long29 = hikariConfig5.getMaxLifetime();
        hikariConfig5.setisAutoCommit(true);
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariConfig15);
        org.junit.Assert.assertNull(hikariConfig16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(hikariDataSource20);
        org.junit.Assert.assertNull(hikariConfig21);
        org.junit.Assert.assertNull(hikariConfig22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1800000L + "'", long29 == 1800000L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariDataSource14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariDataSource9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariDataSource2();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariDataSource7();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariDataSource11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.zaxxer.hikari.mocks.StubDataSource" + "'", str10, "com.zaxxer.hikari.mocks.StubDataSource");
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.getisRegisterMbeans();
        java.lang.String str7 = hikariConfig5.getConnectionTestQuery();
        hikariConfig5.setAcquireRetries((int) '4');
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-6");
        long long12 = hikariConfig5.getIDLE_TIMEOUT();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter13 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter13.deserializeObjectHikariDataSource15();
        org.slf4j.impl.SimpleLogger simpleLogger15 = serializedObjectSupporter13.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter13.deserializeObjectHikariDataSource1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource17 = serializedObjectSupporter13.deserializeObjectHikariDataSource10();
        hikariConfig5.serializedObjectSupporter = serializedObjectSupporter13;
        hikariConfig5.setisInitializationFailFast(false);
        hikariConfig5.connectionCustomizerClassName = "HikariPool-28";
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(simpleLogger15);
        org.junit.Assert.assertNull(hikariDataSource16);
        org.junit.Assert.assertNull(hikariDataSource17);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.setAcquireRetryDelay(10L);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig5.dataSource = dataSource10;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig5.dataSource = dataSource12;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setRegisterMbeans(true);
        hikariConfig5.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig5.getisRegisterMbeans();
        long long11 = hikariConfig5.getIDLE_TIMEOUT();
        hikariConfig5.setminPoolSize((int) (short) 0);
        long long14 = hikariConfig5.getLeakDetectionThreshold();
        hikariConfig5.leakDetectionThreshold = (byte) 10;
        java.lang.String str17 = hikariConfig5.connectionTestQuery;
        hikariConfig5.isAutoCommit = true;
        java.lang.String str20 = hikariConfig5.connectionInitSql;
        hikariConfig5.setDataSourceClassName("HikariPool-78");
        long long23 = hikariConfig5.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter6 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter6.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = serializedObjectSupporter6.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = serializedObjectSupporter6.deserializeObjectHikariConfig3();
        java.util.Properties properties10 = serializedObjectSupporter6.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig5.dataSourceProperties = properties10;
        hikariConfig5.setLeakDetectionThreshold((long) (byte) -1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig5.connectionCustomizer = iConnectionCustomizer15;
        int int17 = hikariConfig5.acquireRetries;
        boolean boolean18 = hikariConfig5.isInitializationFailFast();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariConfig8);
        org.junit.Assert.assertNull(hikariConfig9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.Properties properties4 = serializedObjectSupporter0.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setMaximumPoolSize(1);
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter8 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter8.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = serializedObjectSupporter8.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = serializedObjectSupporter8.deserializeObjectHikariConfig3();
        java.util.Properties properties12 = serializedObjectSupporter8.deserializeObjectProperties1();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.isInitializationFailFast = true;
        boolean boolean18 = hikariConfig13.getisRegisterMbeans();
        long long19 = hikariConfig13.getIDLE_TIMEOUT();
        boolean boolean20 = hikariConfig13.isRegisterMbeans;
        java.lang.String str21 = hikariConfig13.getCatalog();
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter23 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource24 = serializedObjectSupporter23.deserializeObjectHikariDataSource12();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = serializedObjectSupporter23.deserializeObjectHikariConfig1();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString8();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString8();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = serializedObjectSupporter23.deserializeObjectHikariConfig3();
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) serializedObjectSupporter23);
        hikariConfig5.copyState(hikariConfig13);
        java.lang.String str31 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.transactionIsolation = 19;
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariConfig2);
        org.junit.Assert.assertNull(hikariConfig3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariConfig10);
        org.junit.Assert.assertNull(hikariConfig11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(hikariDataSource24);
        org.junit.Assert.assertNull(hikariConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-33" + "'", str26, "HikariPool-33");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-33" + "'", str27, "HikariPool-33");
        org.junit.Assert.assertNull(hikariConfig28);
        org.junit.Assert.assertNull(str31);
    }
}
