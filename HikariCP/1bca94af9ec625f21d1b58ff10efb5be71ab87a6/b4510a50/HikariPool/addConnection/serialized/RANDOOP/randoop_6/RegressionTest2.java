import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(atomicInteger12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = concurrentBag8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = concurrentBag8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicInteger atomicInteger1 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNotNull(atomicInteger1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource16 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
        org.junit.Assert.assertNull(hikariDataSource16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(simpleLogger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "test" + "'", str1, "test");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = hikariDataSource8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "test" + "'", str13, "test");
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger12 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(atomicInteger12);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(simpleLogger6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(atomicInteger13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(simpleLogger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass11 = simpleLogger10.getClass();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(simpleLogger10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource15 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
        org.junit.Assert.assertNull(hikariDataSource15);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(simpleLogger9);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag15 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(concurrentBag14);
        org.junit.Assert.assertNull(concurrentBag15);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.slf4j.impl.SimpleLogger simpleLogger8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(simpleLogger8);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        org.slf4j.impl.SimpleLogger simpleLogger12 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNotNull(atomicInteger12);
        org.junit.Assert.assertNull(hikariDataSource13);
        org.junit.Assert.assertNull(hikariDataSource14);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(atomicInteger13);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "test" + "'", str1, "test");
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(simpleLogger10);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNotNull(simpleLogger7);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource14 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(hikariDataSource14);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.slf4j.impl.SimpleLogger simpleLogger9 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNotNull(simpleLogger9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicInteger atomicInteger1 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNotNull(atomicInteger1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNotNull(simpleLogger12);
        org.junit.Assert.assertNotNull(atomicInteger13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(concurrentBag12);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNotNull(atomicInteger9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(simpleLogger13);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNotNull(atomicInteger11);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNull(concurrentBag3);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.slf4j.impl.SimpleLogger simpleLogger13 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNotNull(simpleLogger13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        org.slf4j.impl.SimpleLogger simpleLogger10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(simpleLogger10);
        org.junit.Assert.assertNotNull(atomicInteger11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNotNull(atomicInteger13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(atomicInteger7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNotNull(atomicInteger7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag14 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
        org.junit.Assert.assertNull(concurrentBag14);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.slf4j.impl.SimpleLogger simpleLogger3 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNotNull(atomicInteger2);
        org.junit.Assert.assertNotNull(simpleLogger3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNotNull(atomicInteger6);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        org.slf4j.impl.SimpleLogger simpleLogger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNotNull(simpleLogger7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.slf4j.impl.SimpleLogger simpleLogger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(simpleLogger5);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
        org.junit.Assert.assertNull(hikariDataSource12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource12 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(hikariDataSource12);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNull(concurrentBag10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.slf4j.impl.SimpleLogger simpleLogger6 = serializedObjectSupporter0.deserializeObjectLogger1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(simpleLogger6);
        org.junit.Assert.assertNull(concurrentBag7);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
        org.junit.Assert.assertNotNull(atomicInteger10);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag12();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
        org.junit.Assert.assertNull(hikariDataSource7);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource10 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNull(hikariDataSource6);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig8();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag9 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag10 = serializedObjectSupporter0.deserializeObjectConcurrentBag5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource11 = serializedObjectSupporter0.deserializeObjectHikariConfig7();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(hikariDataSource11);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag12 = serializedObjectSupporter0.deserializeObjectConcurrentBag14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource13 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(hikariDataSource10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(hikariDataSource13);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag1 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig1();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag5 = serializedObjectSupporter0.deserializeObjectConcurrentBag9();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag6 = serializedObjectSupporter0.deserializeObjectConcurrentBag4();
        org.junit.Assert.assertNull(concurrentBag1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(concurrentBag5);
        org.junit.Assert.assertNull(concurrentBag6);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag13 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNull(concurrentBag10);
        org.junit.Assert.assertNull(concurrentBag11);
        org.junit.Assert.assertNull(concurrentBag12);
        org.junit.Assert.assertNull(concurrentBag13);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag11 = serializedObjectSupporter0.deserializeObjectConcurrentBag13();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNotNull(atomicInteger5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNotNull(atomicInteger8);
        org.junit.Assert.assertNull(concurrentBag9);
        org.junit.Assert.assertNotNull(atomicInteger10);
        org.junit.Assert.assertNull(concurrentBag11);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag3 = serializedObjectSupporter0.deserializeObjectConcurrentBag1();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag4 = serializedObjectSupporter0.deserializeObjectConcurrentBag2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(concurrentBag3);
        org.junit.Assert.assertNull(concurrentBag4);
        org.junit.Assert.assertNull(hikariDataSource5);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag2 = serializedObjectSupporter0.deserializeObjectConcurrentBag11();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig11();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = serializedObjectSupporter0.deserializeObjectAtomicInteger4();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = serializedObjectSupporter0.deserializeObjectAtomicInteger2();
        com.zaxxer.hikari.HikariDataSource hikariDataSource7 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource8 = serializedObjectSupporter0.deserializeObjectHikariConfig9();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(concurrentBag2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(atomicInteger4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNotNull(atomicInteger6);
        org.junit.Assert.assertNull(hikariDataSource7);
        org.junit.Assert.assertNull(hikariDataSource8);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig14();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig10();
        com.zaxxer.hikari.HikariDataSource hikariDataSource3 = serializedObjectSupporter0.deserializeObjectHikariConfig17();
        org.slf4j.impl.SimpleLogger simpleLogger4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNull(hikariDataSource3);
        org.junit.Assert.assertNotNull(simpleLogger4);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.zaxxer.hikari.SerializedObjectSupporter serializedObjectSupporter0 = new com.zaxxer.hikari.SerializedObjectSupporter();
        com.zaxxer.hikari.HikariDataSource hikariDataSource1 = serializedObjectSupporter0.deserializeObjectHikariConfig16();
        com.zaxxer.hikari.HikariDataSource hikariDataSource2 = serializedObjectSupporter0.deserializeObjectHikariConfig15();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = serializedObjectSupporter0.deserializeObjectAtomicInteger3();
        com.zaxxer.hikari.HikariDataSource hikariDataSource4 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource5 = serializedObjectSupporter0.deserializeObjectHikariConfig5();
        com.zaxxer.hikari.HikariDataSource hikariDataSource6 = serializedObjectSupporter0.deserializeObjectHikariConfig3();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag7 = serializedObjectSupporter0.deserializeObjectConcurrentBag6();
        com.zaxxer.hikari.util.ConcurrentBag concurrentBag8 = serializedObjectSupporter0.deserializeObjectConcurrentBag7();
        com.zaxxer.hikari.HikariDataSource hikariDataSource9 = serializedObjectSupporter0.deserializeObjectHikariConfig6();
        org.junit.Assert.assertNull(hikariDataSource1);
        org.junit.Assert.assertNull(hikariDataSource2);
        org.junit.Assert.assertNotNull(atomicInteger3);
        org.junit.Assert.assertNull(hikariDataSource4);
        org.junit.Assert.assertNull(hikariDataSource5);
        org.junit.Assert.assertNull(hikariDataSource6);
        org.junit.Assert.assertNull(concurrentBag7);
        org.junit.Assert.assertNull(concurrentBag8);
        org.junit.Assert.assertNull(hikariDataSource9);
    }
}

