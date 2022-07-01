import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.Compression compression8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer7, compression8);
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
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 10);
        long long3 = atomicLong1.getAndAdd((long) (-2));
        long long5 = atomicLong1.getAndSet((long) 82);
        java.util.function.LongBinaryOperator longBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.accumulateAndGet(2147483755L, longBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 8L + "'", long5 == 8L);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.Compression compression10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult11 = client2.execute_cql_query(byteBuffer9, compression10);
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
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult14 = client2.recv_execute_cql_query();
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
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) (-2));
        long long4 = atomicLong1.incrementAndGet();
        long long6 = atomicLong1.getAndSet((long) (byte) 0);
        java.lang.String str7 = atomicLong1.toString();
        long long8 = atomicLong1.decrementAndGet();
        double double9 = atomicLong1.doubleValue();
        java.lang.String str10 = atomicLong1.toString();
        boolean boolean13 = atomicLong1.weakCompareAndSet(143L, 4294967512L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList19 = client1.get_slice(byteBuffer15, columnParent16, slicePredicate17, consistencyLevel18);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList10 = client2.recv_get_paged_slice();
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
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long2 = atomicLong1.longValue();
        float float3 = atomicLong1.floatValue();
        long long4 = atomicLong1.decrementAndGet();
        long long5 = atomicLong1.incrementAndGet();
        long long6 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9L + "'", long4 == 9L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client1.recv_system_add_column_family();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("(127.0.0.1)((127.0.0.1)):1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str1, "(127.0.0.1)((127.0.0.1))");
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray12 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList13 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList13, byteBufferArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult15 = client2.execute_prepared_cql_query(114, (java.util.List<java.nio.ByteBuffer>) byteBufferList13);
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
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap10 = client1.recv_multiget_count();
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
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef6 = client1.recv_describe_keyspace();
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
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.system_drop_keyspace("36");
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
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):69");
        cassandraHost1.setMaxActive(0);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("102");
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 50);
        int int4 = cassandraHost1.getPort();
        long long5 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9160 + "'", int4 == 9160);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_range_slices(columnParent8, slicePredicate9, keyRange10, consistencyLevel11);
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
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.describe_snitch();
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
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_snitch();
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
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getMaxFrameSize();
        int int12 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (byte) 36);
        int int15 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:10", (int) (short) 99);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(10L);
        long long5 = atomicLong4.incrementAndGet();
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        boolean boolean9 = atomicLong4.compareAndSet(82L, 0L);
        long long11 = atomicLong4.getAndAdd(278L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) -1);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483757L);
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.getUrl();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) (short) 52);
        boolean boolean12 = atomicLong9.compareAndSet(277L, (long) (short) 32);
        long long13 = atomicLong9.getAndIncrement();
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) atomicLong9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":-1" + "'", str7, ":-1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.Compression compression15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult16 = client2.prepare_cql_query(byteBuffer14, compression15);
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
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        double double2 = atomicLong1.doubleValue();
        int int3 = atomicLong1.intValue();
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.accumulateAndGet(401L, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (int) (short) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(69L);
        float float5 = atomicLong4.floatValue();
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        org.apache.thrift.protocol.TProtocol tProtocol7 = null;
        org.apache.cassandra.thrift.Cassandra.Client client8 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol7);
        org.apache.thrift.protocol.TProtocol tProtocol9 = client8.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client8.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client8.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client8.getInputProtocol();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) client8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client8.recv_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 69.0f + "'", float5 == 69.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("62", "128.0.0.108(128.0.0.108):-2147483593", "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):104", 660);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace("46");
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
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap7 = client1.recv_multiget_slice();
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
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) 0);
        cassandraHost2.setUseSocketKeepalive(false);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
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
            client1.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("127.0.0.1(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "127.0.0.1(127.0.0.1)" + "'", str1, "127.0.0.1(127.0.0.1)");
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):69");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer11, columnPath12, 9201L, consistencyLevel14);
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
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.100(0.0.0.100):9160", (int) (byte) 10);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("89");
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("154", (int) (short) 100);
        java.lang.String str3 = cassandraHost2.getHost();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.IndexClause indexClause10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client2.get_indexed_slices(columnParent9, indexClause10, slicePredicate11, consistencyLevel12);
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
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.IndexClause indexClause14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList17 = client2.get_indexed_slices(columnParent13, indexClause14, slicePredicate15, consistencyLevel16);
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
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_count(byteBuffer7, columnParent8, slicePredicate9, consistencyLevel10);
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
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.system_drop_keyspace("hi!(hi!):52");
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
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer10, columnPath11, 271L, consistencyLevel13);
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
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.KeyRange keyRange15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList17 = client1.get_range_slices(columnParent13, slicePredicate14, keyRange15, consistencyLevel16);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 196);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.getAndAccumulate(2147483936L, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.describe_snitch();
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
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.system_add_keyspace(ksDef8);
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
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(false);
        java.util.concurrent.atomic.AtomicLong atomicLong14 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int15 = atomicLong14.intValue();
        java.lang.Class<?> wildcardClass16 = atomicLong14.getClass();
        boolean boolean17 = cassandraHost2.equals((java.lang.Object) wildcardClass16);
        cassandraHost2.setMaxWaitTimeWhenExhausted((-47L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.toString();
        boolean boolean14 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setUseThriftFramedTransport(false);
        int int17 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) -2);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str22 = cassandraHost2.getHost();
        cassandraHost2.setMaxFrameSize(2);
        boolean boolean25 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean26 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(127.0.0.1):10" + "'", str13, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str6 = cassandraHost2.getUrl();
        cassandraHost2.setMaxActive((int) (short) 0);
        int int9 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setUseThriftFramedTransport(false);
        int int12 = cassandraHost2.getMaxFrameSize();
        java.lang.String str13 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":10" + "'", str6, ":10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(127.0.0.1):10" + "'", str13, "(127.0.0.1):10");
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
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
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):10", (int) (byte) -99);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_truncate();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(114L);
        long long2 = atomicLong1.incrementAndGet();
        long long4 = atomicLong1.getAndSet(293L);
        java.util.function.LongBinaryOperator longBinaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong1.accumulateAndGet((long) 101, longBinaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115L + "'", long2 == 115L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115L + "'", long4 == 115L);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", 102);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int5 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client1.recv_system_add_column_family();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = client2.describe_splits("127.0.0.1(127.0.0.1):50", "", "(127.0.0.1):130", (int) (short) 277);
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
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("(127.0.0.1)((127.0.0.1)):68");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str1, "(127.0.0.1)((127.0.0.1))");
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        long long3 = atomicLong0.getAndIncrement();
        float float4 = atomicLong0.floatValue();
        long long6 = atomicLong0.getAndAdd(2147483756L);
        atomicLong0.set((long) (byte) -2);
        long long9 = atomicLong0.decrementAndGet();
        long long10 = atomicLong0.decrementAndGet();
        java.util.function.LongBinaryOperator longBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = atomicLong0.accumulateAndGet((-2L), longBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4L) + "'", long10 == (-4L));
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long2 = atomicLong1.getAndIncrement();
        long long3 = atomicLong1.decrementAndGet();
        boolean boolean6 = atomicLong1.weakCompareAndSet(2147483757L, 62L);
        long long7 = atomicLong1.get();
        float float8 = atomicLong1.floatValue();
        long long9 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_system_drop_column_family();
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
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_cql_version("0(0.0.0.0)(0(0.0.0.0)):35");
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
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long5 = atomicLong0.decrementAndGet();
        boolean boolean8 = atomicLong0.compareAndSet((long) 2147483647, 0L);
        long long9 = atomicLong0.getAndDecrement();
        long long11 = atomicLong0.getAndAdd(2147483705L);
        long long12 = atomicLong0.longValue();
        atomicLong0.lazySet((long) 112);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2147483703L + "'", long12 == 2147483703L);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.get();
        long long4 = atomicLong1.getAndSet((long) 0);
        boolean boolean7 = atomicLong1.compareAndSet(100L, 3L);
        long long9 = atomicLong1.getAndAdd(4L);
        long long11 = atomicLong1.addAndGet((long) (byte) 109);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 113L + "'", long11 == 113L);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol15 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray16 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList17 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList17, byteBufferArray16);
        org.apache.cassandra.thrift.ColumnParent columnParent19 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate20 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap22 = client1.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList17, columnParent19, slicePredicate20, consistencyLevel21);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
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
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1", 0);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxFrameSize(130);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList11 = client2.describe_ring("100(0.0.0.100):9160");
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
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long5 = atomicLong0.decrementAndGet();
        short short6 = atomicLong0.shortValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("125");
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.system_update_column_family(cfDef12);
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
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        long long3 = atomicLong0.getAndIncrement();
        float float4 = atomicLong0.floatValue();
        long long6 = atomicLong0.getAndAdd(2147483756L);
        atomicLong0.set((long) (byte) -2);
        long long9 = atomicLong0.longValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList13 = client1.recv_describe_ring();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client1.execute_prepared_cql_query((int) (byte) 109, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
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
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
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
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("169", (-2147483536));
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.system_drop_keyspace("99(0.0.0.99)");
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
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList13 = client1.describe_ring("337");
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList13 = client2.recv_describe_keyspaces();
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
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(100L, (long) (byte) -1);
        long long8 = atomicLong1.getAndAdd((long) (short) -2);
        long long9 = atomicLong1.incrementAndGet();
        long long10 = atomicLong1.longValue();
        long long12 = atomicLong1.getAndAdd(12L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer11, columnParent12, counterColumn13, consistencyLevel14);
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
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_cql_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 1);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxFrameSize(3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)" + "'", str3, "(127.0.0.1)");
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("52(0.0.0.52)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(11L);
        int int2 = atomicLong1.intValue();
        boolean boolean5 = atomicLong1.compareAndSet(133L, (long) 66);
        java.util.function.LongBinaryOperator longBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.accumulateAndGet(2147483904L, longBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100)", 102);
        java.lang.String str3 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100(0.0.0.100)(100(0.0.0.100)):102" + "'", str3, "100(0.0.0.100)(100(0.0.0.100)):102");
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):100", 99);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 9160);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
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
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList6 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList6, byteBufferArray5);
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList6, columnParent8, slicePredicate9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setLifo(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):32", (int) (byte) 69);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.recv_system_update_keyspace();
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
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
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
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get(byteBuffer10, columnPath11, consistencyLevel12);
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
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult12 = client1.recv_prepare_cql_query();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
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
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.decrementAndGet();
        long long4 = atomicLong1.getAndSet((long) ' ');
        long long5 = atomicLong1.get();
        atomicLong1.lazySet((long) 82);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.Column column14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_insert(byteBuffer12, columnParent13, column14, consistencyLevel15);
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate(":10:10");
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
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest12);
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
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_keyspace("CassandraClient<%s-%d>(CassandraClient<%s-%d>):32");
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
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer11, columnPath12, 145L, consistencyLevel14);
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
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList6 = client1.describe_keyspaces();
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
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 202);
        java.lang.Class<?> wildcardClass3 = cassandraHost2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long5 = atomicLong0.decrementAndGet();
        boolean boolean8 = atomicLong0.compareAndSet((long) 2147483647, 0L);
        java.lang.String str9 = atomicLong0.toString();
        java.util.function.LongUnaryOperator longUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = atomicLong0.getAndUpdate(longUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.IndexClause indexClause15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList18 = client2.get_indexed_slices(columnParent14, indexClause15, slicePredicate16, consistencyLevel17);
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
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_add();
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
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult11 = client1.recv_prepare_cql_query();
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
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):32", (int) (byte) -93);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
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
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):114", 111);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):100", (int) (short) 0);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483648", (int) (short) 98);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        int int4 = cassandraHost2.getMaxFrameSize();
        java.lang.String str5 = cassandraHost2.getIp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "128.0.0.0" + "'", str5, "128.0.0.0");
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (short) 1);
        java.lang.String str6 = cassandraHost2.getName();
        int int7 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive(0);
        java.util.concurrent.atomic.AtomicLong atomicLong10 = new java.util.concurrent.atomic.AtomicLong();
        long long11 = atomicLong10.longValue();
        long long13 = atomicLong10.getAndAdd(62L);
        atomicLong10.set((long) 196);
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) atomicLong10);
        atomicLong10.set(2147484245L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1):10" + "'", str6, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str7 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        java.lang.String str10 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:-1" + "'", str7, "0:-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0(0.0.0.0):-1" + "'", str10, "0(0.0.0.0):-1");
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("0.0.0.10");
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
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn16 = client1.get(byteBuffer13, columnPath14, consistencyLevel15);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) (byte) 1);
        cassandraHost2.setLifo(false);
        int int16 = cassandraHost2.getMaxFrameSize();
        boolean boolean17 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef11 = client1.describe_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):0");
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
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483848L);
        long long3 = atomicLong1.getAndAdd(203L);
        long long4 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2147483848L + "'", long3 == 2147483848L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2147484051L + "'", long4 == 2147484051L);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer14, columnParent15, counterColumn16, consistencyLevel17);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = client1.recv_describe_schema_versions();
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
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        java.lang.String str3 = atomicLong1.toString();
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 35, (long) (-1));
        boolean boolean9 = atomicLong1.weakCompareAndSet(102L, (long) (short) 0);
        float float10 = atomicLong1.floatValue();
        atomicLong1.lazySet(201L);
        boolean boolean15 = atomicLong1.compareAndSet((long) (short) 9160, (-1L));
        atomicLong1.set((long) (short) 99);
        java.lang.String str18 = atomicLong1.toString();
        long long20 = atomicLong1.getAndSet((long) (byte) -106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "99" + "'", str18, "99");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):104");
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
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):201");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("130", (-46));
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.decrementAndGet();
        long long3 = atomicLong1.getAndIncrement();
        long long5 = atomicLong1.addAndGet((long) (-1));
        float float6 = atomicLong1.floatValue();
        long long8 = atomicLong1.getAndAdd(199L);
        long long10 = atomicLong1.getAndSet(2147483748L);
        long long12 = atomicLong1.addAndGet(0L);
        short short13 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 99L + "'", long8 == 99L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 298L + "'", long10 == 298L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2147483748L + "'", long12 == 2147483748L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 2147483647);
        boolean boolean4 = atomicLong1.compareAndSet((long) '#', (long) (byte) -1);
        long long5 = atomicLong1.incrementAndGet();
        long long6 = atomicLong1.incrementAndGet();
        long long7 = atomicLong1.getAndDecrement();
        atomicLong1.set((long) (short) 35);
        long long10 = atomicLong1.getAndDecrement();
        byte byte11 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2147483648L + "'", long5 == 2147483648L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2147483649L + "'", long6 == 2147483649L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147483649L + "'", long7 == 2147483649L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 34 + "'", byte11 == (byte) 34);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        java.lang.String str8 = cassandraHost2.getIp();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):10" + "'", str7, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "127.0.0.1" + "'", str8, "127.0.0.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(145L);
        long long3 = atomicLong1.getAndAdd(11L);
        java.lang.String str4 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 145L + "'", long3 == 145L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "156" + "'", str4, "156");
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        java.lang.String str5 = cassandraHost2.getIp();
        boolean boolean6 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127.0.0.1" + "'", str5, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
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
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (short) 143, (java.util.List<java.nio.ByteBuffer>) byteBufferList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
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
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap13 = client2.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent6 = null;
        org.apache.cassandra.thrift.Column column7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.insert(byteBuffer5, columnParent6, column7, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.getAndIncrement();
        long long4 = atomicLong0.getAndSet(101L);
        long long6 = atomicLong0.getAndSet(10L);
        atomicLong0.lazySet((long) 82);
        long long9 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 101L + "'", long6 == 101L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 82L + "'", long9 == 82L);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long2 = atomicLong1.incrementAndGet();
        boolean boolean5 = atomicLong1.compareAndSet(2147483748L, 109L);
        long long7 = atomicLong1.getAndSet((long) (byte) 100);
        long long8 = atomicLong1.decrementAndGet();
        atomicLong1.lazySet(2147483706L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 99L + "'", long8 == 99L);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", (-1));
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getUrl();
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1)):-1" + "'", str4, "(127.0.0.1)((127.0.0.1)):-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
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
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":32", 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = cassandraHost2.equals(obj3);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 51);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483701L);
        int int2 = atomicLong1.intValue();
        java.util.function.LongUnaryOperator longUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.getAndUpdate(longUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483595) + "'", int2 == (-2147483595));
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 35);
        int int11 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 2147483647);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) (short) 109, 69L);
        boolean boolean7 = atomicLong1.compareAndSet((long) (short) 147, 168L);
        atomicLong1.lazySet(116L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 35);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        int int6 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
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
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-3", (int) (byte) -56);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client1.system_add_column_family(cfDef12);
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer11, columnPath12, 321L, consistencyLevel14);
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
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_count(byteBuffer9, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_login();
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
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList7 = client2.recv_get_slice();
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
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList4 = client1.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (short) 1);
        java.lang.String str6 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean9 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(4294967318L);
        java.lang.String str12 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1):10" + "'", str6, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList11 = client2.recv_describe_ring();
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
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (int) (short) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(69L);
        float float5 = atomicLong4.floatValue();
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        org.apache.thrift.protocol.TProtocol tProtocol7 = null;
        org.apache.cassandra.thrift.Cassandra.Client client8 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol7);
        org.apache.thrift.protocol.TProtocol tProtocol9 = client8.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client8.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client8.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client8.getInputProtocol();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) client8);
        // The following exception was thrown during execution in test generation
        try {
            client8.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 69.0f + "'", float5 == 69.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 32);
        atomicLong1.lazySet(2147483850L);
        long long5 = atomicLong1.getAndSet(119L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2147483850L + "'", long5 == 2147483850L);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("100");
        int int2 = cassandraHost1.getPort();
        cassandraHost1.setMaxWaitTimeWhenExhausted(152L);
        java.lang.String str5 = cassandraHost1.toString();
        cassandraHost1.setMaxFrameSize(283);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9160 + "'", int2 == 9160);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100(0.0.0.100):9160" + "'", str5, "100(0.0.0.100):9160");
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(100L, (long) (byte) -1);
        long long7 = atomicLong1.decrementAndGet();
        int int8 = atomicLong1.intValue();
        boolean boolean11 = atomicLong1.compareAndSet((long) 101, 83L);
        boolean boolean14 = atomicLong1.weakCompareAndSet(69L, (-1L));
        float float15 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (byte) 95);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        long long2 = atomicLong1.incrementAndGet();
        float float3 = atomicLong1.floatValue();
        float float4 = atomicLong1.floatValue();
        double double5 = atomicLong1.doubleValue();
        long long6 = atomicLong1.longValue();
        atomicLong1.set(11L);
        atomicLong1.set((long) 53);
        long long12 = atomicLong1.getAndSet(22L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 101.0f + "'", float4 == 101.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 101L + "'", long6 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 53L + "'", long12 == 53L);
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.decrementAndGet();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(179L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer6, columnPath7, 105L, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult7 = client1.recv_execute_prepared_cql_query();
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
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList10 = client2.describe_keyspaces();
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
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 82);
        long long3 = atomicLong1.addAndGet((long) 110);
        float float4 = atomicLong1.floatValue();
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.getAndUpdate(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 192L + "'", long3 == 192L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 192.0f + "'", float4 == 192.0f);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(300L);
        long long2 = atomicLong1.getAndDecrement();
        java.lang.String str3 = atomicLong1.toString();
        atomicLong1.set((long) (byte) -55);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300L + "'", long2 == 300L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "299" + "'", str3, "299");
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_partitioner();
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
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer11, columnParent12, counterColumn13, consistencyLevel14);
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
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
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
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client1.recv_get_paged_slice();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_login();
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
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("103");
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
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.system_add_column_family(cfDef11);
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
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray8 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList9 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList9, byteBufferArray8);
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList9, columnParent11, slicePredicate12, consistencyLevel13);
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
        org.junit.Assert.assertNotNull(byteBufferArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100)(100(0.0.0.100)):102", 205);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("2147483824");
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
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 52);
        boolean boolean4 = atomicLong1.weakCompareAndSet(2147483746L, 139L);
        long long5 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_system_add_column_family();
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
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setMaxFrameSize((int) (byte) -1);
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setUseSocketKeepalive(false);
        boolean boolean10 = cassandraHost1.getLifo();
        cassandraHost1.setUseThriftFramedTransport(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127.0.0.1" + "'", str5, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList8 = client2.describe_keyspaces();
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
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.recv_system_update_column_family();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef9 = client1.describe_keyspace("101:-2147483472");
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
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("(127.0.0.1)((127.0.0.1)):-1");
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
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_add();
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
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
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
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.recv_system_update_keyspace();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client1.describe_partitioner();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        long long3 = atomicLong1.get();
        boolean boolean6 = atomicLong1.compareAndSet((long) 50, (long) 100);
        float float7 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("201");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "201" + "'", str1, "201");
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client2.system_update_keyspace(ksDef6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        long long4 = atomicLong1.get();
        long long5 = atomicLong1.decrementAndGet();
        long long6 = atomicLong1.decrementAndGet();
        long long7 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2L) + "'", long6 == (-2L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2L) + "'", long7 == (-2L));
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(100L, (long) (byte) -1);
        long long7 = atomicLong1.decrementAndGet();
        int int8 = atomicLong1.intValue();
        int int9 = atomicLong1.intValue();
        long long10 = atomicLong1.decrementAndGet();
        boolean boolean13 = atomicLong1.compareAndSet((long) (-2147483548), (long) 100);
        byte byte14 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -2 + "'", byte14 == (byte) -2);
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap7 = client1.recv_multiget_slice();
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
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((-2147483503L));
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer5, columnPath6, 2147483883L, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:10", (-1));
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 81);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn12 = client2.get(byteBuffer9, columnPath10, consistencyLevel11);
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
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("0.0.0.1(0.0.0.1):3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0.0.1(0.0.0.1)" + "'", str1, "0.0.0.1(0.0.0.1)");
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
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
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList10 = client2.recv_describe_ring();
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
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(271L);
        atomicLong1.set(110L);
        long long5 = atomicLong1.addAndGet((long) (byte) 0);
        long long6 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.Compression compression9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer8, compression9);
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
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList13 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count(byteBufferList13, columnParent14, slicePredicate15, consistencyLevel16);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (-2));
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxFrameSize((int) (short) 0);
        cassandraHost2.setUseThriftFramedTransport(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str3, "(127.0.0.1)((127.0.0.1))");
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("(127.0.0.1)((127.0.0.1)):-2");
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
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("52(0.0.0.52)");
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
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
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
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 2);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 35);
        boolean boolean12 = atomicLong9.compareAndSet((long) (short) -2, 100L);
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) atomicLong9);
        java.lang.String str14 = cassandraHost2.getIp();
        boolean boolean15 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1):10" + "'", str3, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):10" + "'", str5, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "127.0.0.1" + "'", str14, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 147);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483760L);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160(0.0.35.200):34", 15);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
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
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(69L);
        atomicLong1.lazySet((long) (short) 3);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        cassandraHost2.setLifo(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 98);
        cassandraHost2.setCassandraThriftSocketTimeout((-2147483494));
        int int9 = cassandraHost2.getMaxFrameSize();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
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
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 1);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer5, columnPath6, (long) 4, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap8 = client1.recv_multiget_count();
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
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("(127.0.0.1)((127.0.0.1)):9160");
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
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList10 = client2.describe_keyspaces();
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
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("31(0.0.0.31):1");
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
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult16 = client2.execute_prepared_cql_query((int) (short) 0, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
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
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap15 = client2.recv_multiget_slice();
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
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("0(0.0.0.0):97");
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
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_partitioner();
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
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("127.0.0.1(127.0.0.1):2147483647");
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
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):201", (int) (byte) -1);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("(127.0.0.1)((127.0.0.1)):-1", keyRange9, byteBuffer10, consistencyLevel11);
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
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.system_drop_column_family("136");
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
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer15, columnPath16, consistencyLevel17);
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
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        boolean boolean6 = cassandraHost1.isPerformNameResolution();
        boolean boolean7 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setMaxActive((int) (short) 100);
        cassandraHost1.setUseThriftFramedTransport(false);
        cassandraHost1.setMaxFrameSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1)((127.0.0.1)):10" + "'", str5, "(127.0.0.1)((127.0.0.1)):10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        float float1 = atomicLong0.floatValue();
        boolean boolean4 = atomicLong0.weakCompareAndSet(100L, 97L);
        long long5 = atomicLong0.decrementAndGet();
        long long6 = atomicLong0.decrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong0.updateAndGet(longUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.14748352E9f) + "'", float1 == (-2.14748352E9f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2147483581L) + "'", long5 == (-2147483581L));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2147483582L) + "'", long6 == (-2147483582L));
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_slice(byteBuffer8, columnParent9, slicePredicate10, consistencyLevel11);
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
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_batch_mutate(byteBufferMap11, consistencyLevel12);
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
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
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
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 35);
        int int11 = cassandraHost2.getPort();
        java.lang.String str12 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(127.0.0.1):10" + "'", str12, "(127.0.0.1):10");
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("156");
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_truncate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_snitch();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) '#');
        int int6 = cassandraHost2.getPort();
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setMaxActive((int) (byte) 0);
        boolean boolean11 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str12 = cassandraHost2.getName();
        boolean boolean13 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str14 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(127.0.0.1):0" + "'", str12, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
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
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.recv_describe_cluster_name();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange11 = null;
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice(":10:10", keyRange11, byteBuffer12, consistencyLevel13);
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
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.system_add_keyspace(ksDef11);
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
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.Column column16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_insert(byteBuffer14, columnParent15, column16, consistencyLevel17);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("0.0.0.102");
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
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.recv_system_add_column_family();
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
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.system_add_keyspace(ksDef8);
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
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        atomicLong1.set((long) (short) -2);
        long long5 = atomicLong1.getAndAdd(4294967294L);
        float float6 = atomicLong1.floatValue();
        float float7 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5 == (-2L));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 4.2949673E9f + "'", float6 == 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 4.2949673E9f + "'", float7 == 4.2949673E9f);
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("370");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100):9160", (int) (byte) 0);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        int int6 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 0);
        long long2 = atomicLong1.longValue();
        boolean boolean5 = atomicLong1.compareAndSet(271L, 0L);
        long long7 = atomicLong1.getAndSet((long) '#');
        atomicLong1.lazySet(213L);
        byte byte10 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -43 + "'", byte10 == (byte) -43);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long5 = atomicLong0.longValue();
        java.util.function.LongUnaryOperator longUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong0.getAndUpdate(longUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("-3");
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
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(136L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(100L, 210L);
        double double5 = atomicLong1.doubleValue();
        long long7 = atomicLong1.getAndAdd(4294967294L);
        long long8 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 136.0d + "'", double5 == 136.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 136L + "'", long7 == 136L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4294967430L + "'", long8 == 4294967430L);
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList10, columnParent12, slicePredicate13, consistencyLevel14);
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
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.longValue();
        long long3 = atomicLong0.getAndAdd(62L);
        byte byte4 = atomicLong0.byteValue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 62 + "'", byte4 == (byte) 62);
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.Column column8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer6, columnParent7, column8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("113");
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15768");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-102", (int) (short) 101);
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15769");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("35");
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
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15770");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client2.recv_describe_version();
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
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15771");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.addAndGet(2L);
        java.lang.String str5 = atomicLong1.toString();
        long long6 = atomicLong1.longValue();
        long long7 = atomicLong1.get();
        long long8 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15772");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        java.lang.String str3 = atomicLong1.toString();
        java.lang.String str4 = atomicLong1.toString();
        long long5 = atomicLong1.getAndDecrement();
        double double6 = atomicLong1.doubleValue();
        java.util.function.LongBinaryOperator longBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.getAndAccumulate(333L, longBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100" + "'", str4, "100");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15773");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) '#');
        int int6 = cassandraHost2.getPort();
        long long7 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int8 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15774");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) '#');
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 10);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        java.lang.String str8 = cassandraHost2.toString();
        java.lang.String str9 = cassandraHost2.getUrl();
        cassandraHost2.setUseSocketKeepalive(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0(0.0.0.0):35" + "'", str8, "0(0.0.0.0):35");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:35" + "'", str9, "0:35");
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15775");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long4 = atomicLong1.get();
        atomicLong1.set((long) (byte) -65);
        boolean boolean9 = atomicLong1.compareAndSet((long) (short) 34, 114L);
        double double10 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-65.0d) + "'", double10 == (-65.0d));
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15776");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.system_drop_column_family("(127.0.0.1)((127.0.0.1)):36");
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
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15777");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        float float4 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndDecrement();
        long long6 = atomicLong0.getAndIncrement();
        short short7 = atomicLong0.shortValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15778");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("370");
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
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15779");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 35);
        int int3 = cassandraHost2.getMaxActive();
        java.lang.String str4 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483883L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str4, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15780");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 35);
        int int3 = cassandraHost2.getMaxActive();
        java.lang.String str4 = cassandraHost2.getIp();
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str6 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str4, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):35" + "'", str6, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):35");
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15781");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getMaxFrameSize();
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        boolean boolean13 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15782");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):36");
        java.lang.String str2 = cassandraHost1.getUrl();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(127.0.0.1)((127.0.0.1)):36" + "'", str2, "(127.0.0.1)((127.0.0.1)):36");
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15783");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_cql_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15784");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = client1.describe_splits("(127.0.0.1)((127.0.0.1)):-2147483548", ":32", "hi!(hi!)(hi!(hi!))(hi!(hi!)(hi!(hi!))):101", (int) (byte) -60);
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
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15785");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("4294967307");
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15786");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.KeyRange keyRange13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList15 = client2.get_range_slices(columnParent11, slicePredicate12, keyRange13, consistencyLevel14);
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
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15787");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(60L);
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15788");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        java.lang.String str14 = cassandraHost2.getIp();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost17.setUseSocketKeepalive(true);
        cassandraHost17.setCassandraThriftSocketTimeout(0);
        boolean boolean22 = cassandraHost2.equals((java.lang.Object) cassandraHost17);
        int int23 = cassandraHost2.getMaxFrameSize();
        boolean boolean24 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(2);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 83);
        java.lang.String str29 = cassandraHost2.toString();
        int int30 = cassandraHost2.getMaxFrameSize();
        java.lang.String str31 = cassandraHost2.getIp();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "127.0.0.1" + "'", str14, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(127.0.0.1):10" + "'", str29, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "127.0.0.1" + "'", str31, "127.0.0.1");
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15789");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("50");
        int int2 = cassandraHost1.getMaxFrameSize();
        int int3 = cassandraHost1.getPort();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9160 + "'", int3 == 9160);
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15790");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("42");
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
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15791");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef7 = client2.recv_describe_keyspace();
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
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15792");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.recv_describe_version();
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
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15793");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer9, columnPath10, 22L, consistencyLevel12);
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
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15794");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client1.get_paged_slice("99(0.0.0.99)", keyRange10, byteBuffer11, consistencyLevel12);
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
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15795");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_update_keyspace(ksDef9);
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
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15796");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
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
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15797");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        boolean boolean6 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!(hi!):10" + "'", str3, "hi!(hi!):10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15798");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_cql_version();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15799");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-1));
        long long3 = atomicLong1.addAndGet(0L);
        java.lang.String str4 = atomicLong1.toString();
        int int5 = atomicLong1.intValue();
        java.util.function.LongUnaryOperator longUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong1.updateAndGet(longUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15800");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-2", 328);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 99);
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15801");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.system_update_keyspace(ksDef13);
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
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15802");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client1.execute_prepared_cql_query((int) (short) 35, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
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
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15803");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.system_drop_keyspace("127.0.0.1:97");
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
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15804");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(100L, (long) (byte) -1);
        long long7 = atomicLong1.getAndDecrement();
        int int8 = atomicLong1.intValue();
        double double9 = atomicLong1.doubleValue();
        long long11 = atomicLong1.addAndGet(61L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15805");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(127.0.0.1)((127.0.0.1)):0" + "'", str2, "(127.0.0.1)((127.0.0.1)):0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1)):0" + "'", str4, "(127.0.0.1)((127.0.0.1)):0");
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15806");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getPort();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 9160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9160 + "'", int2 == 9160);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15807");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("113", (int) (short) 147);
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15808");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList14, columnParent16, slicePredicate17, consistencyLevel18);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15809");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":10");
        cassandraHost1.setCassandraThriftSocketTimeout((-57));
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15810");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):52");
        boolean boolean2 = cassandraHost1.getLifo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15811");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String str7 = cassandraHost2.getIp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):10" + "'", str4, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "127.0.0.1" + "'", str7, "127.0.0.1");
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15812");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get(byteBuffer10, columnPath11, consistencyLevel12);
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
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15813");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.describe_cluster_name();
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
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15814");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult14 = client1.recv_execute_cql_query();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15815");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_column_family(cfDef14);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15816");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_slice(byteBuffer10, columnParent11, slicePredicate12, consistencyLevel13);
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
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15817");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15818");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):101", 82);
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15819");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -1);
        long long2 = atomicLong1.longValue();
        float float3 = atomicLong1.floatValue();
        atomicLong1.lazySet(54L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15820");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(93L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(11L, 116L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15821");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_column_family(cfDef8);
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
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15822");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_column_family("269");
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
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15823");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray10 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList11 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList11, byteBufferArray10);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query(0, (java.util.List<java.nio.ByteBuffer>) byteBufferList11);
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
        org.junit.Assert.assertNotNull(byteBufferArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15824");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
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
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15825");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
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
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15826");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 68);
        cassandraHost2.setMaxFrameSize((int) (short) 196);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 99);
        java.lang.Class<?> wildcardClass7 = cassandraHost2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15827");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_system_drop_keyspace();
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
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15828");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52(0.0.0.52)(52(0.0.0.52)):-2", (int) (short) 107);
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15829");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (int) ' ');
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15830");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList9 = client1.describe_ring("1");
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
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15831");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult10 = client2.execute_prepared_cql_query((int) (byte) -102, (java.util.List<java.nio.ByteBuffer>) byteBufferList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15832");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange11 = null;
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("(127.0.0.1):2147483647", keyRange11, byteBuffer12, consistencyLevel13);
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
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15833");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(268L);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) (short) 293, 11L);
        java.util.function.LongBinaryOperator longBinaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong1.accumulateAndGet((long) 210, longBinaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15834");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getUrl();
        int int4 = cassandraHost2.getMaxFrameSize();
        java.lang.String str5 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1):1" + "'", str3, "(127.0.0.1):1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1)((127.0.0.1)):1" + "'", str5, "(127.0.0.1)((127.0.0.1)):1");
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15835");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_count(byteBuffer7, columnParent8, slicePredicate9, consistencyLevel10);
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
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15836");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):35", (int) (byte) 35);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getHost();
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0(0.0.0.0)" + "'", str4, "0(0.0.0.0)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15837");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult4 = client1.recv_execute_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15838");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
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
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap13 = client1.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15839");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 32);
        java.lang.String str7 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted(326L);
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":10" + "'", str7, ":10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 326L + "'", long10 == 326L);
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15840");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client2.recv_get_paged_slice();
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
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15841");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol15 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("(127.0.0.1)((127.0.0.1)):68");
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15842");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_keyspace(ksDef7);
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
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15843");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        long long7 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean8 = cassandraHost2.getLifo();
        java.lang.String str9 = cassandraHost2.getName();
        int int10 = cassandraHost2.getMaxFrameSize();
        java.lang.String str11 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "127.0.0.1(127.0.0.1):0" + "'", str9, "127.0.0.1(127.0.0.1):0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "127.0.0.1" + "'", str11, "127.0.0.1");
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15844");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("13", (int) (short) 0);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -108);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15845");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (int) (short) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(69L);
        float float5 = atomicLong4.floatValue();
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        org.apache.thrift.protocol.TProtocol tProtocol7 = null;
        org.apache.cassandra.thrift.Cassandra.Client client8 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol7);
        org.apache.thrift.protocol.TProtocol tProtocol9 = client8.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client8.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client8.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client8.getInputProtocol();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) client8);
        // The following exception was thrown during execution in test generation
        try {
            client8.set_cql_version("102:99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 69.0f + "'", float5 == 69.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15846");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client2.system_update_column_family(cfDef14);
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
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15847");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("102(0.0.0.102)(102(0.0.0.102)):52");
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15848");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15849");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.getName();
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str11 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):10" + "'", str7, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(127.0.0.1):10" + "'", str11, "(127.0.0.1):10");
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15850");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        boolean boolean5 = atomicLong0.weakCompareAndSet(0L, (long) (short) 100);
        int int6 = atomicLong0.intValue();
        long long7 = atomicLong0.getAndIncrement();
        long long9 = atomicLong0.getAndSet(270L);
        boolean boolean12 = atomicLong0.compareAndSet(277L, 10L);
        long long13 = atomicLong0.get();
        long long15 = atomicLong0.getAndSet((long) (short) 130);
        long long17 = atomicLong0.getAndSet(9201L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 270L + "'", long13 == 270L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 270L + "'", long15 == 270L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 130L + "'", long17 == 130L);
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15851");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (short) 99);
        cassandraHost2.setMaxFrameSize((int) (byte) 36);
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15852");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = client1.get_count(byteBuffer14, columnParent15, slicePredicate16, consistencyLevel17);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15853");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange14 = null;
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("60", keyRange14, byteBuffer15, consistencyLevel16);
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
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15854");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("52(0.0.0.52)(52(0.0.0.52)):-2");
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
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15855");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long2 = atomicLong1.get();
        long long3 = atomicLong1.getAndIncrement();
        long long4 = atomicLong1.getAndIncrement();
        long long5 = atomicLong1.getAndIncrement();
        long long6 = atomicLong1.longValue();
        int int7 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 102L + "'", long5 == 102L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103L + "'", long6 == 103L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15856");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn16 = client1.get(byteBuffer13, columnPath14, consistencyLevel15);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15857");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.recv_describe_snitch();
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
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15858");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange5 = null;
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice(":2147483647", keyRange5, byteBuffer6, consistencyLevel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15859");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("0(0.0.0.0)(0(0.0.0.0)):101");
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
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15860");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet((long) 'a');
        long long6 = atomicLong1.getAndSet(1L);
        long long7 = atomicLong1.getAndIncrement();
        double double8 = atomicLong1.doubleValue();
        double double9 = atomicLong1.doubleValue();
        long long10 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15861");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList16 = client2.describe_splits("hi!:35", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):114", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):101", (int) (byte) -51);
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
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15862");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_schema_versions();
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
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15863");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_column_family(cfDef13);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15864");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        java.lang.String str4 = atomicLong1.toString();
        atomicLong1.set(277L);
        long long8 = atomicLong1.getAndSet(370L);
        long long10 = atomicLong1.getAndSet((long) (byte) 114);
        int int11 = atomicLong1.intValue();
        atomicLong1.lazySet(4L);
        boolean boolean16 = atomicLong1.compareAndSet(2147483648L, 166L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 277L + "'", long8 == 277L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 370L + "'", long10 == 370L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 114 + "'", int11 == 114);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15865");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn7 = client2.recv_get();
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
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15866");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-2147483542));
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15867");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101(0.0.0.101):9160", 82);
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15868");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("54", (int) (short) 201);
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15869");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent6 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList9 = client1.get_slice(byteBuffer5, columnParent6, slicePredicate7, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15870");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("0:-2");
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15871");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(110L);
        atomicLong1.lazySet((long) (short) -1);
        atomicLong1.lazySet(2147483699L);
        java.lang.String str6 = atomicLong1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2147483699" + "'", str6, "2147483699");
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15872");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -2);
        int int16 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int17 = cassandraHost2.getMaxFrameSize();
        int int18 = cassandraHost2.getMaxActive();
        cassandraHost2.setLifo(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15873");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10", (int) (byte) 1);
        cassandraHost2.setMaxActive((int) (byte) -56);
        cassandraHost2.setMaxActive(328);
        java.lang.String str7 = cassandraHost2.getHost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str7, "(127.0.0.1)((127.0.0.1))");
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15874");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.recv_describe_cluster_name();
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
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15875");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client2.describe_ring("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15876");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.recv_system_add_column_family();
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
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15877");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove_counter(byteBuffer13, columnPath14, consistencyLevel15);
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
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15878");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
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
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15879");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15880");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        int int2 = atomicLong0.intValue();
        float float3 = atomicLong0.floatValue();
        long long4 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.getAndAdd(2147483825L);
        long long8 = atomicLong0.getAndAdd(58L);
        atomicLong0.set(34L);
        long long12 = atomicLong0.getAndSet((long) 'a');
        long long14 = atomicLong0.getAndSet(9158L);
        long long15 = atomicLong0.get();
        long long17 = atomicLong0.getAndSet((long) (byte) -123);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483826L + "'", long8 == 2147483826L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 34L + "'", long12 == 34L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9158L + "'", long15 == 9158L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9158L + "'", long17 == 9158L);
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15881");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList14, columnParent16, slicePredicate17, consistencyLevel18);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15882");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = client2.recv_get_count();
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
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15883");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_column_family(cfDef8);
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
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15884");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("(127.0.0.1)((127.0.0.1)):-2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15885");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.IndexClause indexClause12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList15 = client1.get_indexed_slices(columnParent11, indexClause12, slicePredicate13, consistencyLevel14);
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
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15886");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-57));
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!(hi!):10" + "'", str3, "hi!(hi!):10");
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15887");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList10 = client1.get_slice(byteBuffer6, columnParent7, slicePredicate8, consistencyLevel9);
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
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15888");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.IndexClause indexClause12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_indexed_slices(columnParent11, indexClause12, slicePredicate13, consistencyLevel14);
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
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15889");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_column_family(cfDef7);
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
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15890");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101", (-2147483472));
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String str4 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "101:-2147483472" + "'", str3, "101:-2147483472");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.101" + "'", str4, "0.0.0.101");
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15891");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer5, columnPath6, 282L, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15892");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        long long3 = atomicLong1.get();
        long long5 = atomicLong1.getAndAdd(0L);
        atomicLong1.set((-2L));
        long long8 = atomicLong1.getAndDecrement();
        boolean boolean11 = atomicLong1.weakCompareAndSet((long) (short) 107, 4294967308L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15893");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
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
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15894");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (int) (short) 99);
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15895");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) 'a');
        java.lang.String str3 = cassandraHost2.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float6 = atomicLong5.floatValue();
        int int7 = atomicLong5.intValue();
        boolean boolean10 = atomicLong5.compareAndSet(100L, (long) (byte) -1);
        long long12 = atomicLong5.getAndAdd((long) 10);
        long long14 = atomicLong5.addAndGet(2147483747L);
        long long15 = atomicLong5.getAndDecrement();
        long long17 = atomicLong5.addAndGet(69L);
        long long19 = atomicLong5.getAndSet((long) (short) 100);
        boolean boolean20 = cassandraHost2.equals((java.lang.Object) long19);
        java.lang.String str21 = cassandraHost2.getHost();
        cassandraHost2.setCassandraThriftSocketTimeout(466);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1):97" + "'", str3, "(127.0.0.1):97");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2147483757L + "'", long14 == 2147483757L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2147483757L + "'", long15 == 2147483757L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483825L + "'", long17 == 2147483825L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2147483825L + "'", long19 == 2147483825L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15896");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = client1.recv_describe_splits();
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
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15897");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(100L, (long) (byte) -1);
        long long8 = atomicLong1.getAndAdd((long) 10);
        long long10 = atomicLong1.addAndGet(2147483747L);
        float float11 = atomicLong1.floatValue();
        atomicLong1.lazySet(155L);
        boolean boolean16 = atomicLong1.compareAndSet((long) (short) 109, 2147483750L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2147483757L + "'", long10 == 2147483757L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.14748365E9f + "'", float11 == 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15898");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get(byteBuffer8, columnPath9, consistencyLevel10);
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
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15899");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = client2.recv_get_count();
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
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15900");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
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
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15901");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        cassandraHost1.setUseThriftFramedTransport(false);
        int int4 = cassandraHost1.getMaxActive();
        boolean boolean5 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setLifo(false);
        boolean boolean8 = cassandraHost1.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15902");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove_counter(byteBuffer8, columnPath9, consistencyLevel10);
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
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15903");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList12 = client2.describe_keyspaces();
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
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15904");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long1 = atomicLong0.longValue();
        atomicLong0.set((long) (byte) 100);
        long long4 = atomicLong0.get();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2147483571L) + "'", long1 == (-2147483571L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15905");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult9 = client1.recv_execute_prepared_cql_query();
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
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15906");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.101", 50);
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15907");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 0);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet(43L);
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.updateAndGet(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15908");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList7 = client2.recv_describe_splits();
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
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15909");
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
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap9 = client2.recv_multiget_count();
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
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15910");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer9, columnPath10, (long) 201, consistencyLevel12);
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
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15911");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.Compression compression9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer8, compression9);
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
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15912");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("101(0.0.0.101):9160");
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
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15913");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace(":10(:10)(:10(:10)):99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15914");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String str5 = cassandraHost2.getUrl();
        java.lang.String str6 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive(9160);
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        int int10 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":10" + "'", str5, ":10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15915");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client1.recv_system_update_keyspace();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15916");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange13 = null;
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice("(127.0.0.1)((127.0.0.1)):101", keyRange13, byteBuffer14, consistencyLevel15);
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15917");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(50L);
        long long2 = atomicLong1.incrementAndGet();
        long long4 = atomicLong1.getAndSet(237L);
        long long6 = atomicLong1.getAndAdd((long) 34);
        java.lang.String str7 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 51L + "'", long4 == 51L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 237L + "'", long6 == 237L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "271" + "'", str7, "271");
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15918");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("0(0.0.0.0):52");
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
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15919");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 10);
        long long3 = atomicLong1.getAndAdd((long) (-2));
        long long5 = atomicLong1.getAndSet((long) 82);
        long long6 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 8L + "'", long5 == 8L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 81L + "'", long6 == 81L);
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15920");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.KeyRange keyRange12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client1.get_range_slices(columnParent10, slicePredicate11, keyRange12, consistencyLevel13);
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
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15921");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef8 = client1.describe_keyspace("0(0.0.0.0)");
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
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15922");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = client2.recv_describe_schema_versions();
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
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15923");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        long long3 = atomicLong1.get();
        long long5 = atomicLong1.getAndAdd(0L);
        long long6 = atomicLong1.decrementAndGet();
        long long8 = atomicLong1.getAndAdd((long) 9160);
        long long9 = atomicLong1.incrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = atomicLong1.getAndUpdate(longUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 99L + "'", long8 == 99L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9260L + "'", long9 == 9260L);
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15924");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxFrameSize(68);
        cassandraHost2.setLifo(false);
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15925");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_system_update_column_family();
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
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15926");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("97", (-65));
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 41);
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15927");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 53);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15928");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.system_add_column_family(cfDef5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15929");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_keyspace(ksDef9);
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
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15930");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long4 = atomicLong0.getAndSet((long) ' ');
        long long6 = atomicLong0.getAndSet(2147483647L);
        long long8 = atomicLong0.getAndAdd(2147483647L);
        long long9 = atomicLong0.get();
        long long11 = atomicLong0.getAndSet(9160L);
        boolean boolean14 = atomicLong0.weakCompareAndSet((long) (short) 196, 466L);
        long long15 = atomicLong0.incrementAndGet();
        long long16 = atomicLong0.incrementAndGet();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483647L + "'", long8 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4294967294L + "'", long9 == 4294967294L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967294L + "'", long11 == 4294967294L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9161L + "'", long15 == 9161L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9162L + "'", long16 == 9162L);
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15931");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client1.get_paged_slice("165", keyRange10, byteBuffer11, consistencyLevel12);
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
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15932");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 52);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):52" + "'", str4, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):52");
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15933");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.Compression compression15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer14, compression15);
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
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15934");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.getAndIncrement();
        long long4 = atomicLong0.getAndAdd((long) '4');
        atomicLong0.set((long) '#');
        long long7 = atomicLong0.incrementAndGet();
        java.lang.String str8 = atomicLong0.toString();
        float float9 = atomicLong0.floatValue();
        long long10 = atomicLong0.incrementAndGet();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "36" + "'", str8, "36");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 36.0f + "'", float9 == 36.0f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 37L + "'", long10 == 37L);
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15935");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 35);
        long long2 = atomicLong1.incrementAndGet();
        short short3 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 36 + "'", short3 == (short) 36);
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15936");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("0:35");
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
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15937");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("0.0.0.102", "", "60", 205);
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
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15938");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.Column column9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer7, columnParent8, column9, consistencyLevel10);
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
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15939");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.add(byteBuffer7, columnParent8, counterColumn9, consistencyLevel10);
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
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15940");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("50");
        cassandraHost1.setUseThriftFramedTransport(true);
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15941");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace(":0(:0)");
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15942");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn9 = client2.recv_get();
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
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15943");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.system_drop_column_family("98:171");
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
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15944");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = client1.describe_splits("2147483656", "110", "298", (int) (byte) 99);
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15945");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("2147483826");
        cassandraHost1.setMaxWaitTimeWhenExhausted(89L);
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15946");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("4294967307", (int) (short) 277);
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15947");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.IndexClause indexClause10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client1.get_indexed_slices(columnParent9, indexClause10, slicePredicate11, consistencyLevel12);
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
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15948");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
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
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15949");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setMaxFrameSize(43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15950");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.Column column14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.insert(byteBuffer12, columnParent13, column14, consistencyLevel15);
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15951");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
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
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15952");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 1);
        boolean boolean4 = atomicLong1.compareAndSet((long) (short) 130, 2147483649L);
        long long5 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15953");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_keyspace("(127.0.0.1):3");
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
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15954");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long2 = atomicLong1.incrementAndGet();
        boolean boolean5 = atomicLong1.compareAndSet((long) (short) 10, 2L);
        java.util.function.LongUnaryOperator longUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong1.updateAndGet(longUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15955");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        cassandraHost1.setUseSocketKeepalive(true);
        java.lang.String str4 = cassandraHost1.getHost();
        cassandraHost1.setLifo(true);
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setUseSocketKeepalive(true);
        cassandraHost1.setUseThriftFramedTransport(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15956");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.system_drop_column_family("(127.0.0.1)((127.0.0.1)):0");
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
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15957");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.toString();
        int int7 = cassandraHost2.getMaxActive();
        java.lang.String str8 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):10" + "'", str5, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1):10" + "'", str6, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15958");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.Column column9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer7, columnParent8, column9, consistencyLevel10);
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
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15959");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult14 = client1.recv_execute_cql_query();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15960");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        cassandraHost2.setMaxWaitTimeWhenExhausted(21L);
        java.lang.String str9 = cassandraHost2.getHost();
        java.lang.String str10 = cassandraHost2.toString();
        boolean boolean11 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):10" + "'", str4, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(127.0.0.1):10" + "'", str10, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15961");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("32");
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
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15962");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15963");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer7, columnPath8, consistencyLevel9);
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
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15964");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2", (int) (byte) 99);
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15965");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.Column column12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_insert(byteBuffer10, columnParent11, column12, consistencyLevel13);
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
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15966");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn17 = client2.get(byteBuffer14, columnPath15, consistencyLevel16);
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
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15967");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap13 = client1.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15968");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn17 = client2.get(byteBuffer14, columnPath15, consistencyLevel16);
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
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15969");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
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
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15970");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_login(authenticationRequest11);
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
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15971");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) (-2));
        long long4 = atomicLong1.incrementAndGet();
        long long5 = atomicLong1.longValue();
        atomicLong1.set((long) (byte) 0);
        long long9 = atomicLong1.addAndGet(300L);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = atomicLong1.getAndAccumulate((long) (byte) 0, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300L + "'", long9 == 300L);
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15972");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef7 = client1.describe_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-1");
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
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15973");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer9, columnPath10, 168L, consistencyLevel12);
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
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15974");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15975");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
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
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15976");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.IndexClause indexClause12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent11, indexClause12, slicePredicate13, consistencyLevel14);
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
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15977");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.system_update_keyspace(ksDef6);
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
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15978");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet((long) 'a');
        long long6 = atomicLong1.getAndSet(1L);
        long long7 = atomicLong1.incrementAndGet();
        long long8 = atomicLong1.incrementAndGet();
        double double9 = atomicLong1.doubleValue();
        long long11 = atomicLong1.addAndGet(564L);
        java.util.function.LongUnaryOperator longUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = atomicLong1.getAndUpdate(longUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 567L + "'", long11 == 567L);
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15979");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15980");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client1.recv_describe_ring();
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
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15981");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(198L);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.accumulateAndGet((long) 165, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15982");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap7 = client1.recv_multiget_count();
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
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15983");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult14 = client1.recv_prepare_cql_query();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15984");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
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
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15985");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap6 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_batch_mutate(byteBufferMap6, consistencyLevel7);
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
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15986");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:9160" + "'", str5, "0:9160");
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15987");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-2));
        short short2 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -2 + "'", short2 == (short) -2);
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15988");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray10 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList11 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList11, byteBufferArray10);
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap16 = client2.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList11, columnParent13, slicePredicate14, consistencyLevel15);
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
        org.junit.Assert.assertNotNull(byteBufferArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15989");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList9 = client2.recv_get_range_slices();
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
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15990");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("");
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
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15991");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = client1.describe_schema_versions();
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
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15992");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        atomicLong1.lazySet((long) (-1));
        long long5 = atomicLong1.getAndAdd(101L);
        long long7 = atomicLong1.addAndGet(237L);
        long long9 = atomicLong1.getAndSet((long) (byte) 58);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = atomicLong1.getAndAccumulate(13L, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 337L + "'", long7 == 337L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 337L + "'", long9 == 337L);
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15993");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.Compression compression10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_cql_query(byteBuffer9, compression10);
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
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15994");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) -1);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483757L);
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):32", (int) (byte) 41);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) "127.0.0.1(127.0.0.1):32");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":-1" + "'", str7, ":-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15995");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult10 = client2.execute_prepared_cql_query(2, (java.util.List<java.nio.ByteBuffer>) byteBufferList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15996");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.getName();
        cassandraHost2.setMaxFrameSize((int) (short) 176);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "127.0.0.1(127.0.0.1):10" + "'", str3, "127.0.0.1(127.0.0.1):10");
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15997");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version(":0(:0)(:0(:0)):99");
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
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15998");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList13 = client1.recv_describe_ring();
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
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15999");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.describe_snitch();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test16000");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.recv_system_drop_keyspace();
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
}
