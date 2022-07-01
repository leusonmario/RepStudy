import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        java.lang.Class<?> wildcardClass1 = atomicLong0.getClass();
        org.junit.Assert.assertNotNull(atomicLong0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.String str0 = me.prettyprint.cassandra.connection.client.HThriftClient.NAME_FORMAT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CassandraClient<%s-%d>" + "'", str0, "CassandraClient<%s-%d>");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.slf4j.Logger logger0 = null;
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient.log = logger0;
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.slf4j.Logger logger0 = me.prettyprint.cassandra.connection.client.HKerberosThriftClient.log;
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

