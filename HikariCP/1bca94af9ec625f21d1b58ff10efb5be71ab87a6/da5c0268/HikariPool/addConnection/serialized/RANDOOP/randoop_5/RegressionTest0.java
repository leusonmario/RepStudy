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
        com.zaxxer.hikari.HikariPool hikariPool0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariPool.HouseKeeper houseKeeper1 = hikariPool0.new HouseKeeper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.zaxxer.hikari.HikariPool$HouseKeeper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.Class<?> wildcardClass5 = hikariDataSource4.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass4 = hikariDataSource3.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.lang.Class<?> wildcardClass3 = hikariDataSource2.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.Class<?> wildcardClass5 = hikariDataSource4.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.Class<?> wildcardClass3 = hikariDataSource2.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.Class<?> wildcardClass4 = hikariDataSource3.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = concurrentBag5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicInteger atomicInteger1 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicInteger1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.lang.Class<?> wildcardClass5 = atomicInteger4.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = concurrentBag3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.Class<?> wildcardClass4 = atomicInteger3.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.Class<?> wildcardClass7 = hikariDataSource6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.lang.Class<?> wildcardClass3 = hikariDataSource2.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = concurrentBag5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.Class<?> wildcardClass7 = hikariDataSource6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicInteger atomicInteger1 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = concurrentBag3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicInteger1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.Class<?> wildcardClass5 = hikariDataSource4.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = concurrentBag5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.Class<?> wildcardClass7 = hikariDataSource6.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(atomicInteger12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(concurrentBag14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(simpleLogger11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.lang.Class<?> wildcardClass12 = hikariDataSource11.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass14 = simpleLogger13.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(simpleLogger13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "test" + "'", str13, "test");
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass8 = hikariDataSource7.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(atomicInteger13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "test" + "'", str11, "test");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.lang.Class<?> wildcardClass5 = hikariDataSource4.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.Class<?> wildcardClass9 = hikariDataSource8.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "test" + "'", str1, "test");
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "test" + "'", str1, "test");
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = concurrentBag12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "test" + "'", str1, "test");
        org.junit.Assert.assertNull(concurrentBag2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag15 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(concurrentBag14);
        org.junit.Assert.assertNull(concurrentBag15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.lang.Class<?> wildcardClass13 = hikariDataSource12.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(simpleLogger13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(hikariDataSource15);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicInteger atomicInteger1 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(atomicInteger1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.slf4j.impl.SimpleLogger simpleLogger2 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(simpleLogger2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(simpleLogger12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(simpleLogger10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger14 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
        org.junit.Assert.assertNotNull(atomicInteger14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger14 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger15 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag16 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(atomicInteger13);
        org.junit.Assert.assertNotNull(atomicInteger14);
        org.junit.Assert.assertNotNull(atomicInteger15);
        org.junit.Assert.assertNull(concurrentBag16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertNotNull(hikariDataSource13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = concurrentBag6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "test" + "'", str12, "test");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag15 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNull(concurrentBag15);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(hikariDataSource11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(hikariDataSource10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.Class<?> wildcardClass6 = atomicInteger5.getClass();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNotNull(hikariDataSource9);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger15 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNotNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(simpleLogger13);
        org.junit.Assert.assertNotNull(hikariDataSource14);
        org.junit.Assert.assertNotNull(atomicInteger15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNotNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(hikariDataSource5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(concurrentBag4);
    }
}

