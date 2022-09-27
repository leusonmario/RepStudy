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
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(simpleLogger13);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = concurrentBag7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(simpleLogger11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.lang.Class<?> wildcardClass10 = hikariDataSource9.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.Class<?> wildcardClass13 = hikariDataSource12.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.lang.Class<?> wildcardClass8 = atomicInteger7.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "test" + "'", str2, "test");
        org.junit.Assert.assertNotNull(atomicInteger3);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "test" + "'", str11, "test");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.Class<?> wildcardClass4 = hikariDataSource3.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag15 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNull(concurrentBag14);
        org.junit.Assert.assertNull(concurrentBag15);
        org.junit.Assert.assertNotNull(hikariDataSource16);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(simpleLogger10);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(simpleLogger11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(simpleLogger11);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag15 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag16 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "test" + "'", str14, "test");
        org.junit.Assert.assertNull(concurrentBag15);
        org.junit.Assert.assertNull(concurrentBag16);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger14 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNotNull(atomicInteger12);
        org.junit.Assert.assertNotNull(atomicInteger13);
        org.junit.Assert.assertNotNull(atomicInteger14);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }
}

