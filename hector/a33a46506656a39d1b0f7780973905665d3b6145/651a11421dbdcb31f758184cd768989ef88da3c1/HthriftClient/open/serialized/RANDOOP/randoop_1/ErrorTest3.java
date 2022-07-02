import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient13();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient3();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient10();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient14();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient15();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient7();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = serializedObjectSupporter0.deserializeObjectHThriftClient5();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = serializedObjectSupporter0.deserializeObjectHThriftClient8();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient12();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = serializedObjectSupporter0.deserializeObjectHThriftClient1();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = serializedObjectSupporter0.deserializeObjectHThriftClient4();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient2();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = serializedObjectSupporter0.deserializeObjectHThriftClient11();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient16();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = serializedObjectSupporter0.deserializeObjectHThriftClient6();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = serializedObjectSupporter0.deserializeObjectHThriftClient9();
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }
}

