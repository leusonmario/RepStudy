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
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = hThriftClient8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNull(cassandraHost3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNull(hThriftClient5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter13 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNull(hThriftClient12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter13 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = hThriftClient14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter13);
        org.junit.Assert.assertNull(hThriftClient14);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(cassandraHost10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = log4jLoggerAdapter7.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = log4jLoggerAdapter4.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNull(hThriftClient5);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.util.HashMap hashMap15 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        java.lang.String str19 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNotNull(hashMap15);
        org.junit.Assert.assertNull(hThriftClient16);
        org.junit.Assert.assertNull(hThriftClient17);
        org.junit.Assert.assertNull(hThriftClient18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CassandraClient<%s-%d>" + "'", str19, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient20);
        org.junit.Assert.assertNotNull(atomicLong21);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
        org.junit.Assert.assertNull(cassandraHost13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(cassandraHost10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(cassandraHost11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(cassandraHost10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(cassandraHost7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(cassandraHost10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(cassandraHost4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(cassandraHost6);
        org.junit.Assert.assertNull(cassandraHost7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNull(cassandraHost3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass12 = log4jLoggerAdapter11.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(cassandraHost10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(cassandraHost12);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(cassandraHost6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter14 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter14);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter13 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter13);
        org.junit.Assert.assertNull(hThriftClient14);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNull(hThriftClient4);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter14 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter14);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(cassandraHost8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(cassandraHost8);
        org.junit.Assert.assertNull(cassandraHost9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(cassandraHost10);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter13 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
        org.junit.Assert.assertNull(hThriftClient16);
        org.junit.Assert.assertNull(hThriftClient17);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(cassandraHost9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(cassandraHost10);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(cassandraHost12);
        org.junit.Assert.assertNull(hThriftClient13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
        org.junit.Assert.assertNull(hThriftClient16);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.HashMap hashMap13 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter14 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(hashMap13);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter14);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNull(hThriftClient2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(hashMap5);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(cassandraHost5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNotNull(hashMap12);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNull(hThriftClient14);
        org.junit.Assert.assertNull(hThriftClient15);
        org.junit.Assert.assertNull(hThriftClient16);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(cassandraHost7);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(cassandraHost9);
        org.junit.Assert.assertNull(hThriftClient10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNull(hThriftClient11);
        org.junit.Assert.assertNull(hThriftClient12);
        org.junit.Assert.assertNull(hThriftClient13);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNull(hThriftClient12);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNull(hThriftClient8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNull(hThriftClient11);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertNull(hThriftClient4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNull(hThriftClient7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNull(hThriftClient9);
        org.junit.Assert.assertNull(hThriftClient10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient1 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertNull(hThriftClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNull(hThriftClient5);
        org.junit.Assert.assertNull(hThriftClient6);
    }
}

