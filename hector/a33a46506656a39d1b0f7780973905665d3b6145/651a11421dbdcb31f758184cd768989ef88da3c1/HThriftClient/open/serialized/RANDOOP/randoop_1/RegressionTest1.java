import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = log4jLoggerAdapter6.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = atomicLong7.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = hashMap4.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = log4jLoggerAdapter6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = cassandraHost6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = log4jLoggerAdapter6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass4 = cassandraHost3.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        java.util.concurrent.atomic.AtomicLong atomicLong13 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
        org.junit.Assert.assertNotNull(atomicLong13);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }
}

