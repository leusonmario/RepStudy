import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = me.prettyprint.cassandra.connection.client.HThriftClient.NAME_FORMAT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CassandraClient<%s-%d>" + "'", str0, "CassandraClient<%s-%d>");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        java.lang.Class<?> wildcardClass2 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        java.lang.Class<?> wildcardClass1 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        java.lang.Class<?> wildcardClass4 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        java.lang.Class<?> wildcardClass3 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        java.lang.Class<?> wildcardClass1 = atomicLong0.getClass();
        org.junit.Assert.assertNotNull(atomicLong0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        java.lang.Class<?> wildcardClass6 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        java.lang.Class<?> wildcardClass5 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.slf4j.Logger logger0 = null;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HThriftClient.log;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        me.prettyprint.cassandra.connection.client.HThriftClient.log = logger0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = logger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(logger0);
    }
}

