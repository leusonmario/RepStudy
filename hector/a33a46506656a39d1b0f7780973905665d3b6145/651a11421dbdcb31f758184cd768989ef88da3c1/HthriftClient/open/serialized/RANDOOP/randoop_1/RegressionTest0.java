import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass2 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass4 = atomicLong3.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = cassandraHost6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = atomicLong6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass2 = hashMap1.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = cassandraHost4.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = atomicLong5.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = cassandraHost5.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = cassandraHost7.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = cassandraHost4.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass4 = log4jLoggerAdapter3.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = log4jLoggerAdapter6.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = log4jLoggerAdapter7.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = cassandraHost5.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = cassandraHost7.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = cassandraHost7.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = cassandraHost6.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = cassandraHost4.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass4 = atomicLong3.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass5 = atomicLong4.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        java.lang.Class<?> wildcardClass10 = cassandraHost9.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = cassandraHost4.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = atomicLong6.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = atomicLong8.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(hashMap4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass6 = log4jLoggerAdapter5.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = log4jLoggerAdapter4.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = cassandraHost6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = hashMap4.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = log4jLoggerAdapter4.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass9 = hashMap8.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = cassandraHost7.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = hashMap4.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        java.lang.Class<?> wildcardClass10 = atomicLong9.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        java.lang.Class<?> wildcardClass11 = cassandraHost10.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = cassandraHost5.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = atomicLong7.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        java.lang.Class<?> wildcardClass10 = log4jLoggerAdapter9.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        java.lang.Class<?> wildcardClass12 = cassandraHost11.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = atomicLong7.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        java.lang.Class<?> wildcardClass11 = atomicLong10.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(atomicLong4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass7 = log4jLoggerAdapter6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass6 = hashMap5.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = log4jLoggerAdapter7.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass6 = hashMap5.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = log4jLoggerAdapter4.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass6 = hashMap5.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNotNull(hashMap12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = atomicLong6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = atomicLong8.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = atomicLong5.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        java.lang.Class<?> wildcardClass11 = atomicLong10.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = atomicLong6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass12 = hashMap11.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CassandraClient<%s-%d>" + "'", str13, "CassandraClient<%s-%d>");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = atomicLong7.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass4 = atomicLong3.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter13 = serializedObjectSupporter0.deserializeObjectLogger1();
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
        org.junit.Assert.assertNotNull(hashMap12);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = atomicLong8.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = atomicLong5.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
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
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass6 = cassandraHost5.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
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
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter14 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(cassandraHost12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter14);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = log4jLoggerAdapter4.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap12);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass6 = log4jLoggerAdapter5.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertNotNull(hashMap12);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass10 = atomicLong9.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(hashMap9);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        java.lang.Class<?> wildcardClass10 = cassandraHost9.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = atomicLong6.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass9 = hashMap8.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(hashMap3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = atomicLong7.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass9 = hashMap8.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(hashMap11);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(cassandraHost13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = hashMap4.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass5 = atomicLong4.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
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
        java.util.HashMap hashMap13 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(hashMap13);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
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
        org.junit.Assert.assertNotNull(hashMap12);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertNotNull(cassandraHost12);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost8);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        java.util.concurrent.atomic.AtomicLong atomicLong13 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
        org.junit.Assert.assertNotNull(atomicLong13);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter13 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(cassandraHost12);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter13);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass4 = atomicLong3.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CassandraClient<%s-%d>" + "'", str11, "CassandraClient<%s-%d>");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost8);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter10 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = cassandraHost6.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
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
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass9 = hashMap8.getClass();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(cassandraHost8);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass11 = atomicLong10.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(hashMap12);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(cassandraHost7);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap9 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
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
        java.util.HashMap hashMap11 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(hashMap11);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        java.util.concurrent.atomic.AtomicLong atomicLong11 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
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
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(cassandraHost7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.Class<?> wildcardClass7 = atomicLong6.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CassandraClient<%s-%d>" + "'", str1, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(cassandraHost5);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(hashMap8);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
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
        org.junit.Assert.assertNotNull(cassandraHost11);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter7 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter12 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CassandraClient<%s-%d>" + "'", str13, "CassandraClient<%s-%d>");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(cassandraHost2);
        org.junit.Assert.assertNotNull(cassandraHost3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass5 = log4jLoggerAdapter4.getClass();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter9 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(cassandraHost8);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap5 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter8 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CassandraClient<%s-%d>" + "'", str10, "CassandraClient<%s-%d>");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>" + "'", str6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost9);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter5 = serializedObjectSupporter0.deserializeObjectLogger1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter5);
        org.junit.Assert.assertNotNull(cassandraHost6);
        org.junit.Assert.assertNotNull(hashMap7);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter6 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>" + "'", str3, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>" + "'", str8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CassandraClient<%s-%d>" + "'", str12, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter4 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
        java.util.concurrent.atomic.AtomicLong atomicLong10 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap12 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter8);
        org.junit.Assert.assertNotNull(hashMap9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(cassandraHost11);
        org.junit.Assert.assertNotNull(hashMap12);
        org.junit.Assert.assertNotNull(cassandraHost13);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap3 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(hashMap3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(cassandraHost6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap4 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(hashMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        java.util.HashMap hashMap1 = serializedObjectSupporter0.deserializeObjectMap1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter2 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter3 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(hashMap1);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter2);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>" + "'", str5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        me.prettyprint.cassandra.connection.client.SerializedObjectSupporter serializedObjectSupporter0 = new me.prettyprint.cassandra.connection.client.SerializedObjectSupporter();
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter1 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.util.HashMap hashMap2 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = serializedObjectSupporter0.deserializeObjectAtomicLong1();
        java.util.HashMap hashMap6 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap7 = serializedObjectSupporter0.deserializeObjectMap1();
        java.util.HashMap hashMap8 = serializedObjectSupporter0.deserializeObjectMap1();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = serializedObjectSupporter0.deserializeObjectCassandraHost1();
        java.util.HashMap hashMap10 = serializedObjectSupporter0.deserializeObjectMap1();
        org.junit.Assert.assertNotNull(log4jLoggerAdapter1);
        org.junit.Assert.assertNotNull(hashMap2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertNotNull(cassandraHost4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(hashMap6);
        org.junit.Assert.assertNotNull(hashMap7);
        org.junit.Assert.assertNotNull(hashMap8);
        org.junit.Assert.assertNotNull(cassandraHost9);
        org.junit.Assert.assertNotNull(hashMap10);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        org.slf4j.impl.Log4jLoggerAdapter log4jLoggerAdapter11 = serializedObjectSupporter0.deserializeObjectLogger1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CassandraClient<%s-%d>" + "'", str2, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(log4jLoggerAdapter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(hashMap5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(cassandraHost10);
        org.junit.Assert.assertNotNull(log4jLoggerAdapter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

