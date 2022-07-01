import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove_counter(byteBuffer12, columnPath13, consistencyLevel14);
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
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
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
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
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
            client2.set_keyspace("hi!:35");
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
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
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
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
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
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray7, false);
        tSSLTransportParameters14.setKeyStore("207", ":1:1");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(111L);
        boolean boolean8 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "127.0.0.1" + "'", str4, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
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
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getPort();
        java.lang.String str5 = cassandraHost1.getUrl();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32" + "'", str2, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32" + "'", str3, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1)((127.0.0.1)):32" + "'", str5, "(127.0.0.1)((127.0.0.1)):32");
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_ring("106(0.0.0.106)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 10);
        boolean boolean6 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -104);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(247L);
        long long3 = atomicLong1.getAndSet((long) 197);
        atomicLong1.set((long) (short) 100);
        long long6 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 247L + "'", long3 == 247L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 101L + "'", long6 == 101L);
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("602(0.0.2.90):416");
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
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
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
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515(0.0.2.3):101", strArray8);
        tSSLTransportParameters15.setKeyStore("299", "(127.0.0.1)((127.0.0.1)):32", "9176", "CassandraClient<%s-%d>:97");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList12 = client1.describe_ring("10(0.0.0.10)(10(0.0.0.10))");
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
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn15 = client1.get(byteBuffer12, columnPath13, consistencyLevel14);
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
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
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
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:99");
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -100);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 1);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String str5 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.194");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray10);
        tSSLTransportParameters21.setTrustStore("6", "hi!:9160", "457(0.0.1.201):0", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):206");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        atomicLong1.set((long) 1);
        long long9 = atomicLong1.getAndAdd(1L);
        long long11 = atomicLong1.getAndSet((long) 9160);
        long long12 = atomicLong1.incrementAndGet();
        double double13 = atomicLong1.doubleValue();
        boolean boolean16 = atomicLong1.weakCompareAndSet(163L, (long) (byte) 105);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9161L + "'", long12 == 9161L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9161.0d + "'", double13 == 9161.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("6:10");
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
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) 206);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String str4 = cassandraHost2.getName();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.1" + "'", str3, "0.0.0.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1(0.0.0.1):206" + "'", str4, "1(0.0.0.1):206");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("101");
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
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getMaxActive();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("3");
        java.lang.String str12 = cassandraHost11.getHost();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) cassandraHost11);
        cassandraHost2.setMaxActive((int) (byte) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", 221);
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 6);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        long long7 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -46);
        boolean boolean4 = atomicLong1.weakCompareAndSet(304L, 199L);
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.updateAndGet(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str6 = cassandraHost2.getName();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1)((127.0.0.1)):100" + "'", str6, "(127.0.0.1)((127.0.0.1)):100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList7 = client1.recv_get_range_slices();
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
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
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
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
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
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(10L);
        float float2 = atomicLong1.floatValue();
        atomicLong1.set(399L);
        double double5 = atomicLong1.doubleValue();
        long long6 = atomicLong1.decrementAndGet();
        int int7 = atomicLong1.intValue();
        boolean boolean10 = atomicLong1.weakCompareAndSet((long) (byte) 40, 506L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 399.0d + "'", double5 == 399.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 398L + "'", long6 == 398L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 398 + "'", int7 == 398);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.batch_mutate(byteBufferMap8, consistencyLevel9);
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
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1", (int) 'a');
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str6 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10(0.0.0.10):97" + "'", str6, "10(0.0.0.10):97");
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove_counter(byteBuffer12, columnPath13, consistencyLevel14);
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
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        java.lang.String[] strArray9 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):194", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray9, true);
        tSSLTransportParameters17.setTrustStore("hi!(hi!):35", "0(0.0.0.0):5");
        tSSLTransportParameters17.setKeyStore("602(0.0.2.90):416", "127.0.0.1(127.0.0.1):1", "", ":9160(:9160)");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(120L);
        long long2 = atomicLong1.getAndDecrement();
        byte byte3 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 120L + "'", long2 == 120L);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 119 + "'", byte3 == (byte) 119);
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(87L);
        long long2 = atomicLong1.get();
        boolean boolean5 = atomicLong1.compareAndSet(1630L, 824L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:33", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):206", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1723L);
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):16", (int) (short) 16);
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        cassandraHost1.setMaxActive((int) (short) 48);
        int int4 = cassandraHost1.getMaxActive();
        boolean boolean5 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String str6 = cassandraHost1.getHost();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0(0.0.0.0)" + "'", str6, "0(0.0.0.0)");
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.system_drop_column_family("96:500");
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
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndSet(199L);
        float float3 = atomicLong0.floatValue();
        long long4 = atomicLong0.decrementAndGet();
        long long5 = atomicLong0.getAndIncrement();
        long long6 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 215L + "'", long2 == 215L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 199.0f + "'", float3 == 199.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 198L + "'", long4 == 198L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 198L + "'", long5 == 198L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 199L + "'", long6 == 199L);
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -3);
        long long2 = atomicLong1.decrementAndGet();
        java.util.function.LongBinaryOperator longBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.accumulateAndGet((long) 16, longBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.get_range_slices(columnParent7, slicePredicate8, keyRange9, consistencyLevel10);
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
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.system_update_keyspace(ksDef9);
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
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean7 = cassandraHost6.getLifo();
        java.lang.String str8 = cassandraHost6.toString();
        java.lang.String str9 = cassandraHost6.getIp();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97" + "'", str8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CassandraClient<%s-%d>" + "'", str9, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("96(0.0.0.96):54");
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
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(true);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:2", strArray9);
        tSSLTransportParameters19.setTrustStore(":1:1", "(127.0.0.1)((127.0.0.1)):97", "1(0.0.0.1):100", "206");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
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
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer7, columnPath8, (long) (byte) 10, consistencyLevel10);
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
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        atomicLong1.set((long) 1);
        long long8 = atomicLong1.getAndDecrement();
        boolean boolean11 = atomicLong1.weakCompareAndSet(206L, 8L);
        double double12 = atomicLong1.doubleValue();
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = atomicLong1.getAndAccumulate(186L, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer7, columnPath8, 116L, consistencyLevel10);
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
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.describe_cluster_name();
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
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 6);
        atomicLong1.set(4L);
        long long5 = atomicLong1.addAndGet((long) (byte) -14);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-10L) + "'", long5 == (-10L));
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 64);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_add(byteBuffer12, columnParent13, counterColumn14, consistencyLevel15);
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
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_column_family(cfDef11);
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
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.Column column10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.insert(byteBuffer8, columnParent9, column10, consistencyLevel11);
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
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
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
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
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
            client1.send_execute_cql_query(byteBuffer8, compression9);
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
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_keyspace();
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
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
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
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList8 = client1.describe_keyspaces();
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
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("CassandraClient<%s-%d>:33");
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
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_set_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 303);
        long long2 = atomicLong1.incrementAndGet();
        long long4 = atomicLong1.addAndGet((long) (byte) 11);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 304L + "'", long2 == 304L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 315L + "'", long4 == 315L);
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-1));
        cassandraHost2.setMaxWaitTimeWhenExhausted(206L);
        cassandraHost2.setLifo(true);
        int int12 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):0", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.2.90", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 3);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:99", (int) (short) 98);
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        java.lang.String[] strArray8 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("606", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray8);
        tSSLTransportParameters12.setTrustStore("34", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 206);
        cassandraHost2.setMaxWaitTimeWhenExhausted(114L);
        java.lang.String str5 = cassandraHost2.getName();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10");
        boolean boolean8 = cassandraHost7.getUseSocketKeepalive();
        cassandraHost7.setLifo(false);
        boolean boolean11 = cassandraHost7.isPerformNameResolution();
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) boolean11);
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) "12");
        cassandraHost2.setLifo(false);
        java.lang.String str17 = cassandraHost2.toString();
        int int18 = cassandraHost2.getMaxActive();
        cassandraHost2.setCassandraThriftSocketTimeout(103);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":9160(:9160):206" + "'", str5, ":9160(:9160):206");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":9160(:9160):206" + "'", str17, ":9160(:9160):206");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray10);
        tSSLTransportParameters21.requireClientAuth(false);
        tSSLTransportParameters21.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "1(0.0.0.1):6");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_count(byteBuffer10, columnParent11, slicePredicate12, consistencyLevel13);
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
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
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
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
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
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
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
            client2.send_set_cql_version("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
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
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 1);
        cassandraHost2.setMaxActive(414);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        boolean boolean8 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList4 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList4, byteBufferArray3);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (byte) 12, (java.util.List<java.nio.ByteBuffer>) byteBufferList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
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
            client2.remove_counter(byteBuffer7, columnPath8, consistencyLevel9);
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
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray13, false);
        tSSLTransportParameters28.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_system_add_column_family();
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
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap12 = client1.recv_multiget_count();
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
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.system_drop_column_family("hi!(hi!)(hi!(hi!)):296");
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
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_update_column_family(cfDef10);
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
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("504", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)(0(0.0.0.0)):10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray13, true);
        tSSLTransportParameters29.setKeyStore("602", "10", "127.0.0.1(127.0.0.1):9160", "61(0.0.0.61):201");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(105L);
        long long2 = atomicLong1.incrementAndGet();
        double double3 = atomicLong1.doubleValue();
        boolean boolean6 = atomicLong1.compareAndSet(247L, 819L);
        long long7 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 106.0d + "'", double3 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 106L + "'", long7 == 106L);
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
        java.lang.String[] strArray1 = null;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("296", strArray1, false);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -47);
        double double2 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-47.0d) + "'", double2 == (-47.0d));
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("(127.0.0.1):124");
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
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(296L);
        double double2 = atomicLong1.doubleValue();
        boolean boolean5 = atomicLong1.weakCompareAndSet(43L, 83L);
        float float6 = atomicLong1.floatValue();
        int int7 = atomicLong1.intValue();
        atomicLong1.lazySet(319L);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = atomicLong1.accumulateAndGet(0L, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 296.0d + "'", double2 == 296.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 296.0f + "'", float6 == 296.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 296 + "'", int7 == 296);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -1);
        long long3 = atomicLong1.getAndSet(0L);
        double double4 = atomicLong1.doubleValue();
        long long6 = atomicLong1.getAndSet(204L);
        java.lang.String str7 = atomicLong1.toString();
        java.util.function.LongUnaryOperator longUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.updateAndGet(longUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "204" + "'", str7, "204");
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 9160);
        long long2 = atomicLong1.getAndIncrement();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(516L, (long) (byte) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9160L + "'", long2 == 9160L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9161 + "'", int3 == 9161);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("202", 0);
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setLifo(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "202" + "'", str3, "202");
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList15 = client1.recv_describe_ring();
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
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.system_drop_keyspace("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):53");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("hi!:0", keyRange9, byteBuffer10, consistencyLevel11);
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
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap15 = client1.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList10, columnParent12, slicePredicate13, consistencyLevel14);
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
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray9, false);
        tSSLTransportParameters19.setKeyStore("0(0.0.0.0)(0(0.0.0.0)):9160", "CassandraClient<%s-%d>");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.system_drop_column_family(":1:9160");
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
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(349L);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(342L);
        java.lang.String str17 = cassandraHost2.getName();
        long long18 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!(hi!):10" + "'", str17, "hi!(hi!):10");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 342L + "'", long18 == 342L);
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setMaxActive(0);
        cassandraHost2.setMaxWaitTimeWhenExhausted(603L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):1" + "'", str4, "(127.0.0.1):1");
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef7 = client1.describe_keyspace("85");
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
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
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
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (byte) 0);
        cassandraHost2.setMaxActive((int) (byte) 33);
        java.lang.String str5 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -50);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0" + "'", str5, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (byte) 85);
        cassandraHost2.setUseSocketKeepalive(true);
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
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
            client1.send_describe_ring("416(0.0.1.160):11");
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
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_cql_version("127.0.0.1(127.0.0.1)");
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
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxActive(0);
        java.lang.String str10 = cassandraHost2.getUrl();
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        java.lang.String str12 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!:10" + "'", str10, "hi!:10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!(hi!):10" + "'", str12, "hi!(hi!):10");
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long2 = atomicLong1.getAndIncrement();
        double double3 = atomicLong1.doubleValue();
        atomicLong1.lazySet(9160L);
        long long7 = atomicLong1.getAndSet(2L);
        boolean boolean10 = atomicLong1.compareAndSet(60L, (long) 16);
        long long11 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9160L + "'", long7 == 9160L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client2.recv_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):0", (int) (short) 299);
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.IndexClause indexClause11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client1.get_indexed_slices(columnParent10, indexClause11, slicePredicate12, consistencyLevel13);
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
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
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
            client2.send_execute_prepared_cql_query((int) (byte) 49, (java.util.List<java.nio.ByteBuffer>) byteBufferList12);
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
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
        java.lang.String[] strArray9 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("399", strArray9, false);
        tSSLTransportParameters17.setTrustStore("399", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        boolean boolean8 = atomicLong1.compareAndSet(10L, 100L);
        long long9 = atomicLong1.getAndIncrement();
        long long11 = atomicLong1.addAndGet((long) (short) 60);
        long long13 = atomicLong1.getAndSet(75L);
        int int14 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 161L + "'", long11 == 161L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 161L + "'", long13 == 161L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 75 + "'", int14 == 75);
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) (byte) -60);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(202L);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) 202L);
        int int6 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-60) + "'", int6 == (-60));
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", (-3));
        boolean boolean3 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = client2.get_count(byteBuffer6, columnParent7, slicePredicate8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long2 = atomicLong0.addAndGet((long) (byte) -1);
        long long4 = atomicLong0.getAndAdd((long) 0);
        long long5 = atomicLong0.get();
        long long6 = atomicLong0.getAndDecrement();
        boolean boolean9 = atomicLong0.weakCompareAndSet(7L, 7L);
        long long10 = atomicLong0.longValue();
        long long11 = atomicLong0.getAndDecrement();
        long long12 = atomicLong0.getAndDecrement();
        long long13 = atomicLong0.getAndIncrement();
        boolean boolean16 = atomicLong0.compareAndSet(102L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-4L) + "'", long13 == (-4L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
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
            client1.send_describe_ring("hi!(hi!):99");
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
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
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
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_slice(byteBuffer7, columnParent8, slicePredicate9, consistencyLevel10);
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
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap12 = client1.recv_multiget_slice();
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
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("hi!(hi!)(hi!(hi!)):84");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84 + "'", int1 == 84);
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
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
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
    }

    @Test
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn11 = client1.get(byteBuffer8, columnPath9, consistencyLevel10);
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
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(false);
        int int7 = cassandraHost2.getMaxActive();
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean10 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
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
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        boolean boolean4 = atomicLong1.compareAndSet((long) (short) 107, 8L);
        boolean boolean7 = atomicLong1.weakCompareAndSet(165L, 147L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray9, true);
        tSSLTransportParameters18.setTrustStore("hi!:10", "CassandraClient<%s-%d>", "1:52", "11");
        tSSLTransportParameters18.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", "0:-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):48", "(127.0.0.1)((127.0.0.1)):100");
        tSSLTransportParameters18.setKeyStore("0.0.0.2", "0.0.0.207(0.0.0.207):9160", "1(0.0.0.1)(1(0.0.0.1)):48", "(127.0.0.1):35");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):5", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("111", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1:9160", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:35", strArray10, true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("114", (int) (byte) 114);
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):97", 48);
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove_counter(byteBuffer8, columnPath9, consistencyLevel10);
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
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 50);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean6 = cassandraHost5.isPerformNameResolution();
        java.lang.String str7 = cassandraHost5.getHost();
        int int8 = cassandraHost5.getPort();
        java.lang.String str9 = cassandraHost5.getHost();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        cassandraHost2.setUseThriftFramedTransport(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive((int) (short) 96);
        java.lang.String str6 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_add_column_family(cfDef10);
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
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:0", strArray5, true);
        tSSLTransportParameters10.setTrustStore("hi!:9160", "131", "9", "10:9160");
        tSSLTransportParameters10.setTrustStore("0", ":9160(:9160):32", "51", "0(0.0.0.0):-1");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 10);
        java.lang.String str6 = cassandraHost2.getName();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseThriftFramedTransport(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!(hi!):10" + "'", str6, "hi!(hi!):10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.Column column9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_insert(byteBuffer7, columnParent8, column9, consistencyLevel10);
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
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive((int) (byte) 11);
        cassandraHost2.setUseSocketKeepalive(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 97);
        atomicLong1.set(12L);
        double double4 = atomicLong1.doubleValue();
        long long6 = atomicLong1.getAndAdd(511L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12L + "'", long6 == 12L);
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.Column column15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.insert(byteBuffer13, columnParent14, column15, consistencyLevel16);
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
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
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
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove_counter(byteBuffer7, columnPath8, consistencyLevel9);
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
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 211);
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("397", (int) (short) 9396);
        cassandraHost2.setUseSocketKeepalive(true);
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.truncate("1(0.0.0.1)");
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
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_keyspace();
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
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("10:-1", "1:0", "96(0.0.0.96):54", 212);
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
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query(0, (java.util.List<java.nio.ByteBuffer>) byteBufferList12);
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
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.Compression compression8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult9 = client1.prepare_cql_query(byteBuffer7, compression8);
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
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("66");
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
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(621L);
        atomicLong1.set((long) 462);
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef12 = client1.describe_keyspace("0.0.0.1(0.0.0.1)");
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
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
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
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", 212);
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 44);
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (byte) 47);
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(96L);
        long long2 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        boolean boolean28 = cassandraHost2.equals((java.lang.Object) false);
        int int29 = cassandraHost2.getMaxActive();
        int int30 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int31 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean34 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive(293);
        long long37 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int38 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50 + "'", int29 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList9 = client1.describe_ring(":10(:10)(:10(:10))(:10(:10)(:10(:10)))");
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
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 212);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 185);
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("-2(-2)");
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
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -1);
        long long3 = atomicLong1.getAndSet(0L);
        double double4 = atomicLong1.doubleValue();
        long long5 = atomicLong1.decrementAndGet();
        long long6 = atomicLong1.get();
        long long7 = atomicLong1.incrementAndGet();
        long long9 = atomicLong1.getAndAdd((long) (short) 185);
        long long11 = atomicLong1.addAndGet(1856L);
        int int12 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2041L + "'", long11 == 2041L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2041 + "'", int12 == 2041);
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("9160:216", keyRange9, byteBuffer10, consistencyLevel11);
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
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange8 = null;
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.get_paged_slice("-3", keyRange8, byteBuffer9, consistencyLevel10);
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
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange14 = null;
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList17 = client1.get_paged_slice("18", keyRange14, byteBuffer15, consistencyLevel16);
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
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(108L);
        boolean boolean4 = atomicLong1.compareAndSet(213L, 12L);
        long long5 = atomicLong1.longValue();
        long long7 = atomicLong1.getAndSet(0L);
        long long8 = atomicLong1.decrementAndGet();
        atomicLong1.set((long) (short) 101);
        int int11 = atomicLong1.intValue();
        long long13 = atomicLong1.getAndAdd(242L);
        float float14 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 108L + "'", long5 == 108L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 108L + "'", long7 == 108L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 101L + "'", long13 == 101L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 343.0f + "'", float14 == 343.0f);
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(197L);
        boolean boolean4 = atomicLong1.compareAndSet(192L, 398L);
        int int5 = atomicLong1.intValue();
        atomicLong1.set((long) (short) 206);
        long long9 = atomicLong1.getAndAdd((long) (byte) 68);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 197 + "'", int5 == 197);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 206L + "'", long9 == 206L);
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList13 = client1.get_slice(byteBuffer9, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 404);
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
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
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.Column column11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_insert(byteBuffer9, columnParent10, column11, consistencyLevel12);
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
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
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
            client1.set_cql_version("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):35");
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
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1:1", strArray9);
        tSSLTransportParameters17.setTrustStore("1:105", "7", "199", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):369");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.system_drop_keyspace("3");
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
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("0.0.0.0(0.0.0.0):50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.6", strArray11);
        tSSLTransportParameters22.setKeyStore("(127.0.0.1):194", "1:105", "CassandraClient<%s-%d>:5", "1:52");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult10 = client1.execute_prepared_cql_query((int) (short) 299, byteBufferList9);
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
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters19.setTrustStore(":9160", "0(0.0.0.0):-1", ":9160", "0(0.0.0.0):-1");
        tSSLTransportParameters19.setTrustStore("(127.0.0.1)((127.0.0.1)):-1", "10(0.0.0.10):207");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd(0L);
        atomicLong1.set((-1L));
        boolean boolean9 = atomicLong1.compareAndSet((long) 11, 600L);
        atomicLong1.set(9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        double double6 = atomicLong1.doubleValue();
        double double7 = atomicLong1.doubleValue();
        double double8 = atomicLong1.doubleValue();
        atomicLong1.set(0L);
        java.lang.String str11 = atomicLong1.toString();
        long long13 = atomicLong1.getAndAdd((long) (byte) 56);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("0(0.0.0.0)(0(0.0.0.0)):100");
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
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = client2.describe_splits("CassandraClient<%s-%d>:2", "1(0.0.0.1)(1(0.0.0.1)):48", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", (int) (byte) -104);
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
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):-2", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):0", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long2 = atomicLong0.addAndGet((long) (byte) -1);
        long long4 = atomicLong0.getAndAdd((long) 0);
        long long5 = atomicLong0.get();
        long long6 = atomicLong0.getAndDecrement();
        int int7 = atomicLong0.intValue();
        java.lang.String str8 = atomicLong0.toString();
        float float9 = atomicLong0.floatValue();
        atomicLong0.lazySet(439L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2" + "'", str8, "-2");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-2.0f) + "'", float9 == (-2.0f));
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer8, columnPath9, 199L, consistencyLevel11);
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
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
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
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList8 = client1.recv_describe_ring();
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
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_column_family(cfDef10);
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
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_remove();
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
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416(0.0.1.160)(416(0.0.1.160))", (int) (short) 84);
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
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
            client2.send_set_cql_version(":1(:1):52");
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
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
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
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(413L);
        java.lang.String str2 = atomicLong1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "413" + "'", str2, "413");
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194(0.0.0.194):84", 50);
        java.lang.String str3 = cassandraHost2.getHost();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "194(0.0.0.194)" + "'", str3, "194(0.0.0.194)");
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("1(0.0.0.1)(1(0.0.0.1)):48");
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
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-2(-2):9160", (int) (byte) -66);
        cassandraHost2.setMaxWaitTimeWhenExhausted(457L);
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_count(byteBuffer10, columnParent11, slicePredicate12, consistencyLevel13);
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
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("");
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
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray8);
        tSSLTransportParameters16.setKeyStore("515", "hi!");
        tSSLTransportParameters16.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", "1(0.0.0.1)(1(0.0.0.1))", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):48", "101");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_add(byteBuffer9, columnParent10, counterColumn11, consistencyLevel12);
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
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        int int2 = atomicLong1.intValue();
        atomicLong1.lazySet((long) 1);
        long long5 = atomicLong1.getAndDecrement();
        long long6 = atomicLong1.decrementAndGet();
        double double7 = atomicLong1.doubleValue();
        boolean boolean10 = atomicLong1.weakCompareAndSet(700L, 424L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndAdd((long) 'a');
        long long3 = atomicLong0.getAndIncrement();
        long long4 = atomicLong0.getAndDecrement();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 214L + "'", long2 == 214L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 311L + "'", long3 == 311L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 312L + "'", long4 == 312L);
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
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
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("7", strArray11, true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList10 = client1.recv_describe_keyspaces();
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
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
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
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost2.getLifo();
        java.lang.String str7 = cassandraHost2.getUrl();
        java.lang.String str8 = cassandraHost2.toString();
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 216);
        int int12 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setLifo(false);
        int int17 = cassandraHost2.getMaxActive();
        int int18 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":10" + "'", str7, ":10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(127.0.0.1):10" + "'", str8, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray8, false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("114", 9181);
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1)(1(0.0.0.1))", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("85", (int) (byte) 36);
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
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
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("0.0.0.54");
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
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray10 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList11 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList11, byteBufferArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult13 = client1.execute_prepared_cql_query(0, (java.util.List<java.nio.ByteBuffer>) byteBufferList11);
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
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = client1.recv_get_count();
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
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1053L);
        atomicLong1.lazySet(250L);
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap14 = client1.multiget_slice(byteBufferList10, columnParent11, slicePredicate12, consistencyLevel13);
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
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 11);
        double double2 = atomicLong1.doubleValue();
        boolean boolean5 = atomicLong1.compareAndSet((long) (short) 2, 199L);
        long long6 = atomicLong1.getAndIncrement();
        long long7 = atomicLong1.decrementAndGet();
        boolean boolean10 = atomicLong1.weakCompareAndSet((long) (short) 236, (long) 307);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray12 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList13 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList13, byteBufferArray12);
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList13, columnParent15, slicePredicate16, consistencyLevel17);
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
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_login(authenticationRequest6);
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
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(201L);
        java.lang.String str5 = cassandraHost2.getIp();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray15);
        boolean boolean27 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1)):100" + "'", str3, "(127.0.0.1)((127.0.0.1)):100");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove_counter(byteBuffer10, columnPath11, consistencyLevel12);
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
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("12");
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
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
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
    }

    @Test
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(4L);
        cassandraHost2.setCassandraThriftSocketTimeout(50);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost17.setLifo(true);
        java.lang.String str20 = cassandraHost17.getHost();
        java.lang.String str21 = cassandraHost17.getHost();
        int int22 = cassandraHost17.getPort();
        int int23 = cassandraHost17.getMaxActive();
        cassandraHost17.setLifo(false);
        boolean boolean26 = cassandraHost2.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):10" + "'", str5, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50 + "'", int23 == 50);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray16 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList17 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList17, byteBufferArray16);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (byte) 100, (java.util.List<java.nio.ByteBuffer>) byteBufferList17);
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
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:33", (int) (short) 15);
        boolean boolean3 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
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
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn13 = client1.recv_get();
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
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean4 = atomicLong1.weakCompareAndSet(195L, 218L);
        long long5 = atomicLong1.getAndDecrement();
        long long7 = atomicLong1.addAndGet((long) 560);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 560L + "'", long7 == 560L);
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
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
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):52", (-11));
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):35", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray9, true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("457", (int) (short) 34);
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 9160);
        long long2 = atomicLong1.longValue();
        java.lang.String str3 = atomicLong1.toString();
        boolean boolean6 = atomicLong1.weakCompareAndSet((long) (short) 5, (long) 100);
        long long8 = atomicLong1.getAndAdd(43L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9160L + "'", long2 == 9160L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9160" + "'", str3, "9160");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9160L + "'", long8 == 9160L);
    }

    @Test
    public void test19254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19254");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 97);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) -3);
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) -7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):97" + "'", str4, "(127.0.0.1):97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):97" + "'", str5, "(127.0.0.1):97");
    }

    @Test
    public void test19255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19255");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
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
    public void test19256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19256");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.system_add_column_family(cfDef9);
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
    public void test19257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19257");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    public void test19258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19258");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.getAndIncrement();
        long long3 = atomicLong1.getAndIncrement();
        long long4 = atomicLong1.decrementAndGet();
        atomicLong1.lazySet(463L);
        java.util.function.LongBinaryOperator longBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.accumulateAndGet((long) 9160, longBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test19259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19259");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("CassandraClient<%s-%d>(CassandraClient<%s-%d>):5");
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
    public void test19260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19260");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("");
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
    public void test19261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19261");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.truncate("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):-95");
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
    public void test19262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19262");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult16 = client1.execute_prepared_cql_query(32, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
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
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19263");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_add();
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
    public void test19264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19264");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client1.recv_system_drop_keyspace();
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
    public void test19265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19265");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.Compression compression10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult11 = client2.prepare_cql_query(byteBuffer9, compression10);
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
    public void test19266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19266");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(503L);
        long long3 = atomicLong1.getAndSet((long) (byte) -56);
        boolean boolean6 = atomicLong1.compareAndSet((long) 135, (-3L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 503L + "'", long3 == 503L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19267");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2");
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
    public void test19268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19268");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("(127.0.0.1):194");
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
    public void test19269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19269");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (int) (short) 194);
        cassandraHost2.setMaxActive((int) (short) 185);
    }

    @Test
    public void test19270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19270");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.recv_system_drop_column_family();
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
    public void test19271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19271");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("108");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19272");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):340");
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
    public void test19273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19273");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
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
    public void test19274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19274");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = client1.recv_get_count();
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
    public void test19275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19275");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.IndexClause indexClause10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_indexed_slices(columnParent9, indexClause10, slicePredicate11, consistencyLevel12);
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
    public void test19276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19276");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("9160:216");
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
    public void test19277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19277");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    }

    @Test
    public void test19278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19278");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef10 = client1.describe_keyspace("0.0.0.0(0.0.0.0)");
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
    public void test19279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19279");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace(":1");
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
    public void test19280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19280");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
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
    public void test19281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19281");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = client1.recv_get_count();
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
    public void test19282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19282");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("hi!(hi!):10");
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
    public void test19283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19283");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer10, columnPath11, 515L, consistencyLevel13);
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
    public void test19284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19284");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("97", 9160);
        cassandraHost2.setCassandraThriftSocketTimeout(48);
    }

    @Test
    public void test19285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19285");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_update_keyspace(ksDef10);
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
    public void test19286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19286");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("209", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("413", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test19287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19287");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((-1L));
        long long2 = atomicLong1.incrementAndGet();
        double double3 = atomicLong1.doubleValue();
        atomicLong1.set(101L);
        boolean boolean8 = atomicLong1.weakCompareAndSet(184L, 124L);
        float float9 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 101.0f + "'", float9 == 101.0f);
    }

    @Test
    public void test19288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19288");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
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
    public void test19289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19289");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):52", (int) (byte) 84);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 193);
    }

    @Test
    public void test19290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19290");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
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
    public void test19291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19291");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count(byteBufferList9, columnParent10, slicePredicate11, consistencyLevel12);
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
    public void test19292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19292");
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
            java.lang.String str10 = client1.system_drop_keyspace("51");
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
    public void test19293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19293");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13, false);
        tSSLTransportParameters30.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19294");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10)(10(0.0.0.10)):406", strArray6, false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test19295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19295");
        java.lang.String[] strArray12 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194:99", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):52", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test19296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19296");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange12 = null;
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList15 = client1.get_paged_slice(":9160:206", keyRange12, byteBuffer13, consistencyLevel14);
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
    public void test19297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19297");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        java.lang.Class<?> wildcardClass5 = cassandraHost2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19298");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 0);
        java.lang.String str2 = atomicLong1.toString();
        boolean boolean5 = atomicLong1.compareAndSet(50L, (long) 100);
        atomicLong1.lazySet(20L);
        double double8 = atomicLong1.doubleValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test19299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19299");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) 35);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 3);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 85);
        java.lang.String str8 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0(0.0.0.0):35" + "'", str8, "0(0.0.0.0):35");
    }

    @Test
    public void test19300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19300");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test19301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19301");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test19302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19302");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client1.recv_system_add_keyspace();
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
    public void test19303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19303");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray12, true);
        tSSLTransportParameters27.setTrustStore("(127.0.0.1)((127.0.0.1)):32", "96(0.0.0.96):54");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test19304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19304");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.truncate("");
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
    public void test19305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19305");
        java.lang.String[] strArray1 = null;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("64", strArray1);
        tSSLTransportParameters2.requireClientAuth(true);
    }

    @Test
    public void test19306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19306");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_system_update_keyspace();
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
    public void test19307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19307");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.describe_partitioner();
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
    public void test19308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19308");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive((int) (byte) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong10 = new java.util.concurrent.atomic.AtomicLong(309L);
        long long12 = atomicLong10.getAndSet((long) (short) 100);
        boolean boolean15 = atomicLong10.weakCompareAndSet(236L, 52L);
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) 236L);
        boolean boolean17 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 309L + "'", long12 == 309L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19309");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice("0.0.0.194", keyRange10, byteBuffer11, consistencyLevel12);
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
    public void test19310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19310");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9261L);
        atomicLong1.set(114L);
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19311");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters20.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test19312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19312");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client2.get_range_slices(columnParent8, slicePredicate9, keyRange10, consistencyLevel11);
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
    public void test19313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19313");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = client1.describe_splits("500", "194:99", "9160(0.0.35.200):216", (-11));
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
    public void test19314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19314");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace(":9160(:9160)");
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
    public void test19315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19315");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:35", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):295", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray15, false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test19316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19316");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", (int) (short) -98);
    }

    @Test
    public void test19317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19317");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 0);
    }

    @Test
    public void test19318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19318");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("CassandraClient<%s-%d>:9160");
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
    public void test19319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19319");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):296");
        cassandraHost1.setLifo(false);
        cassandraHost1.setUseThriftFramedTransport(true);
    }

    @Test
    public void test19320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19320");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str8 = cassandraHost1.getIp();
        boolean boolean9 = cassandraHost1.isPerformNameResolution();
        int int10 = cassandraHost1.getPort();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":9160" + "'", str2, ":9160");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9160 + "'", int4 == 9160);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "127.0.0.1" + "'", str8, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9160 + "'", int10 == 9160);
    }

    @Test
    public void test19321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19321");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (short) 184, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
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
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19322");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
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
    public void test19323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19323");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.add(byteBuffer9, columnParent10, counterColumn11, consistencyLevel12);
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
    public void test19324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19324");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.recv_describe_version();
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
    public void test19325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19325");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long2 = atomicLong0.addAndGet((long) (byte) -1);
        long long4 = atomicLong0.getAndAdd((long) 0);
        long long5 = atomicLong0.get();
        long long6 = atomicLong0.getAndDecrement();
        boolean boolean9 = atomicLong0.weakCompareAndSet(7L, 7L);
        long long10 = atomicLong0.longValue();
        long long11 = atomicLong0.getAndDecrement();
        long long13 = atomicLong0.getAndSet((long) 99);
        int int14 = atomicLong0.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test19326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19326");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        double double4 = atomicLong1.doubleValue();
        long long6 = atomicLong1.getAndAdd(407L);
        long long8 = atomicLong1.getAndAdd(17L);
        double double9 = atomicLong1.doubleValue();
        float float10 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 407L + "'", long8 == 407L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 424.0d + "'", double9 == 424.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 424.0f + "'", float10 == 424.0f);
    }

    @Test
    public void test19327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19327");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test19328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19328");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!(hi!):35" + "'", str5, "hi!(hi!):35");
    }

    @Test
    public void test19329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19329");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef10 = client1.describe_keyspace("504");
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
    public void test19330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19330");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(196L);
        double double2 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 196.0d + "'", double2 == 196.0d);
    }

    @Test
    public void test19331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19331");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_system_drop_keyspace();
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
    public void test19332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19332");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult9 = client1.recv_execute_cql_query();
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
    public void test19333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19333");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList13 = client1.describe_ring("");
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
    public void test19334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19334");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("399");
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
    public void test19335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19335");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray8, true);
        tSSLTransportParameters16.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19336");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getHost();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        int int8 = cassandraHost2.getMaxActive();
        cassandraHost2.setCassandraThriftSocketTimeout(462);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):10" + "'", str5, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
    }

    @Test
    public void test19337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19337");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getMaxActive();
        java.lang.String str7 = cassandraHost1.getHost();
        long long8 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setUseThriftFramedTransport(false);
        java.lang.String str11 = cassandraHost1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":9160" + "'", str2, ":9160");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9160 + "'", int4 == 9160);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(127.0.0.1):9160" + "'", str11, "(127.0.0.1):9160");
    }

    @Test
    public void test19338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19338");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList10 = client2.describe_ring("hi!");
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
    public void test19339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19339");
        java.lang.String[] strArray1 = null;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray1, false);
        tSSLTransportParameters3.setKeyStore(":97", "600", "(127.0.0.1)((127.0.0.1)):35", "25(0.0.0.25):84");
    }

    @Test
    public void test19340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19340");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxWaitTimeWhenExhausted((-3L));
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str8 = cassandraHost1.getIp();
        boolean boolean9 = cassandraHost1.getUseSocketKeepalive();
        java.lang.Class<?> wildcardClass10 = cassandraHost1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0(0.0.0.0):9160" + "'", str2, "0(0.0.0.0):9160");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0.0.0" + "'", str8, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19341");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.Column column11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_insert(byteBuffer9, columnParent10, column11, consistencyLevel12);
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
    public void test19342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19342");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("96(0.0.0.96):54", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19343");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 96);
    }

    @Test
    public void test19344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19344");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("205", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2(-2)", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test19345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19345");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("124", 206);
    }

    @Test
    public void test19346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19346");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace(":1:85");
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
    public void test19347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19347");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList10 = client1.describe_keyspaces();
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
    public void test19348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19348");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.recv_system_update_column_family();
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
    public void test19349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19349");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long2 = atomicLong1.getAndIncrement();
        double double3 = atomicLong1.doubleValue();
        long long4 = atomicLong1.decrementAndGet();
        double double5 = atomicLong1.doubleValue();
        double double6 = atomicLong1.doubleValue();
        long long7 = atomicLong1.getAndIncrement();
        int int8 = atomicLong1.intValue();
        boolean boolean11 = atomicLong1.weakCompareAndSet((long) (short) 2, (long) (short) 405);
        long long12 = atomicLong1.decrementAndGet();
        int int13 = atomicLong1.intValue();
        long long15 = atomicLong1.getAndAdd(124L);
        long long17 = atomicLong1.getAndSet((long) (byte) -2);
        java.lang.String str18 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 124L + "'", long17 == 124L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-2" + "'", str18, "-2");
    }

    @Test
    public void test19350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19350");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_column_family(cfDef10);
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
    public void test19351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19351");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_login(authenticationRequest12);
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
    public void test19352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19352");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.recv_describe_version();
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
    public void test19353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19353");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.system_drop_keyspace("0.0.0.0(0.0.0.0)");
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
    public void test19354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19354");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray13, true);
        tSSLTransportParameters31.setTrustStore("208", "416(0.0.1.160)(416(0.0.1.160))", ":9160(:9160)(:9160(:9160)):50", "112");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19355");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):10", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):0", strArray8, false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19356");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndAdd((long) 'a');
        long long3 = atomicLong0.longValue();
        long long5 = atomicLong0.getAndSet(0L);
        atomicLong0.set(0L);
        atomicLong0.lazySet(238L);
        boolean boolean12 = atomicLong0.compareAndSet(27L, 103L);
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = atomicLong0.getAndAccumulate(2L, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 325L + "'", long2 == 325L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 422L + "'", long3 == 422L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 422L + "'", long5 == 422L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19357");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.describe_version();
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
    public void test19358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19358");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer10, columnPath11, consistencyLevel12);
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
    public void test19359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19359");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap12 = client1.recv_multiget_count();
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
    public void test19360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19360");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.recv_describe_snitch();
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
    public void test19361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19361");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList10 = client1.describe_keyspaces();
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
    public void test19362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19362");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(407L);
        atomicLong1.lazySet(250L);
        atomicLong1.lazySet(498L);
    }

    @Test
    public void test19363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19363");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):48", (int) (short) 206);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 36);
        org.apache.thrift.protocol.TProtocol tProtocol5 = null;
        org.apache.cassandra.thrift.Cassandra.Client client6 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol5);
        org.apache.thrift.protocol.TProtocol tProtocol7 = client6.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client6.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client6.getOutputProtocol();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) client6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = client6.describe_splits("64", "10(0.0.0.10):-1", "0(0.0.0.0)(0(0.0.0.0)):10", (int) (short) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19364");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef11 = client1.recv_describe_keyspace();
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
    public void test19365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19365");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("699");
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
    public void test19366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19366");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 100, (long) '4');
        atomicLong1.set((-2L));
        double double9 = atomicLong1.doubleValue();
        atomicLong1.set(61L);
        double double12 = atomicLong1.doubleValue();
        long long14 = atomicLong1.getAndAdd((long) 48);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.0d) + "'", double9 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 61.0d + "'", double12 == 61.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 61L + "'", long14 == 61L);
    }

    @Test
    public void test19367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19367");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange7 = null;
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice("CassandraClient<%s-%d>:50", keyRange7, byteBuffer8, consistencyLevel9);
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
    public void test19368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19368");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client1.system_drop_column_family("212");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test19369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19369");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client1.get_paged_slice("414", keyRange9, byteBuffer10, consistencyLevel11);
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
    public void test19370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19370");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1L);
        long long3 = atomicLong1.getAndSet((long) (byte) -1);
        boolean boolean6 = atomicLong1.weakCompareAndSet(209L, 298L);
        atomicLong1.set(250L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19371");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 197);
    }

    @Test
    public void test19372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19372");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.describe_version();
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
    public void test19373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19373");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getMaxActive();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test19374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19374");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList8 = client1.recv_describe_ring();
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
    public void test19375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19375");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("416(0.0.1.160)(416(0.0.1.160)):11");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test19376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19376");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test19377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19377");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.KeyRange keyRange13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_range_slices(columnParent11, slicePredicate12, keyRange13, consistencyLevel14);
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
    public void test19378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19378");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult13 = client1.recv_execute_cql_query();
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
    public void test19379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19379");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap5 = client1.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test19380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19380");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):5", 212);
    }

    @Test
    public void test19381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19381");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_batch_mutate();
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
    public void test19382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19382");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(625L);
        long long2 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 625L + "'", long2 == 625L);
    }

    @Test
    public void test19383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19383");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client1.describe_ring("10");
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
    public void test19384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19384");
        java.lang.String[] strArray1 = null;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray1);
        tSSLTransportParameters2.setKeyStore("", "(127.0.0.1):1");
        tSSLTransportParameters2.setKeyStore("(127.0.0.1):295", ":9160(:9160)", "10(0.0.0.10):207", "0(0.0.0.0)(0(0.0.0.0)):100");
    }

    @Test
    public void test19385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19385");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
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
    public void test19386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19386");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd(0L);
        long long5 = atomicLong1.getAndDecrement();
        long long7 = atomicLong1.addAndGet(207L);
        long long8 = atomicLong1.getAndDecrement();
        boolean boolean11 = atomicLong1.compareAndSet(34L, 600L);
        long long12 = atomicLong1.longValue();
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = atomicLong1.getAndAccumulate(557L, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 206L + "'", long7 == 206L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 206L + "'", long8 == 206L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 205L + "'", long12 == 205L);
    }

    @Test
    public void test19387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19387");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("1:52");
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
    public void test19388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19388");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray9, false);
        tSSLTransportParameters18.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", "CassandraClient<%s-%d>:97", "0.0.0.0", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        tSSLTransportParameters18.setKeyStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", "416(0.0.1.160):11");
        tSSLTransportParameters18.setTrustStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):340", "296");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19389");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 97);
        java.lang.String str3 = cassandraHost2.getHost();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":9160" + "'", str3, ":9160");
    }

    @Test
    public void test19390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19390");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndAdd((long) 'a');
        long long4 = atomicLong0.getAndSet((long) (byte) 10);
        double double5 = atomicLong0.doubleValue();
        java.lang.String str6 = atomicLong0.toString();
        long long7 = atomicLong0.getAndIncrement();
        boolean boolean10 = atomicLong0.weakCompareAndSet((long) 101, 302L);
        long long11 = atomicLong0.getAndDecrement();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 240L + "'", long2 == 240L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 337L + "'", long4 == 337L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test19391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19391");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.describe_cluster_name();
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
    public void test19392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19392");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("136", strArray10, true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test19393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19393");
        java.lang.String[] strArray6 = new java.lang.String[] { "6:10", "196", "416" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):52", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray6, false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test19394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19394");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -57);
    }

    @Test
    public void test19395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19395");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) ' ');
    }

    @Test
    public void test19396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19396");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("1:0");
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
    public void test19397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19397");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
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
    public void test19398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19398");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer9, columnPath10, 0L, consistencyLevel12);
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
    public void test19399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19399");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get(byteBuffer11, columnPath12, consistencyLevel13);
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
    public void test19400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19400");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10", 194);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxActive((int) (byte) -66);
        java.lang.String str7 = cassandraHost2.getUrl();
        java.lang.String str8 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!(hi!):194" + "'", str7, "hi!(hi!):194");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!(hi!)" + "'", str8, "hi!(hi!)");
    }

    @Test
    public void test19401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19401");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("293");
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
    public void test19402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19402");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(111L);
        cassandraHost2.setMaxWaitTimeWhenExhausted(3L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "127.0.0.1" + "'", str4, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test19403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19403");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        long long6 = atomicLong1.getAndIncrement();
        short short7 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
    }

    @Test
    public void test19404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19404");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("196:9160");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "196" + "'", str1, "196");
    }

    @Test
    public void test19405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19405");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray13, false);
        tSSLTransportParameters29.setTrustStore("1(0.0.0.1):100", "(127.0.0.1):52", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):52", "1:105");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test19406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19406");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        long long6 = atomicLong1.getAndIncrement();
        int int7 = atomicLong1.intValue();
        long long9 = atomicLong1.getAndSet((long) (short) 5);
        atomicLong1.set(29L);
        long long12 = atomicLong1.incrementAndGet();
        long long14 = atomicLong1.getAndAdd((long) (byte) 104);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 30L + "'", long12 == 30L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 30L + "'", long14 == 30L);
    }

    @Test
    public void test19407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19407");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange13 = null;
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList16 = client1.get_paged_slice("207(0.0.0.207):85", keyRange13, byteBuffer14, consistencyLevel15);
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
    public void test19408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19408");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", (int) (byte) 95);
    }

    @Test
    public void test19409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19409");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("(127.0.0.1):1");
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
    public void test19410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19410");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(395L);
        long long2 = atomicLong1.incrementAndGet();
        long long3 = atomicLong1.getAndIncrement();
        long long5 = atomicLong1.addAndGet((long) 208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 396L + "'", long2 == 396L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 396L + "'", long3 == 396L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 605L + "'", long5 == 605L);
    }

    @Test
    public void test19411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19411");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":49");
        cassandraHost1.setMaxWaitTimeWhenExhausted(211L);
    }

    @Test
    public void test19412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19412");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList12 = client1.get_slice(byteBuffer8, columnParent9, slicePredicate10, consistencyLevel11);
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
    public void test19413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19413");
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
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test19414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19414");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef6 = client2.describe_keyspace(":9160(:9160):50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test19415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19415");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client1.recv_describe_snitch();
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
    public void test19416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19416");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef10 = client1.recv_describe_keyspace();
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
    public void test19417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19417");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("205");
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
    public void test19418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19418");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("8", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602", strArray13, true);
        java.lang.Class<?> wildcardClass31 = tSSLTransportParameters30.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test19419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19419");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.KeyRange keyRange12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_range_slices(columnParent10, slicePredicate11, keyRange12, consistencyLevel13);
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
    public void test19420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19420");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd(0L);
        atomicLong1.set((-1L));
        atomicLong1.lazySet((long) (byte) -1);
        boolean boolean11 = atomicLong1.weakCompareAndSet(201L, 105L);
        long long12 = atomicLong1.decrementAndGet();
        long long14 = atomicLong1.getAndAdd((long) 'a');
        long long16 = atomicLong1.addAndGet(106L);
        short short17 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2L) + "'", long12 == (-2L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 201L + "'", long16 == 201L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 201 + "'", short17 == (short) 201);
    }

    @Test
    public void test19421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19421");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("8", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test19422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19422");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:197", (int) (byte) 12);
    }

    @Test
    public void test19423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19423");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("-4");
    }

    @Test
    public void test19424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19424");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client1.recv_get_paged_slice();
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
    public void test19425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19425");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.194", (int) (byte) 85);
        int int3 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test19426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19426");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 100, (long) '4');
        atomicLong1.set((-2L));
        java.lang.String str9 = atomicLong1.toString();
        long long10 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-2" + "'", str9, "-2");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
    }

    @Test
    public void test19427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19427");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer10, columnPath11, 97L, consistencyLevel13);
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
    public void test19428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19428");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.login(authenticationRequest12);
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
    public void test19429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19429");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange11 = null;
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.get_paged_slice("192", keyRange11, byteBuffer12, consistencyLevel13);
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
    public void test19430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19430");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndAdd((long) 'a');
        long long4 = atomicLong0.getAndSet((long) (byte) 10);
        double double5 = atomicLong0.doubleValue();
        java.lang.String str6 = atomicLong0.toString();
        atomicLong0.lazySet(111L);
        boolean boolean11 = atomicLong0.weakCompareAndSet(651L, 335L);
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 111L + "'", long4 == 111L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19431");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
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
    }

    @Test
    public void test19432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19432");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get(byteBuffer9, columnPath10, consistencyLevel11);
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
    public void test19433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19433");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100");
        java.lang.String str2 = cassandraHost1.getHost();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        org.apache.thrift.protocol.TProtocol tProtocol4 = null;
        org.apache.cassandra.thrift.Cassandra.Client client5 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol4);
        org.apache.thrift.protocol.TProtocol tProtocol6 = client5.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client5.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client5.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client5.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client5.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client5.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client5.getInputProtocol();
        boolean boolean13 = cassandraHost1.equals((java.lang.Object) client5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client5.system_drop_keyspace("0.0.0.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!(hi!)" + "'", str2, "hi!(hi!)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19434");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.recv_system_update_keyspace();
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
    public void test19435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19435");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 194);
        cassandraHost2.setMaxActive((int) (short) 9396);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19436");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef14 = client1.describe_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):3");
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
    public void test19437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19437");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        long long6 = atomicLong1.getAndIncrement();
        int int7 = atomicLong1.intValue();
        long long9 = atomicLong1.getAndSet((long) (short) 5);
        atomicLong1.set(29L);
        atomicLong1.lazySet(651L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test19438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19438");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(108L);
        boolean boolean4 = atomicLong1.compareAndSet(213L, 12L);
        float float5 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 108.0f + "'", float5 == 108.0f);
    }

    @Test
    public void test19439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19439");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(108L);
        atomicLong1.lazySet((long) 97);
        long long4 = atomicLong1.getAndIncrement();
        long long5 = atomicLong1.longValue();
        long long6 = atomicLong1.longValue();
        java.util.function.LongBinaryOperator longBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.accumulateAndGet(597L, longBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 98L + "'", long5 == 98L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
    }

    @Test
    public void test19440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19440");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 399);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str5 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":399" + "'", str5, ":399");
    }

    @Test
    public void test19441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19441");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client2.recv_system_update_keyspace();
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
    public void test19442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19442");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long2 = atomicLong1.getAndIncrement();
        double double3 = atomicLong1.doubleValue();
        long long4 = atomicLong1.decrementAndGet();
        double double5 = atomicLong1.doubleValue();
        double double6 = atomicLong1.doubleValue();
        long long7 = atomicLong1.getAndIncrement();
        int int8 = atomicLong1.intValue();
        boolean boolean11 = atomicLong1.weakCompareAndSet((long) (short) 2, (long) (short) 405);
        long long13 = atomicLong1.addAndGet(514L);
        long long14 = atomicLong1.decrementAndGet();
        long long15 = atomicLong1.longValue();
        long long16 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 515L + "'", long13 == 515L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 514L + "'", long14 == 514L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 514L + "'", long15 == 514L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 513L + "'", long16 == 513L);
    }

    @Test
    public void test19443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19443");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(201L);
        long long3 = atomicLong1.getAndSet(407L);
        long long4 = atomicLong1.getAndDecrement();
        int int5 = atomicLong1.intValue();
        long long7 = atomicLong1.getAndAdd(0L);
        atomicLong1.lazySet(9176L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 201L + "'", long3 == 201L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 407L + "'", long4 == 407L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 406 + "'", int5 == 406);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 406L + "'", long7 == 406L);
    }

    @Test
    public void test19444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19444");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.getAndSet((long) 10);
        atomicLong1.set((long) 1);
        long long8 = atomicLong1.getAndDecrement();
        atomicLong1.lazySet(207L);
        boolean boolean13 = atomicLong1.compareAndSet(194L, 309L);
        float float14 = atomicLong1.floatValue();
        long long16 = atomicLong1.getAndSet(398L);
        atomicLong1.set(101L);
        long long19 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 207.0f + "'", float14 == 207.0f);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 207L + "'", long16 == 207L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
    }

    @Test
    public void test19445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19445");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(500L);
        long long2 = atomicLong1.getAndIncrement();
        long long4 = atomicLong1.getAndSet(399L);
        boolean boolean7 = atomicLong1.weakCompareAndSet(715L, 296L);
        long long8 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 500L + "'", long2 == 500L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 501L + "'", long4 == 501L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 399L + "'", long8 == 399L);
    }

    @Test
    public void test19446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19446");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndAdd((long) 'a');
        atomicLong0.lazySet(196L);
        long long5 = atomicLong0.getAndDecrement();
        org.junit.Assert.assertNotNull(atomicLong0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 111L + "'", long2 == 111L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 196L + "'", long5 == 196L);
    }

    @Test
    public void test19447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19447");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
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
    }

    @Test
    public void test19448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19448");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove_counter(byteBuffer6, columnPath7, consistencyLevel8);
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
    public void test19449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19449");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList6 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test19450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19450");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("412", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):84", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test19451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19451");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -49);
    }

    @Test
    public void test19452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19452");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("25(0.0.0.25):84");
    }

    @Test
    public void test19453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19453");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):100", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("35", strArray19, false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test19454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19454");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 85);
    }

    @Test
    public void test19455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19455");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(105L);
        long long2 = atomicLong1.incrementAndGet();
        double double3 = atomicLong1.doubleValue();
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 106.0d + "'", double3 == 106.0d);
    }

    @Test
    public void test19456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19456");
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
            java.lang.String str8 = client2.recv_describe_cluster_name();
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
    public void test19457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19457");
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
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList9 = client1.recv_describe_keyspaces();
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
    public void test19458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19458");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_cql_version(":9160(:197");
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
    public void test19459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19459");
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
            client2.send_system_drop_column_family("-55");
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
    public void test19460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19460");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.batch_mutate(byteBufferMap11, consistencyLevel12);
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
    public void test19461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19461");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:5", strArray12, true);
        tSSLTransportParameters27.setKeyStore("hi!:-3", "602(0.0.2.90):416");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test19462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19462");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setLifo(true);
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        cassandraHost2.setMaxActive(12);
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19463");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long2 = atomicLong0.getAndSet(199L);
        short short3 = atomicLong0.shortValue();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 196L + "'", long2 == 196L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 199 + "'", short3 == (short) 199);
    }

    @Test
    public void test19464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19464");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList8 = client1.recv_get_indexed_slices();
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
    public void test19465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19465");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("(127.0.0.1):48");
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
    public void test19466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19466");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(450L);
        atomicLong1.lazySet((long) (-56));
    }

    @Test
    public void test19467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19467");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        int int2 = atomicLong1.intValue();
        atomicLong1.lazySet((long) 1);
        long long5 = atomicLong1.getAndDecrement();
        boolean boolean8 = atomicLong1.compareAndSet(3L, 47L);
        float float9 = atomicLong1.floatValue();
        long long10 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test19468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19468");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:32", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207(0.0.0.207):16", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test19469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19469");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef12 = client1.describe_keyspace("194(0.0.0.194):99");
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
    public void test19470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19470");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef5 = client2.describe_keyspace(":9160((:9160():197");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test19471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19471");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("299");
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
    public void test19472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19472");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String str4 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":1:1" + "'", str3, ":1:1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":1(:1):1" + "'", str4, ":1(:1):1");
    }

    @Test
    public void test19473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19473");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("(127.0.0.1)((127.0.0.1)):1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):84", ":9160(:9160):50", (int) (short) 199);
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
    public void test19474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19474");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_keyspace("61(0.0.0.61):201");
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
    public void test19475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19475");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn11 = client1.recv_get();
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
    public void test19476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19476");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("10(0.0.0.10):207");
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
    public void test19477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19477");
        java.lang.String[] strArray9 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("606", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)(0(0.0.0.0))", strArray9, true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19478");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 34);
    }

    @Test
    public void test19479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19479");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(407L);
        boolean boolean4 = atomicLong1.compareAndSet(405L, (long) 1);
        long long6 = atomicLong1.getAndAdd(309L);
        boolean boolean9 = atomicLong1.compareAndSet((long) (byte) 100, 515L);
        long long11 = atomicLong1.getAndAdd(239L);
        long long12 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 407L + "'", long6 == 407L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 716L + "'", long11 == 716L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 955L + "'", long12 == 955L);
    }

    @Test
    public void test19480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19480");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray12, false);
        tSSLTransportParameters18.requireClientAuth(true);
        tSSLTransportParameters18.setKeyStore("195", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "(127.0.0.1):0", "1:52");
        boolean boolean26 = cassandraHost2.equals((java.lang.Object) "195");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test19481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19481");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getOutputProtocol();
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
    public void test19482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19482");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_column_family(cfDef7);
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
    public void test19483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19483");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:-1" + "'", str4, "0:-1");
    }

    @Test
    public void test19484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19484");
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
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.IndexClause indexClause11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_indexed_slices(columnParent10, indexClause11, slicePredicate12, consistencyLevel13);
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
    public void test19485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19485");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("(127.0.0.1):32");
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
    public void test19486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19486");
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
            org.apache.cassandra.thrift.CqlResult cqlResult8 = client1.recv_execute_cql_query();
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
    public void test19487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19487");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.system_drop_keyspace("124");
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
    public void test19488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19488");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange12 = null;
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("1", keyRange12, byteBuffer13, consistencyLevel14);
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
    public void test19489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19489");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef11 = client1.recv_describe_keyspace();
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
    public void test19490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19490");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.getAndDecrement();
        long long2 = atomicLong0.decrementAndGet();
        long long3 = atomicLong0.getAndIncrement();
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong0.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
    }

    @Test
    public void test19491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19491");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        java.lang.String str3 = cassandraHost1.getIp();
        cassandraHost1.setUseSocketKeepalive(true);
        java.lang.String str6 = cassandraHost1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.0" + "'", str3, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0(0.0.0.0):9160" + "'", str6, "0(0.0.0.0):9160");
    }

    @Test
    public void test19492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19492");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long2 = atomicLong1.getAndIncrement();
        double double3 = atomicLong1.doubleValue();
        long long4 = atomicLong1.longValue();
        long long5 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test19493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19493");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd(0L);
        atomicLong1.set((-1L));
        double double7 = atomicLong1.doubleValue();
        long long9 = atomicLong1.addAndGet(207L);
        long long11 = atomicLong1.addAndGet(208L);
        int int12 = atomicLong1.intValue();
        int int13 = atomicLong1.intValue();
        java.lang.String str14 = atomicLong1.toString();
        float float15 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 206L + "'", long9 == 206L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 414L + "'", long11 == 414L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 414 + "'", int12 == 414);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 414 + "'", int13 == 414);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "414" + "'", str14, "414");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 414.0f + "'", float15 == 414.0f);
    }

    @Test
    public void test19494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19494");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        java.lang.String str5 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted(816L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test19495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19495");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_drop_column_family("0(0.0.0.0)(0(0.0.0.0)):9160");
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
    public void test19496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19496");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version(":9160(:9160):50");
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
    public void test19497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19497");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2", (int) (short) 10);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.Object obj5 = null;
        boolean boolean6 = cassandraHost2.equals(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19498");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", (int) (byte) 35);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "416:35" + "'", str4, "416:35");
    }

    @Test
    public void test19499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19499");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult16 = client1.execute_prepared_cql_query(504, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
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
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19500");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(23L);
        long long3 = atomicLong1.getAndSet(214L);
        atomicLong1.set(310L);
        long long7 = atomicLong1.getAndAdd((long) (byte) -49);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23L + "'", long3 == 23L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 310L + "'", long7 == 310L);
    }
}
