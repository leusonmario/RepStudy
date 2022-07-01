import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(32L);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.acquireRetries = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(0L);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(100L);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        boolean boolean2 = hikariConfig0.isJdbc4connectionTest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMaxLifetime(97L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(32);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-308";
        java.lang.String str11 = hikariConfig0.catalog;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) '#');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        java.lang.String str6 = hikariConfig0.dataSourceClassName;
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.isAutoCommit = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 60);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-308";
        java.lang.String str11 = hikariConfig0.catalog;
        java.lang.String str12 = hikariConfig0.getCatalog();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.minPoolSize = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(0L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.connectionTimeout = 3;
        int int7 = hikariConfig0.acquireRetries;
        long long8 = hikariConfig0.maxLifetime;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) (short) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        long long10 = hikariConfig0.getConnectionTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 35);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        int int2 = hikariConfig0.getTransactionIsolation();
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) '#');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.leakDetectionThreshold = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) (short) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        java.lang.String str6 = hikariConfig0.dataSourceClassName;
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.dataSourceClassName = "HikariPool-127";
        hikariConfig0.connectionCustomizerClassName = "HikariPool-293";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(3L);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.connectionTimeout;
        int int7 = hikariConfig0.minPoolSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(35L);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.maxPoolSize;
        int int2 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionInitSql = "HikariPool-893";
        hikariConfig0.setAcquireRetries(97);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-470";
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.catalog = "HikariPool-173";
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("");
        boolean boolean10 = hikariConfig0.isRegisterMbeans;
        int int11 = hikariConfig0.getMaximumPoolSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMaximumPoolSize(100);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int12 = hikariConfig0.minPoolSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) '4');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize((int) 'a');
        hikariConfig0.setDataSourceClassName("HikariPool-2067");
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        javax.sql.DataSource dataSource4 = hikariConfig0.getDataSource();
        hikariConfig0.connectionTestQuery = "HikariPool-2654";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str8 = hikariConfig0.getCatalog();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(0L);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource9 = hikariConfig0.dataSource;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) '4');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.catalog = "HikariPool-823";
        int int10 = hikariConfig0.maxPoolSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.catalog = "HikariPool-113";
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.connectionTestQuery = "HikariPool-8839";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        java.lang.String str5 = hikariConfig0.connectionInitSql;
        java.lang.String str6 = hikariConfig0.catalog;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(87);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        hikariConfig0.connectionInitSql = "hi!";
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.transactionIsolation = 100;
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig0.catalog;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(0L);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        javax.sql.DataSource dataSource3 = hikariConfig0.dataSource;
        long long4 = hikariConfig0.maxLifetime;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay(0L);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        long long8 = hikariConfig0.maxLifetime;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 87);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.setAutoCommit(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) 52);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        long long10 = hikariConfig0.getConnectionTimeout();
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        hikariConfig0.connectionInitSql = "hi!";
        hikariConfig0.transactionIsolationName = "HikariPool-6287";
        hikariConfig0.poolName = "HikariPool-127";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setPoolName("HikariPool-531");
        int int7 = hikariConfig0.acquireRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) (short) 100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        int int2 = hikariConfig0.getTransactionIsolation();
        long long3 = hikariConfig0.getIdleTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) ' ');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setInitializationFailFast(true);
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(97);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMaxLifetime(97L);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaximumPoolSize(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) (short) 100);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        boolean boolean2 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean3 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.minPoolSize = (short) 10;
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement((int) 'a');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        int int2 = hikariConfig0.getTransactionIsolation();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties4 = hikariConfig0.dataSourceProperties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.isAutoCommit = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig9.setAcquireIncrement((int) (byte) -1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setInitializationFailFast(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hikariConfig0.setAcquireIncrement(32);
    }
}

