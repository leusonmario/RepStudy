import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap12 = client2.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9260L);
        int int2 = atomicLong1.intValue();
        long long4 = atomicLong1.addAndGet(199L);
        long long5 = atomicLong1.get();
        boolean boolean8 = atomicLong1.compareAndSet(111L, 220L);
        double double9 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9260 + "'", int2 == 9260);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9459L + "'", long4 == 9459L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9459L + "'", long5 == 9459L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9459.0d + "'", double9 == 9459.0d);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost1.toString();
        java.lang.String str5 = cassandraHost1.toString();
        java.lang.String str6 = cassandraHost1.getUrl();
        int int7 = cassandraHost1.getMaxActive();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!(hi!):100" + "'", str4, "hi!(hi!):100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!(hi!):100" + "'", str5, "hi!(hi!):100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!:100" + "'", str6, "hi!:100");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_slice(byteBuffer12, columnParent13, slicePredicate14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = client2.describe_splits("9269", "", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9260", (int) (short) 199);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 32);
        boolean boolean4 = atomicLong1.weakCompareAndSet(100L, 100L);
        long long5 = atomicLong1.getAndIncrement();
        java.util.function.LongBinaryOperator longBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.getAndAccumulate((long) (short) 10, longBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -58);
        long long2 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58L) + "'", long2 == (-58L));
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):10", (int) (byte) 43);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList13 = client2.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.IndexClause indexClause11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent10, indexClause11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("(127.0.0.1):102");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace("100(0.0.0.100)(100(0.0.0.100)):100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("9562");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap12 = client2.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) 1);
        int int4 = atomicLong1.intValue();
        long long5 = atomicLong1.getAndIncrement();
        long long6 = atomicLong1.longValue();
        long long7 = atomicLong1.getAndDecrement();
        long long9 = atomicLong1.addAndGet(60L);
        long long11 = atomicLong1.getAndSet((long) 32);
        long long13 = atomicLong1.getAndSet(213L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 102L + "'", long6 == 102L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 161L + "'", long9 == 161L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 161L + "'", long11 == 161L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)", (int) (byte) 100);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", (int) (byte) 105);
        boolean boolean3 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_login();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.Compression compression8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer7, compression8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.Compression compression12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult13 = client2.prepare_cql_query(byteBuffer11, compression12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        boolean boolean4 = subject0.isReadOnly();
        subject0.setReadOnly();
        boolean boolean6 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objSet7);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100(0.0.0.100)(100(0.0.0.100)):100", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100:1", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):10", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 11);
        int int6 = cassandraHost2.getMaxActive();
        java.lang.String str7 = cassandraHost2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.10" + "'", str3, "0.0.0.10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10:100" + "'", str7, "10:100");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = client1.recv_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long2 = atomicLong1.getAndDecrement();
        long long3 = atomicLong1.decrementAndGet();
        long long4 = atomicLong1.longValue();
        long long5 = atomicLong1.longValue();
        long long6 = atomicLong1.incrementAndGet();
        long long7 = atomicLong1.longValue();
        int int8 = atomicLong1.intValue();
        long long9 = atomicLong1.getAndIncrement();
        long long11 = atomicLong1.getAndAdd((long) (short) 214);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5 == (-2L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):0");
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("98", (int) (byte) 50);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setUseSocketKeepalive(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.batch_mutate(byteBufferMap8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_column_family("2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList11 = client1.describe_ring("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("209");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "209" + "'", str1, "209");
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 102);
        long long2 = atomicLong1.get();
        float float3 = atomicLong1.floatValue();
        long long4 = atomicLong1.decrementAndGet();
        atomicLong1.set((long) (byte) 102);
        long long7 = atomicLong1.getAndIncrement();
        long long9 = atomicLong1.getAndSet(9390L);
        boolean boolean12 = atomicLong1.weakCompareAndSet((long) (byte) 0, 18579L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3 == 102.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 103L + "'", long9 == 103L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.system_update_column_family(cfDef9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList10 = client2.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList5 = client1.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str4 = cassandraHost1.toString();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost1.setLifo(false);
        int int9 = cassandraHost1.getMaxActive();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):9160" + "'", str4, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.IndexClause indexClause11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.get_indexed_slices(columnParent10, indexClause11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":100", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("12", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):102", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.Compression compression11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult12 = client1.prepare_cql_query(byteBuffer10, compression11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long2 = atomicLong0.get();
        int int3 = atomicLong0.intValue();
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        double double6 = atomicLong0.doubleValue();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.add(byteBuffer11, columnParent12, counterColumn13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):9160");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1))" + "'", str1, "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1))");
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269", strArray13);
        tSSLTransportParameters25.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):10", "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):32");
        tSSLTransportParameters25.setTrustStore("127.0.0.1(127.0.0.1)", "9468", "(127.0.0.1):35", "127.0.0.1(127.0.0.1):-1");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 33);
        long long2 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray10, false);
        boolean boolean15 = subject0.equals((java.lang.Object) "Subject:\n");
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        boolean boolean17 = subject0.isReadOnly();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange15 = null;
        java.nio.ByteBuffer byteBuffer16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("100(0.0.0.100)(100(0.0.0.100)):1", keyRange15, byteBuffer16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getMaxActive();
        cassandraHost1.setUseThriftFramedTransport(true);
        cassandraHost1.setMaxWaitTimeWhenExhausted(101L);
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str9 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) 1);
        cassandraHost1.setMaxActive(11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("hi!(hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters28.setTrustStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", ":9160(:9160):11");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList8 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.recv_system_update_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.incrementAndGet();
        boolean boolean8 = atomicLong0.compareAndSet(11L, 11L);
        boolean boolean11 = atomicLong0.weakCompareAndSet(9261L, (-1L));
        boolean boolean14 = atomicLong0.compareAndSet(0L, 322L);
        long long15 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 102L + "'", long5 == 102L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 102L + "'", long15 == 102L);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 0);
        java.lang.String str3 = cassandraHost2.getUrl();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxActive((int) (short) 9);
        cassandraHost2.setMaxActive((int) (byte) 98);
        cassandraHost2.setMaxWaitTimeWhenExhausted(9313L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1:0" + "'", str3, "-1:0");
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long3 = atomicLong1.getAndSet((long) 10);
        long long4 = atomicLong1.longValue();
        long long5 = atomicLong1.longValue();
        long long6 = atomicLong1.decrementAndGet();
        long long7 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_batch_mutate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_login();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult10 = client1.recv_prepare_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult16 = client2.execute_prepared_cql_query(9261, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 11);
        long long2 = atomicLong1.decrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.updateAndGet(longUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", 9260);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0)(0.0.0.0(0.0.0.0)):9160", (int) (byte) 11);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.lang.String[] strArray14 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100(0.0.0.100):100", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0)", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        java.lang.String[] strArray6 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("208", (int) (byte) -1);
        cassandraHost9.setMaxActive((int) (short) 11);
        boolean boolean12 = subject0.equals((java.lang.Object) (short) 11);
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet14 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet15 = subject0.getPrivateCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet2);
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalSet4);
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Subject:\n" + "'", str6, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(principalSet14);
        org.junit.Assert.assertNotNull(objSet15);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        boolean boolean9 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet10 = subject0.getPublicCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Subject:\n" + "'", str5, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(principalSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objSet10);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.lang.Object> objSet8 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPublicCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(principalSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objSet9);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.IndexClause indexClause8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent7, indexClause8, slicePredicate9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9260L);
        int int2 = atomicLong1.intValue();
        int int3 = atomicLong1.intValue();
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.accumulateAndGet((long) (short) 9, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9260 + "'", int2 == 9260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9260 + "'", int3 == 9260);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long2 = atomicLong0.getAndSet((long) ' ');
        atomicLong0.lazySet(22L);
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong0.updateAndGet(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = client2.describe_splits("(127.0.0.1)((127.0.0.1)):9260", ":0(:0):10", "127.0.0.1", (int) (short) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setUseThriftFramedTransport(true);
        boolean boolean4 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setLifo(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client2.recv_execute_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("0.0.0.0:101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("9269:9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9359", "(127.0.0.1)", "214", (int) (byte) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client1.recv_system_drop_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.Compression compression13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer12, compression13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = client2.recv_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("1001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_system_drop_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray8, false);
        tSSLTransportParameters14.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", ":0(:0):10");
        tSSLTransportParameters14.setTrustStore("-1:0", "0.0.0.100(0.0.0.100):9260");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits("", "301", "301:10", (int) (byte) -56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.Compression compression11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client1.execute_cql_query(byteBuffer10, compression11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1001", 2);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        java.lang.String[] strArray14 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0(:0):-1", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):98", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove_counter(byteBuffer10, columnPath11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.system_update_column_family(cfDef8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("0.0.0.101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer6, columnPath7, 419L, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.Compression compression14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult15 = client2.prepare_cql_query(byteBuffer13, compression14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.incrementAndGet();
        long long8 = atomicLong0.getAndSet((long) ' ');
        int int9 = atomicLong0.intValue();
        boolean boolean12 = atomicLong0.weakCompareAndSet((long) 101, 32L);
        long long13 = atomicLong0.incrementAndGet();
        long long14 = atomicLong0.longValue();
        java.util.function.LongUnaryOperator longUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = atomicLong0.getAndUpdate(longUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103L + "'", long6 == 103L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 103L + "'", long8 == 103L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 33L + "'", long13 == 33L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 33L + "'", long14 == 33L);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("102");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList9 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.getAndDecrement();
        long long5 = atomicLong0.getAndDecrement();
        java.lang.String str6 = atomicLong0.toString();
        long long8 = atomicLong0.getAndAdd(110L);
        long long9 = atomicLong0.incrementAndGet();
        java.lang.String str10 = atomicLong0.toString();
        float float11 = atomicLong0.floatValue();
        long long12 = atomicLong0.decrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = atomicLong0.getAndUpdate(longUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "98" + "'", str6, "98");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 209L + "'", long9 == 209L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "209" + "'", str10, "209");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 209.0f + "'", float11 == 209.0f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 208L + "'", long12 == 208L);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float2 = atomicLong1.floatValue();
        long long3 = atomicLong1.incrementAndGet();
        double double4 = atomicLong1.doubleValue();
        float float5 = atomicLong1.floatValue();
        long long7 = atomicLong1.getAndSet(1L);
        int int8 = atomicLong1.intValue();
        long long9 = atomicLong1.get();
        atomicLong1.lazySet(98L);
        long long12 = atomicLong1.getAndDecrement();
        long long13 = atomicLong1.getAndDecrement();
        long long15 = atomicLong1.addAndGet(225L);
        byte byte16 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 98L + "'", long12 == 98L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 321L + "'", long15 == 321L);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 65 + "'", byte16 == (byte) 65);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("9561");
        cassandraHost1.setLifo(true);
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_keyspace("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":102", strArray9);
        tSSLTransportParameters15.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):98", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "102", ":0(:0)");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9260);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        int int7 = cassandraHost2.getMaxActive();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) (short) 12);
        long long11 = atomicLong9.addAndGet(1L);
        long long12 = atomicLong9.longValue();
        java.lang.String str13 = atomicLong9.toString();
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) atomicLong9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 13L + "'", long11 == 13L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13L + "'", long12 == 13L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13" + "'", str13, "13");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.100(0.0.0.100)(0.0.0.100(0.0.0.100)):45", (int) (short) 50);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) -2);
        java.lang.String str3 = cassandraHost2.getName();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1)):-2" + "'", str3, "(127.0.0.1)((127.0.0.1)):-2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.incrementAndGet();
        float float6 = atomicLong0.floatValue();
        boolean boolean9 = atomicLong0.compareAndSet(111L, 100L);
        long long10 = atomicLong0.get();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 102L + "'", long5 == 102L);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 102.0f + "'", float6 == 102.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.get();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.longValue();
        atomicLong0.lazySet((long) (short) 0);
        long long6 = atomicLong0.decrementAndGet();
        long long7 = atomicLong0.getAndDecrement();
        atomicLong0.lazySet(101L);
        long long10 = atomicLong0.getAndDecrement();
        atomicLong0.lazySet((long) (short) -2);
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = atomicLong0.getAndAccumulate((long) (short) 49, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.Compression compression8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult9 = client1.execute_cql_query(byteBuffer7, compression8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_add_column_family(cfDef10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("CassandraClient<%s-%d>:52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList12 = client2.recv_get_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn11 = client2.recv_get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray8, false);
        tSSLTransportParameters14.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", ":0(:0):10");
        tSSLTransportParameters14.setTrustStore(":0(:0):-1", "hi!(hi!):9160");
        tSSLTransportParameters14.setTrustStore("0.0.0.99", ":10");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.system_drop_column_family("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", 101);
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String str4 = cassandraHost2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1:101" + "'", str3, "-1:101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1(-1):101" + "'", str4, "-1(-1):101");
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult9 = client2.recv_execute_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 51);
        java.lang.String str2 = atomicLong1.toString();
        int int3 = atomicLong1.intValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51" + "'", str2, "51");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long7 = atomicLong0.getAndSet((long) (short) -1);
        long long8 = atomicLong0.incrementAndGet();
        int int9 = atomicLong0.intValue();
        long long11 = atomicLong0.addAndGet((long) (short) 102);
        float float12 = atomicLong0.floatValue();
        long long13 = atomicLong0.get();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 102L + "'", long11 == 102L);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 102.0f + "'", float12 == 102.0f);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_drop_column_family("9269");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove_counter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "127.0.0.1", "-1", "Subject:\n" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1:101", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):100", strArray8, true);
        tSSLTransportParameters14.setTrustStore("127.0.0.1(127.0.0.1):10", "Subject(Subject)", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):52", "-1(-1)");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        java.lang.String str8 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet9 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet10 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean14 = cassandraHost12.equals((java.lang.Object) 0.0f);
        int int15 = cassandraHost12.getCassandraThriftSocketTimeout();
        cassandraHost12.setUseSocketKeepalive(false);
        cassandraHost12.setLifo(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str23 = cassandraHost22.getHost();
        boolean boolean24 = cassandraHost22.getUseSocketKeepalive();
        java.lang.String str25 = cassandraHost22.getName();
        boolean boolean26 = cassandraHost12.equals((java.lang.Object) cassandraHost22);
        boolean boolean27 = cassandraHost12.getUseThriftFramedTransport();
        java.lang.String str28 = cassandraHost12.getName();
        boolean boolean29 = subject0.equals((java.lang.Object) str28);
        boolean boolean30 = subject0.isReadOnly();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Subject:\n" + "'", str8, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet9);
        org.junit.Assert.assertNotNull(principalSet10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(127.0.0.1):0" + "'", str25, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(127.0.0.1):9160" + "'", str28, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 102);
        long long2 = atomicLong1.get();
        float float3 = atomicLong1.floatValue();
        atomicLong1.set(130L);
        java.lang.String str6 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3 == 102.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "130" + "'", str6, "130");
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate(":102");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:10", (int) ' ');
        java.lang.String str3 = cassandraHost2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>:32" + "'", str3, "CassandraClient<%s-%d>:32");
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.login(authenticationRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        org.apache.thrift.protocol.TProtocol tProtocol5 = null;
        org.apache.thrift.protocol.TProtocol tProtocol6 = null;
        org.apache.cassandra.thrift.Cassandra.Client client7 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol5, tProtocol6);
        org.apache.thrift.protocol.TProtocol tProtocol8 = client7.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client7.getInputProtocol();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) tProtocol9);
        cassandraHost2.setMaxActive((int) (byte) 0);
        int int13 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)))", 123);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("10:100");
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange8 = null;
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.get_paged_slice("Subject(Subject):10", keyRange8, byteBuffer9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.batch_mutate(byteBufferMap11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray14 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList15 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList15, byteBufferArray14);
        org.apache.cassandra.thrift.ColumnParent columnParent17 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate18 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap20 = client2.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList15, columnParent17, slicePredicate18, consistencyLevel19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange11 = null;
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.get_paged_slice(":100:9", keyRange11, byteBuffer12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        java.lang.String str9 = cassandraHost6.getName();
        boolean boolean10 = subject0.equals((java.lang.Object) cassandraHost6);
        java.lang.String str11 = cassandraHost6.toString();
        int int12 = cassandraHost6.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost(":0");
        boolean boolean15 = cassandraHost6.equals((java.lang.Object) cassandraHost14);
        cassandraHost14.setMaxActive(198);
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Subject:\n" + "'", str4, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):9160" + "'", str9, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(127.0.0.1):9160" + "'", str11, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9160 + "'", int12 == 9160);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("-1:35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        int int2 = cassandraHost1.getMaxActive();
        java.lang.String str3 = cassandraHost1.getIp();
        java.lang.String str4 = cassandraHost1.getHost();
        java.lang.String str5 = cassandraHost1.getIp();
        cassandraHost1.setUseSocketKeepalive(false);
        int int8 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str9 = cassandraHost1.getUrl();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!:9160" + "'", str9, "hi!:9160");
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("hi!(hi!)(hi!(hi!)):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.system_update_column_family(cfDef8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList5 = client1.describe_ring("CassandraClient<%s-%d>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        java.lang.String[] strArray8 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters10.setKeyStore(":0((:0():98", "(127.0.0.1)((127.0.0.1)):-2", ":102", "-1(-1)");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray8 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList9 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList9, byteBufferArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult11 = client2.execute_prepared_cql_query((int) (short) 111, (java.util.List<java.nio.ByteBuffer>) byteBufferList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNotNull(byteBufferArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("100(0.0.0.100):100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("32(0.0.0.32):50", 51);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult11 = client2.recv_execute_prepared_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("32(0.0.0.32)", 99);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 9160);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("32(0.0.0.32):-125", (int) (short) 20);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("115");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:9160", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = client2.get_count(byteBuffer11, columnParent12, slicePredicate13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", 101);
        cassandraHost2.setMaxActive(98);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str8 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Subject(Subject):101" + "'", str8, "Subject(Subject):101");
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.100(0.0.0.100):9260", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100:35", strArray17);
        boolean boolean30 = subject0.equals((java.lang.Object) tSSLTransportParameters29);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList7 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("0.0.0.8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("(127.0.0.1)((127.0.0.1)):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(principalSet5);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))");
        cassandraHost1.setLifo(true);
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        java.lang.String str5 = cassandraHost1.toString();
        long long6 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost1.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9160" + "'", str5, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9160");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.recv_system_update_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray17, false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        atomicLong0.set(1L);
        boolean boolean8 = atomicLong0.compareAndSet((long) 9160, 103L);
        java.lang.String str9 = atomicLong0.toString();
        long long10 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.KeyRange keyRange13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_range_slices(columnParent11, slicePredicate12, keyRange13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str3 = cassandraHost2.getHost();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters12.setKeyStore("100", "100:0");
        tSSLTransportParameters12.setKeyStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9359", ":9160:100");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (short) 51, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer6, columnPath7, (-1L), consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) '4');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray17, false);
        boolean boolean31 = cassandraHost2.equals((java.lang.Object) false);
        cassandraHost2.setMaxActive((int) (short) 9260);
        javax.security.auth.Subject subject34 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet35 = subject34.getPublicCredentials();
        subject34.setReadOnly();
        java.lang.String str37 = subject34.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong39 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean42 = atomicLong39.compareAndSet((long) 50, (-1L));
        boolean boolean43 = subject34.equals((java.lang.Object) 50);
        java.util.Set<java.lang.Object> objSet44 = subject34.getPrivateCredentials();
        javax.security.auth.Subject subject45 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet46 = subject45.getPublicCredentials();
        subject45.setReadOnly();
        java.lang.String str48 = subject45.toString();
        java.lang.String str49 = subject45.toString();
        java.lang.String str50 = subject45.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong51 = new java.util.concurrent.atomic.AtomicLong();
        float float52 = atomicLong51.floatValue();
        long long54 = atomicLong51.getAndSet((long) (byte) 100);
        long long55 = atomicLong51.incrementAndGet();
        long long56 = atomicLong51.getAndIncrement();
        long long57 = atomicLong51.incrementAndGet();
        long long59 = atomicLong51.getAndSet((long) ' ');
        java.lang.String str60 = atomicLong51.toString();
        atomicLong51.set((long) (byte) 1);
        atomicLong51.lazySet((long) 50);
        long long65 = atomicLong51.decrementAndGet();
        boolean boolean66 = subject45.equals((java.lang.Object) long65);
        boolean boolean67 = subject34.equals((java.lang.Object) boolean66);
        java.lang.Object obj68 = null;
        boolean boolean69 = subject34.equals(obj68);
        boolean boolean70 = cassandraHost2.equals(obj68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Subject:\n" + "'", str37, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objSet44);
        org.junit.Assert.assertNotNull(objSet46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Subject:\n" + "'", str48, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Subject:\n" + "'", str49, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Subject:\n" + "'", str50, "Subject:\n");
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 101L + "'", long55 == 101L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 101L + "'", long56 == 101L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 103L + "'", long57 == 103L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 103L + "'", long59 == 103L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "32" + "'", str60, "32");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 49L + "'", long65 == 49L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long3 = atomicLong1.getAndSet((long) ' ');
        long long5 = atomicLong1.getAndSet((long) 9160);
        int int6 = atomicLong1.intValue();
        long long7 = atomicLong1.getAndIncrement();
        long long8 = atomicLong1.getAndDecrement();
        atomicLong1.lazySet(119L);
        byte byte11 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9160 + "'", int6 == 9160);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9160L + "'", long7 == 9160L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9161L + "'", long8 == 9161L);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 119 + "'", byte11 == (byte) 119);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.incrementAndGet();
        long long8 = atomicLong0.getAndSet((long) ' ');
        java.lang.String str9 = atomicLong0.toString();
        atomicLong0.set((long) (byte) 1);
        atomicLong0.lazySet((long) 50);
        long long14 = atomicLong0.get();
        atomicLong0.set((long) 98);
        long long17 = atomicLong0.incrementAndGet();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103L + "'", long6 == 103L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 103L + "'", long8 == 103L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32" + "'", str9, "32");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 50L + "'", long14 == 50L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 99L + "'", long17 == 99L);
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult10 = client2.recv_execute_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("(127.0.0.1)((127.0.0.1)):1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query(52, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9261", (int) (short) 20);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        java.lang.String str2 = atomicLong1.toString();
        atomicLong1.set((-2L));
        int int5 = atomicLong1.intValue();
        java.lang.String str6 = atomicLong1.toString();
        java.util.function.LongBinaryOperator longBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.getAndAccumulate((long) (short) 9160, longBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2" + "'", str6, "-2");
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        int int5 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("118");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet8 = subject0.getPrivateCredentials();
        boolean boolean9 = subject0.isReadOnly();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.100(0.0.0.100)(0.0.0.100(0.0.0.100)):45", (int) (short) 50);
        cassandraHost2.setMaxActive(51);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9L);
        long long2 = atomicLong1.incrementAndGet();
        java.util.function.LongBinaryOperator longBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.accumulateAndGet(49L, longBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray11);
        tSSLTransportParameters19.setTrustStore("(127.0.0.1)((127.0.0.1))", ":9160(:9160)");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long2 = atomicLong1.getAndDecrement();
        long long3 = atomicLong1.getAndIncrement();
        long long4 = atomicLong1.getAndIncrement();
        long long6 = atomicLong1.addAndGet(220L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 231L + "'", long6 == 231L);
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn13 = client2.recv_get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.system_drop_column_family("127.0.0.1(127.0.0.1):97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.getLifo();
        cassandraHost1.setLifo(true);
        java.lang.String str6 = cassandraHost1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1)((127.0.0.1)):9160" + "'", str6, "(127.0.0.1)((127.0.0.1)):9160");
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef12 = client2.describe_keyspace("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_set_cql_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray13, false);
        java.lang.Class<?> wildcardClass27 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        java.lang.String str2 = atomicLong1.toString();
        atomicLong1.set((-2L));
        int int5 = atomicLong1.intValue();
        java.lang.String str6 = atomicLong1.toString();
        boolean boolean9 = atomicLong1.weakCompareAndSet(9561L, (long) (byte) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2" + "'", str6, "-2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.Column column12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer10, columnParent11, column12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 10);
        java.lang.String str5 = cassandraHost2.toString();
        int int6 = cassandraHost2.getPort();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):100" + "'", str5, "(127.0.0.1):100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        java.lang.String[] strArray17 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1)", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("98", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_batch_mutate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace("(127.0.0.1):35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_drop_column_family("9269:9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("100(0.0.0.100)(100(0.0.0.100)):1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("32", 97);
        boolean boolean3 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult14 = client2.execute_prepared_cql_query((int) (byte) 87, (java.util.List<java.nio.ByteBuffer>) byteBufferList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:35", strArray13, true);
        tSSLTransportParameters25.setTrustStore("102", "0.0.0.32", "127.0.0.1", "11");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_set_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList9 = client2.recv_describe_ring();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("301", 10);
        cassandraHost2.setLifo(false);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(198L);
        double double2 = atomicLong1.doubleValue();
        double double3 = atomicLong1.doubleValue();
        int int4 = atomicLong1.intValue();
        long long5 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.0d + "'", double2 == 198.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 198.0d + "'", double3 == 198.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 198 + "'", int4 == 198);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 197L + "'", long5 == 197L);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn8 = client1.get(byteBuffer5, columnPath6, consistencyLevel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_slice(byteBuffer9, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_login(authenticationRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_count(byteBuffer13, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = client1.system_drop_column_family(":0(:0)(:0(:0)):97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:52", (int) (short) 8);
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSet5);
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9269", (int) (short) 9);
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client1.recv_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getUrl();
        java.lang.String str8 = cassandraHost2.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>)" + "'", str5, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" + "'", str6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" + "'", str7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" + "'", str8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9262L);
        int int2 = atomicLong1.intValue();
        java.util.function.LongUnaryOperator longUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.getAndUpdate(longUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9262 + "'", int2 == 9262);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("31");
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 2);
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("127.0.0.1(127.0.0.1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.Column column9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.insert(byteBuffer7, columnParent8, column9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray14 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList15 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList15, byteBufferArray14);
        org.apache.cassandra.thrift.ColumnParent columnParent17 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate18 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel19 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList15, columnParent17, slicePredicate18, consistencyLevel19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong(9260L);
        int int8 = atomicLong7.intValue();
        boolean boolean9 = subject0.equals((java.lang.Object) int8);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet11 = subject0.getPublicCredentials();
        java.lang.String str12 = subject0.toString();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Subject:\n" + "'", str5, "Subject:\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9260 + "'", int8 == 9260);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objSet10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Subject:\n" + "'", str12, "Subject:\n");
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = client2.describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1:101", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1(-1)", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100(0.0.0.100)(100(0.0.0.100)):-1", strArray18);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", (int) (short) 1);
        cassandraHost2.setMaxActive((int) '#');
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.Compression compression12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult13 = client2.execute_cql_query(byteBuffer11, compression12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.Column column12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer10, columnParent11, column12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.system_add_column_family(cfDef12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.Compression compression12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer11, compression12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.system_drop_column_family("199");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList12, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (short) 102);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        cassandraHost4.setUseThriftFramedTransport(true);
        boolean boolean7 = cassandraHost2.equals((java.lang.Object) cassandraHost4);
        java.lang.String str8 = cassandraHost4.getUrl();
        cassandraHost4.setLifo(false);
        int int11 = cassandraHost4.getPort();
        int int12 = cassandraHost4.getMaxActive();
        cassandraHost4.setUseSocketKeepalive(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" + "'", str8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.8", 111);
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1)", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100:35", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList9 = client2.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client2.describe_ring("9280(0.0.36.64):98");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange4 = null;
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice("100(0.0.0.100)(100(0.0.0.100)):1", keyRange4, byteBuffer5, consistencyLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_system_update_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.batch_mutate(byteBufferMap6, consistencyLevel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer13, columnPath14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 11);
        long long3 = atomicLong1.getAndSet((long) (byte) 100);
        long long4 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.Compression compression12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_prepare_cql_query(byteBuffer11, compression12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_column_family("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        boolean boolean9 = subject0.isReadOnly();
        subject0.setReadOnly();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Subject:\n" + "'", str5, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(principalSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 9261);
        java.lang.String str2 = atomicLong1.toString();
        long long3 = atomicLong1.incrementAndGet();
        long long5 = atomicLong1.getAndAdd(20L);
        long long7 = atomicLong1.getAndSet((long) (short) 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9261" + "'", str2, "9261");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9262L + "'", long3 == 9262L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9262L + "'", long5 == 9262L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9282L + "'", long7 == 9282L);
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer7, columnPath8, (long) 9261, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.system_add_column_family(cfDef7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray9, true);
        tSSLTransportParameters15.setKeyStore("Subject(Subject):102", ":0", "", "31");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("Subject(Subject):35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet4 = subject3.getPublicCredentials();
        subject3.setReadOnly();
        java.lang.String str6 = subject3.toString();
        java.lang.String str7 = subject3.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean11 = cassandraHost9.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = cassandraHost9.getName();
        boolean boolean13 = subject3.equals((java.lang.Object) cassandraHost9);
        cassandraHost9.setUseThriftFramedTransport(false);
        boolean boolean16 = subject0.equals((java.lang.Object) cassandraHost9);
        java.lang.String str17 = subject0.toString();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters18.setKeyStore("hi!", "");
        tSSLTransportParameters18.setTrustStore("", "hi!");
        tSSLTransportParameters18.setKeyStore("hi!", "hi!", "hi!", "hi!");
        boolean boolean30 = subject0.equals((java.lang.Object) "hi!");
        boolean boolean31 = subject0.isReadOnly();
        boolean boolean32 = subject0.isReadOnly();
        java.lang.String str33 = subject0.toString();
        java.util.Set<java.lang.Object> objSet34 = subject0.getPublicCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Subject:\n" + "'", str6, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(127.0.0.1):9160" + "'", str12, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Subject:\n" + "'", str17, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Subject:\n" + "'", str33, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet34);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.incrementAndGet();
        long long8 = atomicLong0.getAndSet((long) ' ');
        java.lang.String str9 = atomicLong0.toString();
        atomicLong0.set((long) (byte) 1);
        long long12 = atomicLong0.longValue();
        long long14 = atomicLong0.getAndAdd((long) (short) 50);
        long long15 = atomicLong0.longValue();
        long long16 = atomicLong0.getAndDecrement();
        boolean boolean19 = atomicLong0.compareAndSet((long) (byte) 43, 119L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103L + "'", long6 == 103L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 103L + "'", long8 == 103L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32" + "'", str9, "32");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 51L + "'", long15 == 51L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 51L + "'", long16 == 51L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer11, columnPath12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.recv_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef7 = client2.describe_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):301");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("0.0.0.100(0.0.0.100)(0.0.0.100(0.0.0.100)):45");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_update_keyspace(ksDef10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long2 = atomicLong1.decrementAndGet();
        long long3 = atomicLong1.incrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.updateAndGet(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_login();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList9 = client1.describe_splits("0.0.0.101", "Subject(Subject):101", "Subject(Subject):102", (int) (byte) -123);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn14 = client2.get(byteBuffer11, columnPath12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269(0.0.36.53)", strArray13, false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long2 = atomicLong0.get();
        long long4 = atomicLong0.getAndSet(0L);
        long long5 = atomicLong0.incrementAndGet();
        boolean boolean8 = atomicLong0.compareAndSet(10L, (long) 1);
        atomicLong0.lazySet(8L);
        long long12 = atomicLong0.addAndGet(110L);
        long long13 = atomicLong0.decrementAndGet();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 118L + "'", long12 == 118L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 117L + "'", long13 == 117L);
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_truncate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = client2.describe_splits("-1(-1):101", "Subject(Subject):52", "", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean3 = cassandraHost1.equals((java.lang.Object) 0.0f);
        int int4 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxActive((int) '4');
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 105);
        long long3 = atomicLong1.getAndSet((long) 'a');
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 111, (long) (short) 9260);
        int int7 = atomicLong1.intValue();
        atomicLong1.lazySet((long) 130);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 105L + "'", long3 == 105L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("Subject(Subject):102");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost1.toString();
        java.lang.String str5 = cassandraHost1.toString();
        long long6 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str8 = cassandraHost1.toString();
        long long9 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str10 = cassandraHost1.toString();
        java.lang.String str11 = cassandraHost1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!(hi!):100" + "'", str4, "hi!(hi!):100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!(hi!):100" + "'", str5, "hi!(hi!):100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!(hi!):100" + "'", str8, "hi!(hi!):100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!(hi!):100" + "'", str10, "hi!(hi!):100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!(hi!):100" + "'", str11, "hi!(hi!):100");
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap17 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList12, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.system_add_column_family(cfDef11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn12 = client2.recv_get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(320L);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.accumulateAndGet(60L, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 0);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 102);
        boolean boolean10 = subject0.equals((java.lang.Object) "127.0.0.1");
        java.util.Set<java.lang.Object> objSet11 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet12 = subject0.getPrivateCredentials();
        boolean boolean13 = subject0.isReadOnly();
        subject0.setReadOnly();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("301:10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 12);
        long long3 = atomicLong1.getAndAdd(31L);
        float float4 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 43.0f + "'", float4 == 43.0f);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        java.lang.String[] strArray1 = null;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):98", strArray1, false);
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("32(0.0.0.32)(32(0.0.0.32))(32(0.0.0.32)(32(0.0.0.32))):9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndAdd((long) '#');
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.updateAndGet(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray14 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList15 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList15, byteBufferArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult17 = client2.execute_prepared_cql_query((int) (byte) -72, (java.util.List<java.nio.ByteBuffer>) byteBufferList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.IndexClause indexClause11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.get_indexed_slices(columnParent10, indexClause11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("221");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        java.lang.String[] strArray16 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100(0.0.0.100):0", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("208", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)(hi!(hi!)):9261", strArray16, true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray8 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList9 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList9, byteBufferArray8);
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap14 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList9, columnParent11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100):9160", (int) 'a');
        cassandraHost2.setLifo(true);
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(21L);
        atomicLong1.set(12L);
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":0", (int) (short) 12);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = client2.get_count(byteBuffer11, columnParent12, slicePredicate13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("0.0.0.99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        java.lang.String[] strArray7 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray7, false);
        tSSLTransportParameters13.setTrustStore("100", "102", "", "-1:0");
        tSSLTransportParameters13.setKeyStore("Subject", "Subject(Subject):102", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):98", "32(0.0.0.32)(32(0.0.0.32)):0");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("(127.0.0.1)((127.0.0.1)):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        tSSLTransportParameters15.setKeyStore("102", "hi!");
        tSSLTransportParameters15.setTrustStore("-1:101", "-1:0");
        tSSLTransportParameters15.setTrustStore("Subject(Subject):52", "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):102", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):99", "(127.0.0.1):9");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.IndexClause indexClause12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList15 = client2.get_indexed_slices(columnParent11, indexClause12, slicePredicate13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long7 = atomicLong0.getAndSet((long) (short) -1);
        long long8 = atomicLong0.decrementAndGet();
        boolean boolean11 = atomicLong0.weakCompareAndSet(31L, 112L);
        long long12 = atomicLong0.decrementAndGet();
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = atomicLong0.getAndAccumulate((long) (byte) 101, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long3 = atomicLong1.getAndAdd(0L);
        float float4 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0)(0.0.0.0(0.0.0.0)):9160", 0);
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0(:0):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 102);
        long long2 = atomicLong1.get();
        atomicLong1.lazySet((long) 201);
        long long5 = atomicLong1.incrementAndGet();
        boolean boolean8 = atomicLong1.compareAndSet((long) (short) 52, 115L);
        byte byte9 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 202L + "'", long5 == 202L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -54 + "'", byte9 == (byte) -54);
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList6 = client2.describe_ring("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) 1);
        long long5 = atomicLong1.addAndGet(0L);
        long long6 = atomicLong1.getAndDecrement();
        java.util.function.LongUnaryOperator longUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.getAndUpdate(longUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 101L + "'", long6 == 101L);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange5 = null;
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList8 = client1.get_paged_slice("0:9160", keyRange5, byteBuffer6, consistencyLevel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        java.lang.Object obj5 = null;
        boolean boolean6 = subject0.equals(obj5);
        subject0.setReadOnly();
        java.lang.String str8 = subject0.toString();
        subject0.setReadOnly();
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Subject:\n" + "'", str8, "Subject:\n");
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.get();
        long long4 = atomicLong1.getAndSet(9L);
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) (short) -1, 0L);
        long long8 = atomicLong1.decrementAndGet();
        long long9 = atomicLong1.get();
        atomicLong1.set((long) 9160);
        long long12 = atomicLong1.longValue();
        atomicLong1.set((long) (byte) 44);
        float float15 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8L + "'", long8 == 8L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9160L + "'", long12 == 9160L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 44.0f + "'", float15 == 44.0f);
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("(127.0.0.1):35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", 10);
        java.lang.String str3 = cassandraHost2.getUrl();
        cassandraHost2.setMaxActive((int) (short) 199);
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10" + "'", str3, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        java.util.function.LongBinaryOperator longBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.accumulateAndGet((long) (byte) 111, longBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.IndexClause indexClause11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.get_indexed_slices(columnParent10, indexClause11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client2.system_drop_column_family("1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = client1.describe_splits("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):100", ":0(:0):-1", "-1(-1):101", (int) (short) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn11 = client2.recv_get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult10 = client2.recv_prepare_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("100(0.0.0.100):100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_prepared_cql_query(9313, (java.util.List<java.nio.ByteBuffer>) byteBufferList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.get();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.getAndIncrement();
        atomicLong0.set(10L);
        boolean boolean8 = atomicLong0.weakCompareAndSet((long) '4', (long) (byte) 0);
        long long10 = atomicLong0.getAndSet((long) 11);
        long long11 = atomicLong0.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_login();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList6 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_slice(byteBufferList6, columnParent7, slicePredicate8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(112L);
        java.util.function.LongUnaryOperator longUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = atomicLong1.updateAndGet(longUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):52", (int) (short) 214);
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String str4 = cassandraHost2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>)" + "'", str3, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):214" + "'", str4, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):214");
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters0 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters0.setKeyStore("hi!", "");
        tSSLTransportParameters0.setTrustStore("", "hi!");
        tSSLTransportParameters0.setTrustStore("", "CassandraClient<%s-%d>", "", "");
        tSSLTransportParameters0.setKeyStore("0.0.0.100", "(127.0.0.1)((127.0.0.1))", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", "-1:0");
        java.lang.Class<?> wildcardClass17 = tSSLTransportParameters0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer9, columnPath10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = client2.describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1:0", strArray9, true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9260");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)", (int) (byte) 11);
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("Subject:110", (int) (short) 98);
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) '4');
        int int9 = atomicLong8.intValue();
        boolean boolean10 = subject0.equals((java.lang.Object) atomicLong8);
        atomicLong8.lazySet(9L);
        byte byte13 = atomicLong8.byteValue();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 9 + "'", byte13 == (byte) 9);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_update_keyspace(ksDef11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList9 = client2.recv_describe_ring();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.get();
        long long4 = atomicLong1.getAndSet(9L);
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) (short) -1, 0L);
        long long8 = atomicLong1.decrementAndGet();
        long long9 = atomicLong1.get();
        long long10 = atomicLong1.get();
        float float11 = atomicLong1.floatValue();
        atomicLong1.lazySet(9267L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8L + "'", long8 == 8L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 8L + "'", long10 == 8L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 8.0f + "'", float11 == 8.0f);
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_login();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        atomicLong0.set(1L);
        boolean boolean8 = atomicLong0.compareAndSet((long) 9160, 103L);
        long long9 = atomicLong0.get();
        atomicLong0.lazySet((long) (short) 13);
        long long12 = atomicLong0.longValue();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13L + "'", long12 == 13L);
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList10 = client2.describe_ring("(127.0.0.1)((127.0.0.1)):9260");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long7 = atomicLong0.getAndSet((long) (short) -1);
        long long8 = atomicLong0.decrementAndGet();
        boolean boolean11 = atomicLong0.weakCompareAndSet(31L, 112L);
        boolean boolean14 = atomicLong0.weakCompareAndSet((long) 103, (long) (short) 10);
        float float15 = atomicLong0.floatValue();
        java.util.function.LongBinaryOperator longBinaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = atomicLong0.accumulateAndGet((long) 52, longBinaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-2.0f) + "'", float15 == (-2.0f));
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.system_add_column_family(cfDef8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long7 = atomicLong0.getAndSet((long) (short) -1);
        long long8 = atomicLong0.decrementAndGet();
        boolean boolean11 = atomicLong0.weakCompareAndSet(31L, 112L);
        long long13 = atomicLong0.addAndGet(33L);
        int int14 = atomicLong0.intValue();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.incrementAndGet();
        long long8 = atomicLong0.getAndSet((long) ' ');
        java.lang.String str9 = atomicLong0.toString();
        atomicLong0.set((long) (byte) 1);
        long long12 = atomicLong0.longValue();
        long long14 = atomicLong0.getAndAdd((long) (short) 50);
        int int15 = atomicLong0.intValue();
        long long17 = atomicLong0.addAndGet((long) (-2));
        boolean boolean20 = atomicLong0.compareAndSet((long) (short) 49, (long) (byte) 45);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103L + "'", long6 == 103L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 103L + "'", long8 == 103L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32" + "'", str9, "32");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 49L + "'", long17 == 49L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        java.lang.String[] strArray14 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.100(0.0.0.100):9260", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.100(0.0.0.100)(0.0.0.100(0.0.0.100)):45", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.system_drop_column_family("50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove_counter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long2 = atomicLong1.decrementAndGet();
        boolean boolean5 = atomicLong1.compareAndSet((long) (byte) -1, 9269L);
        int int6 = atomicLong1.intValue();
        boolean boolean9 = atomicLong1.compareAndSet(135L, (long) (short) 102);
        long long11 = atomicLong1.getAndAdd(0L);
        java.util.function.LongBinaryOperator longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = atomicLong1.getAndAccumulate(225L, longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9L + "'", long11 == 9L);
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long3 = atomicLong1.getAndAdd(100L);
        long long4 = atomicLong1.getAndIncrement();
        long long6 = atomicLong1.getAndSet(32L);
        long long8 = atomicLong1.getAndAdd((long) 201);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 111L + "'", long6 == 111L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap11 = client2.recv_multiget_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        atomicLong1.lazySet(201L);
        atomicLong1.set(0L);
        java.util.function.LongBinaryOperator longBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.accumulateAndGet(299L, longBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = client2.describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10", 0);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("0.0.0.100(0.0.0.100):9269");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.system_update_column_family(cfDef5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_keyspace("(127.0.0.1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("Subject:110");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("98", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32(0.0.0.32):-125", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        java.lang.String[] strArray14 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.get();
        double double2 = atomicLong0.doubleValue();
        atomicLong0.lazySet((long) (byte) -1);
        long long5 = atomicLong0.longValue();
        atomicLong0.lazySet(199L);
        long long8 = atomicLong0.incrementAndGet();
        boolean boolean11 = atomicLong0.compareAndSet((-3L), (long) 123);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 200L + "'", long8 == 200L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits("(127.0.0.1)((127.0.0.1)):10", "130", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("221");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setUseThriftFramedTransport(true);
        boolean boolean4 = cassandraHost1.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost1.equals((java.lang.Object) 9.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long3 = atomicLong1.addAndGet((long) 9160);
        long long4 = atomicLong1.get();
        int int5 = atomicLong1.intValue();
        boolean boolean8 = atomicLong1.compareAndSet(103L, 1L);
        int int9 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9260L + "'", long3 == 9260L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9260L + "'", long4 == 9260L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9260 + "'", int5 == 9260);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9260 + "'", int9 == 9260);
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("100(0.0.0.100)(100(0.0.0.100)):100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long3 = atomicLong1.getAndSet((long) 10);
        double double4 = atomicLong1.doubleValue();
        atomicLong1.lazySet((long) 103);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove_counter(byteBuffer11, columnPath12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_remove_counter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.KeyRange keyRange13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_range_slices(columnParent11, slicePredicate12, keyRange13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.Compression compression11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult12 = client1.prepare_cql_query(byteBuffer10, compression11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str4 = cassandraHost1.toString();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean7 = cassandraHost1.getLifo();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) -2);
        cassandraHost1.setUseThriftFramedTransport(false);
        boolean boolean12 = cassandraHost1.getUseSocketKeepalive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):9160" + "'", str4, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_count(byteBuffer12, columnParent13, slicePredicate14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList9 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 102);
        long long2 = atomicLong1.get();
        float float3 = atomicLong1.floatValue();
        long long4 = atomicLong1.decrementAndGet();
        atomicLong1.set((long) (byte) 102);
        long long7 = atomicLong1.longValue();
        boolean boolean10 = atomicLong1.weakCompareAndSet((long) (byte) 12, 0L);
        java.util.function.LongBinaryOperator longBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = atomicLong1.accumulateAndGet(9468L, longBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3 == 102.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 102L + "'", long7 == 102L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray10 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList11 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList11, byteBufferArray10);
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList11, columnParent13, slicePredicate14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNotNull(byteBufferArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("214:101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9269L);
        long long3 = atomicLong1.addAndGet(11L);
        long long4 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9280L + "'", long3 == 9280L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9279L + "'", long4 == 9279L);
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(198L);
        double double2 = atomicLong1.doubleValue();
        boolean boolean5 = atomicLong1.compareAndSet((long) (byte) 32, (long) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.0d + "'", double2 == 198.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setUseSocketKeepalive(false);
        cassandraHost1.setLifo(false);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong();
        float float7 = atomicLong6.floatValue();
        long long9 = atomicLong6.getAndSet((long) (byte) 100);
        long long10 = atomicLong6.getAndDecrement();
        long long11 = atomicLong6.getAndDecrement();
        boolean boolean12 = cassandraHost1.equals((java.lang.Object) atomicLong6);
        int int13 = atomicLong6.intValue();
        boolean boolean16 = atomicLong6.weakCompareAndSet(198L, (long) (byte) 10);
        long long17 = atomicLong6.get();
        long long19 = atomicLong6.addAndGet((long) (byte) 100);
        long long20 = atomicLong6.getAndDecrement();
        java.util.function.LongBinaryOperator longBinaryOperator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = atomicLong6.accumulateAndGet(151L, longBinaryOperator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 99L + "'", long11 == 99L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 198L + "'", long19 == 198L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 198L + "'", long20 == 198L);
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) 1);
        boolean boolean6 = atomicLong1.compareAndSet(0L, (long) 50);
        atomicLong1.lazySet((long) 301);
        float float9 = atomicLong1.floatValue();
        long long10 = atomicLong1.getAndDecrement();
        java.lang.Class<?> wildcardClass11 = atomicLong1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 301.0f + "'", float9 == 301.0f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 301L + "'", long10 == 301L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList11 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("100:0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str5 = subject0.toString();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Subject:\n" + "'", str5, "Subject:\n");
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", (int) (short) 98);
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        java.lang.String[] strArray19 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("214:9", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9561", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.100", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("221", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0(", strArray19);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String str4 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        boolean boolean7 = subject0.isReadOnly();
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Subject:\n" + "'", str4, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertNotNull(principalSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = client2.describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_column_family(cfDef12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("Subject");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setLifo(false);
        cassandraHost1.setLifo(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList11 = client2.recv_get_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn10 = client1.recv_get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.recv_system_update_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        cassandraHost2.setUseThriftFramedTransport(true);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long7 = atomicLong6.getAndDecrement();
        long long8 = atomicLong6.getAndIncrement();
        long long10 = atomicLong6.addAndGet(10L);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) atomicLong6);
        java.util.function.LongBinaryOperator longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = atomicLong6.accumulateAndGet(9458L, longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 20L + "'", long10 == 20L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(41L);
        int int2 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 1);
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getName();
        int int7 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1" + "'", str6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_truncate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("hi!(hi!):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.incrementAndGet();
        long long8 = atomicLong0.getAndSet((long) ' ');
        java.lang.String str9 = atomicLong0.toString();
        atomicLong0.set((long) (byte) 1);
        atomicLong0.lazySet((long) 50);
        long long14 = atomicLong0.longValue();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103L + "'", long6 == 103L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 103L + "'", long8 == 103L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32" + "'", str9, "32");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 50L + "'", long14 == 50L);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn14 = client2.get(byteBuffer11, columnPath12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long3 = atomicLong0.getAndSet((long) (byte) 100);
        long long4 = atomicLong0.incrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        boolean boolean8 = atomicLong0.weakCompareAndSet((long) (byte) 0, (long) (short) 0);
        long long9 = atomicLong0.decrementAndGet();
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = atomicLong0.accumulateAndGet(231L, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.IndexClause indexClause14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent13, indexClause14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1:32", 13);
        int int3 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("hi!(hi!)(hi!(hi!)):9261");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9359", (int) (byte) 10);
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32(0.0.0.32)(32(0.0.0.32))(32(0.0.0.32)(32(0.0.0.32))):9", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15, false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String str5 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive(100);
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10");
        int int13 = cassandraHost12.getMaxActive();
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) cassandraHost12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean18 = cassandraHost17.getUseThriftFramedTransport();
        cassandraHost17.setMaxWaitTimeWhenExhausted(10L);
        cassandraHost17.setMaxWaitTimeWhenExhausted(10L);
        boolean boolean23 = cassandraHost17.getLifo();
        java.lang.String str24 = cassandraHost17.getHost();
        boolean boolean25 = cassandraHost12.equals((java.lang.Object) cassandraHost17);
        cassandraHost17.setCassandraThriftSocketTimeout((int) (short) 199);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(127.0.0.1)" + "'", str24, "(127.0.0.1)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        java.lang.String[] strArray10 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0(:0)", strArray10);
        tSSLTransportParameters16.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer8, columnPath9, (long) (byte) 96, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_column_family(cfDef12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.cassandra.thrift.KeyRange keyRange4 = null;
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("-1(-1):35", keyRange4, byteBuffer5, consistencyLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap19 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList14, columnParent16, slicePredicate17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = client2.recv_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = client2.describe_splits("0.0.0.32", "202", "0(0.0.0.0)", 9268);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap13 = client2.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_batch_mutate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):99");
        java.lang.String str2 = cassandraHost1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):99" + "'", str2, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):99");
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong(9260L);
        int int8 = atomicLong7.intValue();
        boolean boolean9 = subject0.equals((java.lang.Object) int8);
        boolean boolean10 = subject0.isReadOnly();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.10", strArray22, true);
        boolean boolean31 = subject0.equals((java.lang.Object) strArray22);
        java.lang.String str32 = subject0.toString();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Subject:\n" + "'", str5, "Subject:\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9260 + "'", int8 == 9260);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Subject:\n" + "'", str32, "Subject:\n");
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList5 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList5, byteBufferArray4);
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList5, columnParent7, slicePredicate8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 102);
        java.util.function.LongUnaryOperator longUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = atomicLong1.updateAndGet(longUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits(":9160:100", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):9359", "Subject(Subject):35", (int) (byte) -101);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long3 = atomicLong1.getAndSet((long) 10);
        long long4 = atomicLong1.longValue();
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.updateAndGet(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("Subject");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 9);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap12 = client2.recv_multiget_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", 60);
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        java.lang.String[] strArray17 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):50", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet4 = subject3.getPublicCredentials();
        subject3.setReadOnly();
        java.lang.String str6 = subject3.toString();
        java.lang.String str7 = subject3.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean11 = cassandraHost9.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = cassandraHost9.getName();
        boolean boolean13 = subject3.equals((java.lang.Object) cassandraHost9);
        cassandraHost9.setUseThriftFramedTransport(false);
        boolean boolean16 = subject0.equals((java.lang.Object) cassandraHost9);
        java.lang.String str17 = subject0.toString();
        java.lang.String str18 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet19 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet21 = subject0.getPrivateCredentials();
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Subject:\n" + "'", str6, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(127.0.0.1):9160" + "'", str12, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Subject:\n" + "'", str17, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Subject:\n" + "'", str18, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet19);
        org.junit.Assert.assertNotNull(objSet21);
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef12 = client2.describe_keyspace("Subject:110");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap11 = client2.recv_multiget_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 35);
        long long3 = atomicLong1.getAndAdd(20L);
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange14 = null;
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("100(0.0.0.100)", keyRange14, byteBuffer15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-1));
        java.lang.String str2 = atomicLong1.toString();
        long long3 = atomicLong1.get();
        double double4 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndIncrement();
        long long7 = atomicLong1.addAndGet(149L);
        boolean boolean10 = atomicLong1.compareAndSet((long) 32, 208L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 149L + "'", long7 == 149L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("(127.0.0.1)((127.0.0.1)):9260", ":0((:0():98", ":9160(:9160)", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.Compression compression8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult9 = client2.prepare_cql_query(byteBuffer7, compression8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList12, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100", (int) (short) 100);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        java.lang.Class<?> wildcardClass18 = strArray13.getClass();
        boolean boolean19 = cassandraHost2.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = cassandraHost2.getName();
        java.lang.String str21 = cassandraHost2.getIp();
        cassandraHost2.setLifo(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.100" + "'", str4, "0.0.0.100");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100(0.0.0.100):100" + "'", str20, "100(0.0.0.100):100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0.0.100" + "'", str21, "0.0.0.100");
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean2 = cassandraHost1.getLifo();
        cassandraHost1.setUseSocketKeepalive(false);
        cassandraHost1.setLifo(false);
        java.lang.String str7 = cassandraHost1.getHost();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>)" + "'", str7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.Compression compression6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult7 = client2.execute_cql_query(byteBuffer5, compression6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters0 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters0.setKeyStore("hi!", "");
        tSSLTransportParameters0.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters0.setTrustStore("Subject:\n", "hi!:100", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        tSSLTransportParameters0.setKeyStore("hi!:100", "CassandraClient<%s-%d>");
        tSSLTransportParameters0.setTrustStore("127.0.0.1(127.0.0.1):102", "");
        tSSLTransportParameters0.requireClientAuth(true);
        tSSLTransportParameters0.setKeyStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):12", "hi!(hi!)");
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.Compression compression7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer6, compression7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("12", strArray11, true);
        tSSLTransportParameters20.setTrustStore("-1:35", "Subject:52");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef8 = client2.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = client2.describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-56");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList11 = client2.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer9, columnPath10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("209", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):9", strArray10, true);
        org.junit.Assert.assertNotNull(strArray10);
    }
}

