import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
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
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
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
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.Class<?> wildcardClass7 = atomicInteger6.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
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
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
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
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
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
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
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
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.Class<?> wildcardClass3 = hikariDataSource2.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
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
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
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
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
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
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
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
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
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
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
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
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = concurrentBag6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass4 = hikariDataSource3.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
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
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
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
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "test" + "'", str14, "test");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = concurrentBag4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNotNull(simpleLogger10);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
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
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
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
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
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
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
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
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
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
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
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
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "test" + "'", str13, "test");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.Class<?> wildcardClass7 = hikariDataSource6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
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
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = concurrentBag6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.Class<?> wildcardClass7 = hikariDataSource6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.slf4j.impl.SimpleLogger simpleLogger16 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
        org.junit.Assert.assertNotNull(simpleLogger16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
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
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
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
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(simpleLogger13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "test" + "'", str11, "test");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
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
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(simpleLogger12);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
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
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = concurrentBag10.getClass();
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
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
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
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
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
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
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
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
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
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
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
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        org.slf4j.impl.SimpleLogger simpleLogger1 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(simpleLogger1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
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
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
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
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
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
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }
}

