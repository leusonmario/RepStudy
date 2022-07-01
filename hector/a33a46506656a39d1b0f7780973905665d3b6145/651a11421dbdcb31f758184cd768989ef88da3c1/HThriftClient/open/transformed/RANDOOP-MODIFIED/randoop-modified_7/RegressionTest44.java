import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

    public static boolean debug = false;

    @Test
    public void test22001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22001");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("9");
    }

    @Test
    public void test22002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22002");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(112L);
        atomicLong1.set(2147483936L);
    }

    @Test
    public void test22003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22003");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        int int3 = atomicLong0.intValue();
        long long4 = atomicLong0.getAndDecrement();
        java.lang.String str5 = atomicLong0.toString();
        byte byte6 = atomicLong0.byteValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test22004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22004");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    public void test22005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22005");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-2));
        long long2 = atomicLong1.longValue();
        java.lang.String str3 = atomicLong1.toString();
        atomicLong1.set(2147483802L);
        int int6 = atomicLong1.intValue();
        long long7 = atomicLong1.incrementAndGet();
        java.lang.String str8 = atomicLong1.toString();
        float float9 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2" + "'", str3, "-2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483494) + "'", int6 == (-2147483494));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147483803L + "'", long7 == 2147483803L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2147483803" + "'", str8, "2147483803");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.1474839E9f + "'", float9 == 2.1474839E9f);
    }

    @Test
    public void test22006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22006");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(272L);
        float float2 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 272.0f + "'", float2 == 272.0f);
    }

    @Test
    public void test22007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22007");
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
            client2.send_describe_splits("0(0.0.0.0)(0(0.0.0.0)):32", "130(0.0.0.130):293", "179", (int) (short) 9160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22008");
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
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_count(byteBuffer12, columnParent13, slicePredicate14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22009");
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
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):205");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22010");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.getUrl();
        int int5 = cassandraHost2.getMaxActive();
        int int6 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1)):-1" + "'", str3, "(127.0.0.1)((127.0.0.1)):-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):-1" + "'", str4, "(127.0.0.1):-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
    }

    @Test
    public void test22011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22011");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.IndexClause indexClause9 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent8, indexClause9, slicePredicate10, consistencyLevel11);
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
    public void test22012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22012");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 35);
        java.lang.String str11 = cassandraHost2.toString();
        java.lang.String str12 = cassandraHost2.getName();
        cassandraHost2.setMaxActive((int) (short) 62);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean17 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(127.0.0.1):10" + "'", str11, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(127.0.0.1):10" + "'", str12, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22013");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList9 = client2.recv_get_indexed_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22014");
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
        java.util.concurrent.atomic.AtomicLong atomicLong23 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long24 = atomicLong23.longValue();
        boolean boolean27 = atomicLong23.compareAndSet((long) 9160, (long) (byte) 0);
        atomicLong23.set(2L);
        long long30 = atomicLong23.incrementAndGet();
        long long31 = atomicLong23.get();
        boolean boolean32 = cassandraHost2.equals((java.lang.Object) atomicLong23);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test22015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22015");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):52", (int) (byte) 0);
    }

    @Test
    public void test22016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22016");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.system_update_keyspace(ksDef9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22017");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (short) 0);
        cassandraHost2.setCassandraThriftSocketTimeout(32);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) "100:9160");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22018");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
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
    }

    @Test
    public void test22019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22019");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(74L);
        long long2 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 75L + "'", long2 == 75L);
    }

    @Test
    public void test22020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22020");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client1.get_paged_slice("100(0.0.0.100)(100(0.0.0.100))", keyRange9, byteBuffer10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22021");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer4 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath5 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer4, columnPath5, 2147483647L, consistencyLevel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test22022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22022");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        boolean boolean5 = atomicLong0.weakCompareAndSet((long) (short) -1, (long) (short) 10);
        atomicLong0.lazySet((long) 1);
        double double8 = atomicLong0.doubleValue();
        atomicLong0.set((long) 101);
        long long11 = atomicLong0.longValue();
        java.util.function.LongUnaryOperator longUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = atomicLong0.getAndUpdate(longUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 101L + "'", long11 == 101L);
    }

    @Test
    public void test22023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22023");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("3:9160", 103);
        java.lang.String str3 = cassandraHost2.getHost();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3" + "'", str3, "3");
    }

    @Test
    public void test22024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22024");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn15 = client2.get(byteBuffer12, columnPath13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22025");
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
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer10, columnPath11, 2147483698L, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22026");
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
            client2.send_describe_ring("287");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22027");
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
    public void test22028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22028");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 52);
        cassandraHost2.setMaxFrameSize((int) (short) 196);
        cassandraHost2.setMaxFrameSize(50);
    }

    @Test
    public void test22029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22029");
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
            client1.send_describe_splits("13(0.0.0.13):0", "165", ":0", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22030");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 53);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test22031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22031");
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
    public void test22032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22032");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean11 = cassandraHost2.getLifo();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxFrameSize((-2147483440));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22033");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long4 = atomicLong0.getAndSet((long) ' ');
        boolean boolean7 = atomicLong0.weakCompareAndSet(134L, (long) (byte) 62);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22034");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 52);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.getIp();
        cassandraHost2.setMaxActive((int) (byte) -51);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str4, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
    }

    @Test
    public void test22035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22035");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("hi!(hi!):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22036");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList5 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList5, byteBufferArray4);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_prepared_cql_query((int) (short) -106, (java.util.List<java.nio.ByteBuffer>) byteBufferList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22037");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", 0);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483936L);
    }

    @Test
    public void test22038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22038");
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
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_slice(byteBuffer15, columnParent16, slicePredicate17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22039");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    public void test22040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22040");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
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
    public void test22041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22041");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxActive((int) (byte) -78);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test22042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22042");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
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
    public void test22043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22043");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("205");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "205" + "'", str1, "205");
    }

    @Test
    public void test22044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22044");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
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
    }

    @Test
    public void test22045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22045");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("270");
    }

    @Test
    public void test22046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22046");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 156);
    }

    @Test
    public void test22047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22047");
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
    public void test22048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22048");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 66);
        int int2 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test22049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22049");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange6 = null;
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList9 = client1.get_paged_slice("283", keyRange6, byteBuffer7, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22050");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 114);
        java.lang.String str3 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "127.0.0.1" + "'", str3, "127.0.0.1");
    }

    @Test
    public void test22051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22051");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean11 = cassandraHost2.getLifo();
        java.lang.String str12 = cassandraHost2.getIp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "127.0.0.1" + "'", str12, "127.0.0.1");
    }

    @Test
    public void test22052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22052");
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
    public void test22053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22053");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 102);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483750L);
    }

    @Test
    public void test22054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22054");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet((long) 'a');
        boolean boolean7 = atomicLong1.weakCompareAndSet(36L, 169L);
        long long9 = atomicLong1.addAndGet(108L);
        int int10 = atomicLong1.intValue();
        java.util.function.LongBinaryOperator longBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = atomicLong1.accumulateAndGet(375L, longBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 205L + "'", long9 == 205L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 205 + "'", int10 == 205);
    }

    @Test
    public void test22055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22055");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long4 = atomicLong0.getAndSet((long) ' ');
        long long6 = atomicLong0.getAndSet(2147483647L);
        long long8 = atomicLong0.getAndAdd(2147483647L);
        long long9 = atomicLong0.get();
        long long10 = atomicLong0.getAndDecrement();
        long long11 = atomicLong0.incrementAndGet();
        long long13 = atomicLong0.addAndGet(208L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483647L + "'", long8 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4294967294L + "'", long9 == 4294967294L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967294L + "'", long10 == 4294967294L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967294L + "'", long11 == 4294967294L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4294967502L + "'", long13 == 4294967502L);
    }

    @Test
    public void test22056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22056");
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
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test22057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22057");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long6 = atomicLong0.getAndAdd((long) 10);
        float float7 = atomicLong0.floatValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test22058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22058");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) (short) 32);
        java.lang.String str3 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>)" + "'", str3, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
    }

    @Test
    public void test22059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22059");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
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
    public void test22060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22060");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getUrl();
        int int4 = cassandraHost2.getMaxFrameSize();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean6 = cassandraHost2.getLifo();
        int int7 = cassandraHost2.getPort();
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1):1" + "'", str3, "(127.0.0.1):1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test22061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22061");
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
    public void test22062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22062");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("37");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test22063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22063");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getIp();
        java.lang.Class<?> wildcardClass7 = cassandraHost2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1):10" + "'", str3, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):10" + "'", str5, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test22064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22064");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 0);
        long long2 = atomicLong1.longValue();
        boolean boolean5 = atomicLong1.compareAndSet(271L, 0L);
        long long7 = atomicLong1.getAndSet((long) '#');
        java.util.function.LongUnaryOperator longUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.getAndUpdate(longUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test22065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22065");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.recv_get_indexed_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22066");
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
    public void test22067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22067");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(302L);
        long long3 = atomicLong1.getAndSet((long) 101);
        int int4 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 302L + "'", long3 == 302L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test22068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22068");
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
        org.apache.thrift.protocol.TProtocol tProtocol16 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList17 = client1.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(tProtocol16);
    }

    @Test
    public void test22069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22069");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_cql_version("hi!(hi!):50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22070");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange7 = null;
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("107", keyRange7, byteBuffer8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test22071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22071");
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
            java.lang.String str13 = client2.system_drop_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22072");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
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
    public void test22073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22073");
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
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.Column column16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.insert(byteBuffer14, columnParent15, column16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22074");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList5 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList5, byteBufferArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult7 = client1.execute_prepared_cql_query(337, (java.util.List<java.nio.ByteBuffer>) byteBufferList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22075");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(97L);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        int int11 = cassandraHost2.getPort();
        boolean boolean12 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22076");
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
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList10 = client1.get_paged_slice("147(0.0.0.147):9160", keyRange7, byteBuffer8, consistencyLevel9);
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
    public void test22077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22077");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = client2.describe_splits("(127.0.0.1)((127.0.0.1)):9160", "98:171", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 9819);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22078");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        boolean boolean5 = atomicLong0.weakCompareAndSet(0L, (long) (short) 100);
        int int6 = atomicLong0.intValue();
        long long7 = atomicLong0.getAndIncrement();
        long long8 = atomicLong0.incrementAndGet();
        long long9 = atomicLong0.decrementAndGet();
        int int10 = atomicLong0.intValue();
        long long11 = atomicLong0.decrementAndGet();
        long long13 = atomicLong0.getAndSet(2147483705L);
        long long14 = atomicLong0.decrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = atomicLong0.getAndUpdate(longUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2147483704L + "'", long14 == 2147483704L);
    }

    @Test
    public void test22079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22079");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
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
    }

    @Test
    public void test22080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22080");
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
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("287");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22081");
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
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.Compression compression13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer12, compression13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22082");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn7 = client1.recv_get();
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
    public void test22083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22083");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        long long3 = atomicLong1.longValue();
        atomicLong1.set(2147483824L);
        long long7 = atomicLong1.addAndGet(660L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147484484L + "'", long7 == 2147484484L);
    }

    @Test
    public void test22084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22084");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2L);
        long long3 = atomicLong1.getAndAdd(97L);
        atomicLong1.set(52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test22085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22085");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) (-2));
        long long4 = atomicLong1.incrementAndGet();
        long long5 = atomicLong1.decrementAndGet();
        boolean boolean8 = atomicLong1.weakCompareAndSet(2147483747L, 35L);
        atomicLong1.set((long) 'a');
        long long11 = atomicLong1.getAndDecrement();
        long long13 = atomicLong1.getAndSet(334L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 98L + "'", long5 == 98L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 96L + "'", long13 == 96L);
    }

    @Test
    public void test22086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22086");
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
    public void test22087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22087");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.weakCompareAndSet(0L, (long) '4');
        long long8 = atomicLong1.getAndSet((long) 2147483647);
        float float9 = atomicLong1.floatValue();
        java.lang.String str10 = atomicLong1.toString();
        long long11 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.14748365E9f + "'", float9 == 2.14748365E9f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2147483647" + "'", str10, "2147483647");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
    }

    @Test
    public void test22088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22088");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn11 = client2.get(byteBuffer8, columnPath9, consistencyLevel10);
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
    public void test22089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22089");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setLifo(false);
        java.lang.String str5 = cassandraHost2.getUrl();
        java.lang.String str6 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 9160);
        cassandraHost2.setMaxFrameSize((int) (byte) 66);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127.0.0.1:0" + "'", str5, "127.0.0.1:0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1:0" + "'", str6, "127.0.0.1:0");
    }

    @Test
    public void test22090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22090");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        java.lang.String str6 = cassandraHost2.toString();
        java.lang.String str7 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout(114);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1):10" + "'", str6, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):10" + "'", str7, "(127.0.0.1):10");
    }

    @Test
    public void test22091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22091");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.recv_system_drop_column_family();
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
    public void test22092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22092");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setMaxActive((int) ' ');
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>" + "'", str4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" + "'", str5, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test22093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22093");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.recv_describe_cluster_name();
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
    public void test22094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22094");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 64);
        int int2 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test22095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22095");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("54", 37);
        cassandraHost2.setCassandraThriftSocketTimeout((-1));
    }

    @Test
    public void test22096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22096");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("51");
        java.lang.String str2 = cassandraHost1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51(0.0.0.51):9160" + "'", str2, "51(0.0.0.51):9160");
    }

    @Test
    public void test22097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22097");
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
            org.apache.cassandra.thrift.KsDef ksDef10 = client1.describe_keyspace("37(0.0.0.37):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22098");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", (int) '4');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getIp();
        int int5 = cassandraHost2.getMaxFrameSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str4, "(127.0.0.1)((127.0.0.1))");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test22099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22099");
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
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
    }

    @Test
    public void test22100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22100");
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
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_add(byteBuffer14, columnParent15, counterColumn16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22101");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("102:9160");
        cassandraHost1.setMaxFrameSize(170);
    }

    @Test
    public void test22102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22102");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22103");
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
        org.apache.cassandra.thrift.CounterColumn counterColumn17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer15, columnParent16, counterColumn17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22104");
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
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test22105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22105");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client1.system_update_column_family(cfDef14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22106");
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
    public void test22107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22107");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        java.util.function.LongBinaryOperator longBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndAccumulate(3L, longBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test22108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22108");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test22109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22109");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray10 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList11 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList11, byteBufferArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult13 = client2.execute_prepared_cql_query((int) (short) 96, (java.util.List<java.nio.ByteBuffer>) byteBufferList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test22110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22110");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 52);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str4, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
    }

    @Test
    public void test22111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22111");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9113L);
        long long2 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9113L + "'", long2 == 9113L);
    }

    @Test
    public void test22112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22112");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap8 = client1.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22113");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxFrameSize(68);
        cassandraHost2.setUseThriftFramedTransport(true);
    }

    @Test
    public void test22114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22114");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    public void test22115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22115");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 52);
        long long3 = atomicLong1.getAndSet((long) (byte) 36);
        boolean boolean6 = atomicLong1.compareAndSet(0L, 96L);
        long long8 = atomicLong1.getAndAdd(283L);
        float float9 = atomicLong1.floatValue();
        long long10 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36L + "'", long8 == 36L);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 319.0f + "'", float9 == 319.0f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 319L + "'", long10 == 319L);
    }

    @Test
    public void test22116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22116");
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
        org.apache.cassandra.thrift.Compression compression14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer13, compression14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22117");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("3");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (byte) -57);
        java.lang.String str4 = cassandraHost1.getHost();
        int int5 = cassandraHost1.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3" + "'", str4, "3");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test22118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22118");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 2);
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setMaxWaitTimeWhenExhausted(114L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1):2" + "'", str3, "(127.0.0.1):2");
    }

    @Test
    public void test22119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22119");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        atomicLong0.lazySet((-46L));
        long long7 = atomicLong0.getAndDecrement();
        long long9 = atomicLong0.getAndAdd(0L);
        boolean boolean12 = atomicLong0.weakCompareAndSet(2147483755L, 148L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-46L) + "'", long7 == (-46L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-47L) + "'", long9 == (-47L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22120");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef8 = client2.describe_keyspace("299");
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
    public void test22121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22121");
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
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.Compression compression11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer10, compression11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22122");
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
            java.lang.String str13 = client2.system_drop_column_family("9160(0.0.35.200):108");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22123");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client1.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22124");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.compareAndSet(100L, (long) (byte) -1);
        long long8 = atomicLong1.getAndAdd((long) (short) -2);
        long long9 = atomicLong1.getAndIncrement();
        int int10 = atomicLong1.intValue();
        long long12 = atomicLong1.addAndGet((long) 54);
        long long14 = atomicLong1.addAndGet((-2147483508L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 53L + "'", long12 == 53L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2147483455L) + "'", long14 == (-2147483455L));
    }

    @Test
    public void test22125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22125");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):69", (int) (byte) -102);
        int int3 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void test22126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22126");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.getAndIncrement();
        long long4 = atomicLong0.getAndAdd((long) '4');
        atomicLong0.set((long) '#');
        long long7 = atomicLong0.incrementAndGet();
        java.lang.String str8 = atomicLong0.toString();
        atomicLong0.lazySet((long) (short) 3);
        long long12 = atomicLong0.addAndGet((long) 102);
        atomicLong0.set(0L);
        atomicLong0.set(10L);
        java.util.function.LongBinaryOperator longBinaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = atomicLong0.accumulateAndGet(192L, longBinaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "36" + "'", str8, "36");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 105L + "'", long12 == 105L);
    }

    @Test
    public void test22127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22127");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(89L);
        long long2 = atomicLong1.getAndDecrement();
        boolean boolean5 = atomicLong1.compareAndSet((long) (short) 108, 0L);
        long long7 = atomicLong1.addAndGet((long) 114);
        java.util.function.LongBinaryOperator longBinaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = atomicLong1.getAndAccumulate((long) (short) 107, longBinaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 202L + "'", long7 == 202L);
    }

    @Test
    public void test22128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22128");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_keyspace(ksDef9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22129");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        long long3 = atomicLong1.get();
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 35, (long) 10);
        float float7 = atomicLong1.floatValue();
        long long9 = atomicLong1.addAndGet(2147483657L);
        atomicLong1.lazySet(88L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2147483757L + "'", long9 == 2147483757L);
    }

    @Test
    public void test22130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22130");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("0.0.0.152", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):205", "", 25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test22131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22131");
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
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList9 = client2.recv_get_indexed_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22132");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9113L);
        long long2 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9113L + "'", long2 == 9113L);
    }

    @Test
    public void test22133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22133");
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
    public void test22134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22134");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer9, columnParent10, counterColumn11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22135");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("102:9160", keyRange10, byteBuffer11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22136");
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
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer10, columnPath11, (long) (short) 9819, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22137");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client2.get_paged_slice("hi!:52", keyRange10, byteBuffer11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22138");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost32 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str33 = cassandraHost32.getName();
        int int34 = cassandraHost32.getCassandraThriftSocketTimeout();
        java.lang.String str35 = cassandraHost32.toString();
        java.lang.String str36 = cassandraHost32.getIp();
        cassandraHost32.setUseSocketKeepalive(false);
        boolean boolean39 = cassandraHost2.equals((java.lang.Object) false);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(127.0.0.1):10" + "'", str33, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(127.0.0.1):10" + "'", str35, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "127.0.0.1" + "'", str36, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test22139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22139");
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
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList14 = client1.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22140");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList5 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList5, byteBufferArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult7 = client1.execute_prepared_cql_query((int) (short) 175, (java.util.List<java.nio.ByteBuffer>) byteBufferList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22141");
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
    }

    @Test
    public void test22142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22142");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 98);
        long long3 = atomicLong1.getAndAdd((long) (short) -46);
        atomicLong1.lazySet((long) (short) -2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 98L + "'", long3 == 98L);
    }

    @Test
    public void test22143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22143");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.truncate("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):104");
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
    public void test22144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22144");
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
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray15 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList16 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList16, byteBufferArray15);
        org.apache.cassandra.thrift.ColumnParent columnParent18 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate19 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap21 = client1.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList16, columnParent18, slicePredicate19, consistencyLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(byteBufferArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22145");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.Column column14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer12, columnParent13, column14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22146");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):34");
    }

    @Test
    public void test22147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22147");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(243L);
    }

    @Test
    public void test22148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22148");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
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
    public void test22149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22149");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483756L);
        long long2 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483756L + "'", long2 == 2147483756L);
    }

    @Test
    public void test22150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22150");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-1));
        long long3 = atomicLong1.addAndGet(0L);
        long long4 = atomicLong1.get();
        long long6 = atomicLong1.getAndAdd((long) (short) 99);
        long long8 = atomicLong1.addAndGet(466L);
        atomicLong1.lazySet(375L);
        long long12 = atomicLong1.addAndGet((long) (byte) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 564L + "'", long8 == 564L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 407L + "'", long12 == 407L);
    }

    @Test
    public void test22151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22151");
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
            java.lang.String str8 = client2.describe_version();
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
    public void test22152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22152");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long3 = atomicLong1.getAndAdd((long) (-2));
        long long4 = atomicLong1.incrementAndGet();
        long long5 = atomicLong1.decrementAndGet();
        boolean boolean8 = atomicLong1.weakCompareAndSet(2147483747L, 35L);
        long long9 = atomicLong1.longValue();
        java.lang.String str10 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 98L + "'", long5 == 98L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 98L + "'", long9 == 98L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "98" + "'", str10, "98");
    }

    @Test
    public void test22153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22153");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483825L);
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long14 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2147483825L + "'", long14 == 2147483825L);
    }

    @Test
    public void test22154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22154");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        boolean boolean5 = atomicLong0.weakCompareAndSet(0L, (long) (short) 100);
        java.lang.String str6 = atomicLong0.toString();
        boolean boolean9 = atomicLong0.compareAndSet(2147483826L, 59L);
        long long10 = atomicLong0.decrementAndGet();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 99L + "'", long10 == 99L);
    }

    @Test
    public void test22155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22155");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_ring("hi!(hi!)(hi!(hi!)):371");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test22156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22156");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList6 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList6, byteBufferArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult8 = client2.execute_prepared_cql_query((int) (byte) 41, (java.util.List<java.nio.ByteBuffer>) byteBufferList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22157");
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
    public void test22158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22158");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (byte) 50);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("36");
        cassandraHost5.setMaxFrameSize((-2147483472));
        boolean boolean8 = cassandraHost5.getLifo();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22159");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("127.0.0.1:97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test22160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22160");
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
    public void test22161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22161");
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
    public void test22162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22162");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer9, columnPath10, 146L, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22163");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22164");
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
    }

    @Test
    public void test22165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22165");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        long long3 = atomicLong1.get();
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 35, (long) 10);
        boolean boolean9 = atomicLong1.compareAndSet((-2L), 196L);
        boolean boolean12 = atomicLong1.compareAndSet((long) (short) 35, 0L);
        long long13 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test22166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22166");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.get();
        long long4 = atomicLong1.getAndSet((long) 0);
        java.lang.String str5 = atomicLong1.toString();
        long long7 = atomicLong1.addAndGet(108L);
        long long8 = atomicLong1.getAndIncrement();
        long long9 = atomicLong1.getAndIncrement();
        long long10 = atomicLong1.getAndIncrement();
        java.util.function.LongBinaryOperator longBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = atomicLong1.accumulateAndGet(119L, longBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 108L + "'", long7 == 108L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 108L + "'", long8 == 108L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 109L + "'", long9 == 109L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
    }

    @Test
    public void test22167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22167");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("287");
    }

    @Test
    public void test22168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22168");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483747", 103);
    }

    @Test
    public void test22169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22169");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):35", (int) (byte) 35);
        cassandraHost2.setLifo(true);
        cassandraHost2.setLifo(true);
        boolean boolean7 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22170");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl(":32(:32)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":32(" + "'", str1, ":32(");
    }

    @Test
    public void test22171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22171");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("52:1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22172");
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
            java.lang.String str12 = client1.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22173");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        double double2 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test22174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22174");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-2));
        long long2 = atomicLong1.longValue();
        java.lang.String str3 = atomicLong1.toString();
        atomicLong1.set(2147483802L);
        long long6 = atomicLong1.incrementAndGet();
        boolean boolean9 = atomicLong1.compareAndSet(327L, (long) (-1));
        atomicLong1.lazySet((long) (short) 191);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2" + "'", str3, "-2");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2147483803L + "'", long6 == 2147483803L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22175");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
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
    public void test22176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22176");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 175);
    }

    @Test
    public void test22177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22177");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult7 = client1.recv_prepare_cql_query();
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
    public void test22178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22178");
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
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test22179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22179");
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
        java.nio.ByteBuffer[] byteBufferArray16 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList17 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList17, byteBufferArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult19 = client2.execute_prepared_cql_query((int) (short) -3, (java.util.List<java.nio.ByteBuffer>) byteBufferList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test22180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22180");
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
            java.util.List<java.lang.String> strList12 = client1.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22181");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (int) (short) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(69L);
        float float5 = atomicLong4.floatValue();
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        long long7 = atomicLong4.get();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 69.0f + "'", float5 == 69.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 69L + "'", long7 == 69L);
    }

    @Test
    public void test22182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22182");
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
    public void test22183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22183");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer6 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer6, columnPath7, (long) 327, consistencyLevel9);
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
    public void test22184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22184");
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
    public void test22185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22185");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 19);
    }

    @Test
    public void test22186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22186");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52(0.0.0.52)(52(0.0.0.52)):-2", (-2147483548));
    }

    @Test
    public void test22187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22187");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):2147483647", 210);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test22188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22188");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 32);
        long long3 = atomicLong1.getAndSet((long) 102);
        long long5 = atomicLong1.getAndAdd(32L);
        java.util.function.LongBinaryOperator longBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.getAndAccumulate((long) (short) 84, longBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 102L + "'", long5 == 102L);
    }

    @Test
    public void test22189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22189");
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
        org.apache.cassandra.thrift.KsDef ksDef14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_keyspace(ksDef14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22190");
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
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.IndexClause indexClause16 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_indexed_slices(columnParent15, indexClause16, slicePredicate17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22191");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 178);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test22192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22192");
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
    public void test22193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22193");
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
            java.util.List<java.lang.String> strList15 = client1.describe_splits("13", "250", "0:-2", (int) (byte) 114);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22194");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("2147483707");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test22195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22195");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        long long2 = atomicLong1.incrementAndGet();
        float float3 = atomicLong1.floatValue();
        long long4 = atomicLong1.get();
        java.lang.String str5 = atomicLong1.toString();
        long long7 = atomicLong1.addAndGet(2147483649L);
        long long8 = atomicLong1.longValue();
        long long9 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "101" + "'", str5, "101");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147483750L + "'", long7 == 2147483750L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483750L + "'", long8 == 2147483750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2147483750L + "'", long9 == 2147483750L);
    }

    @Test
    public void test22196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22196");
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
        boolean boolean23 = cassandraHost17.getLifo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "127.0.0.1" + "'", str14, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test22197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22197");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.addAndGet(2L);
        java.lang.String str5 = atomicLong1.toString();
        long long6 = atomicLong1.getAndDecrement();
        boolean boolean9 = atomicLong1.weakCompareAndSet((long) 19, (-2L));
        long long10 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test22198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22198");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:97", (int) (short) 104);
    }

    @Test
    public void test22199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22199");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("128.0.0.108");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "128.0.0.108" + "'", str1, "128.0.0.108");
    }

    @Test
    public void test22200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22200");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_batch_mutate(byteBufferMap11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22201");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":0(:0):-1");
        java.lang.String str2 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) -106);
        long long5 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":0(:0)" + "'", str2, ":0(:0)");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test22202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22202");
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
        boolean boolean20 = cassandraHost2.getLifo();
        java.lang.String str21 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int25 = cassandraHost24.getMaxFrameSize();
        cassandraHost24.setMaxActive((int) '#');
        boolean boolean28 = cassandraHost24.getUseSocketKeepalive();
        boolean boolean29 = cassandraHost24.getUseThriftFramedTransport();
        boolean boolean30 = cassandraHost2.equals((java.lang.Object) cassandraHost24);
        java.lang.String str31 = cassandraHost2.toString();
        cassandraHost2.setMaxFrameSize((-65));
        cassandraHost2.setUseThriftFramedTransport(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(127.0.0.1):10" + "'", str13, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":10" + "'", str21, ":10");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(127.0.0.1):10" + "'", str31, "(127.0.0.1):10");
    }

    @Test
    public void test22203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22203");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
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
    }

    @Test
    public void test22204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22204");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 2147483647);
        boolean boolean4 = atomicLong1.compareAndSet((long) '#', (long) (byte) -1);
        long long6 = atomicLong1.getAndAdd(2147483647L);
        atomicLong1.set((long) (short) 196);
        long long9 = atomicLong1.getAndDecrement();
        long long11 = atomicLong1.addAndGet(159L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2147483647L + "'", long6 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 196L + "'", long9 == 196L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 354L + "'", long11 == 354L);
    }

    @Test
    public void test22205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22205");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22206");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483699", (int) (short) 51);
    }

    @Test
    public void test22207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22207");
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
        org.apache.cassandra.thrift.ColumnPath columnPath16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get(byteBuffer15, columnPath16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22208");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
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
    }

    @Test
    public void test22209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22209");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):9160", (int) (short) -42);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test22210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22210");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 0);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String str5 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)" + "'", str4, "(127.0.0.1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1)((127.0.0.1)):0" + "'", str5, "(127.0.0.1)((127.0.0.1)):0");
    }

    @Test
    public void test22211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22211");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult8 = client2.recv_execute_cql_query();
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
    public void test22212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22212");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList10 = client1.recv_get_indexed_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22213");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 10);
        long long2 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test22214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22214");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
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
    public void test22215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22215");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (byte) -51);
        java.lang.String str3 = cassandraHost2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0(0.0.0.0):-51" + "'", str3, "0(0.0.0.0):-51");
    }

    @Test
    public void test22216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22216");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
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
    public void test22217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22217");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        java.lang.String str3 = atomicLong1.toString();
        boolean boolean6 = atomicLong1.compareAndSet((long) (byte) 35, (long) (-1));
        boolean boolean9 = atomicLong1.weakCompareAndSet(102L, (long) (short) 0);
        float float10 = atomicLong1.floatValue();
        atomicLong1.lazySet(201L);
        boolean boolean15 = atomicLong1.compareAndSet((long) (short) 9160, (-1L));
        int int16 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 201 + "'", int16 == 201);
    }

    @Test
    public void test22218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22218");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 2);
        byte byte2 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
    }

    @Test
    public void test22219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22219");
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
        org.apache.thrift.protocol.TProtocol tProtocol16 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer17 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent18 = null;
        org.apache.cassandra.thrift.Column column19 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.insert(byteBuffer17, columnParent18, column19, consistencyLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(tProtocol16);
    }

    @Test
    public void test22220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22220");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
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
    public void test22221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22221");
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
    }

    @Test
    public void test22222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22222");
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
        org.apache.thrift.protocol.TProtocol tProtocol16 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
        org.junit.Assert.assertNull(tProtocol16);
    }

    @Test
    public void test22223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22223");
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
        java.util.List<java.nio.ByteBuffer> byteBufferList12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap16 = client2.multiget_count(byteBufferList12, columnParent13, slicePredicate14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22224");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange8 = null;
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("287", keyRange8, byteBuffer9, consistencyLevel10);
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
    public void test22225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22225");
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
            java.lang.String str11 = client2.system_add_keyspace(ksDef10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22226");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        boolean boolean5 = atomicLong1.weakCompareAndSet(2147483707L, 2147483657L);
        boolean boolean8 = atomicLong1.weakCompareAndSet((long) 155, 2147483705L);
        java.util.function.LongUnaryOperator longUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = atomicLong1.updateAndGet(longUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22227");
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
    }

    @Test
    public void test22228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22228");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("102(0.0.0.102)(102(0.0.0.102)):52", (int) (byte) 62);
    }

    @Test
    public void test22229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22229");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef12 = client2.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22230");
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
    }

    @Test
    public void test22231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22231");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits(":10(:10):100", "0.0.0.101", "(127.0.0.1)((127.0.0.1)):0", 34);
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
    public void test22232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22232");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
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
    }

    @Test
    public void test22233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22233");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_keyspace("52(0.0.0.52)(52(0.0.0.52))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22234");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList6 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap10 = client2.multiget_count(byteBufferList6, columnParent7, slicePredicate8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test22235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22235");
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
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test22236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22236");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        int int5 = cassandraHost2.getMaxFrameSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test22237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22237");
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
            java.util.List<java.lang.String> strList15 = client2.describe_splits("48", "0.0.0.3", "2147483824(128.0.0.176)(2147483824(128.0.0.176)):0", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22238");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
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
    }

    @Test
    public void test22239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22239");
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
            org.apache.cassandra.thrift.KsDef ksDef14 = client1.describe_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):68");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22240");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        java.lang.String str8 = cassandraHost2.getIp();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("0", (-2));
        boolean boolean12 = cassandraHost11.getUseSocketKeepalive();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) boolean12);
        long long14 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):10" + "'", str7, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "127.0.0.1" + "'", str8, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test22241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22241");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", 0);
        cassandraHost2.setMaxFrameSize(100);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test22242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22242");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String str6 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127.0.0.1" + "'", str5, "127.0.0.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1):10" + "'", str6, "(127.0.0.1):10");
    }

    @Test
    public void test22243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22243");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        int int13 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22244");
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
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList8 = client2.recv_get_indexed_slices();
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
    public void test22245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22245");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setMaxFrameSize((int) (byte) -1);
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 51);
        java.lang.String str10 = cassandraHost1.getName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127.0.0.1" + "'", str5, "127.0.0.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "127.0.0.1(127.0.0.1):9160" + "'", str10, "127.0.0.1(127.0.0.1):9160");
    }

    @Test
    public void test22246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22246");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        boolean boolean5 = atomicLong1.compareAndSet((long) (short) -1, (long) 100);
        long long6 = atomicLong1.decrementAndGet();
        int int7 = atomicLong1.intValue();
        long long9 = atomicLong1.getAndSet(148L);
        boolean boolean12 = atomicLong1.weakCompareAndSet(97L, 144L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22247");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long5 = atomicLong0.decrementAndGet();
        long long7 = atomicLong0.getAndAdd((long) (byte) 0);
        long long8 = atomicLong0.get();
        long long9 = atomicLong0.decrementAndGet();
        long long11 = atomicLong0.getAndSet(2147483883L);
        short short12 = atomicLong0.shortValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 235 + "'", short12 == (short) 235);
    }

    @Test
    public void test22248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22248");
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
            client2.set_keyspace("0(0.0.0.0)(0(0.0.0.0)):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22249");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("370", (int) (short) 198);
    }

    @Test
    public void test22250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22250");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483936L);
    }

    @Test
    public void test22251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22251");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("2147483831");
    }

    @Test
    public void test22252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22252");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.recv_describe_partitioner();
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
    public void test22253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22253");
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
            org.apache.cassandra.thrift.CqlResult cqlResult11 = client1.recv_execute_prepared_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22254");
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
        java.nio.ByteBuffer[] byteBufferArray12 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList13 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList13, byteBufferArray12);
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap18 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList13, columnParent15, slicePredicate16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22255");
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
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test22256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22256");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.KeyRange keyRange16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList18 = client1.get_range_slices(columnParent14, slicePredicate15, keyRange16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22257");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("37(0.0.0.37):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test22258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22258");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10");
        int int2 = cassandraHost1.getPort();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test22259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22259");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client2.execute_prepared_cql_query(53, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22260");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
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
    public void test22261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22261");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 9160);
        atomicLong1.set(2147483756L);
        long long4 = atomicLong1.longValue();
        long long5 = atomicLong1.getAndIncrement();
        long long6 = atomicLong1.incrementAndGet();
        java.lang.String str7 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2147483756L + "'", long4 == 2147483756L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2147483756L + "'", long5 == 2147483756L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2147483758L + "'", long6 == 2147483758L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2147483758" + "'", str7, "2147483758");
    }

    @Test
    public void test22262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22262");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.getAndDecrement();
        long long5 = atomicLong0.getAndSet((long) (byte) 98);
        double double6 = atomicLong0.doubleValue();
        atomicLong0.lazySet(22L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.0d + "'", double6 == 98.0d);
    }

    @Test
    public void test22263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22263");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        boolean boolean9 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '4');
        cassandraHost2.setUseSocketKeepalive(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):10" + "'", str7, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test22264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22264");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 130);
        long long3 = atomicLong1.getAndAdd(100L);
        long long4 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 130L + "'", long3 == 130L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 229L + "'", long4 == 229L);
    }

    @Test
    public void test22265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22265");
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
            client1.send_describe_splits("4294967307", "127.0.0.1:0", "107(0.0.0.107):-46", (int) (byte) -19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22266");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setLifo(false);
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22267");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        long long2 = atomicLong1.incrementAndGet();
        float float3 = atomicLong1.floatValue();
        java.lang.String str4 = atomicLong1.toString();
        long long5 = atomicLong1.longValue();
        long long7 = atomicLong1.addAndGet(99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "101" + "'", str4, "101");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 200L + "'", long7 == 200L);
    }

    @Test
    public void test22268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22268");
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
            client2.send_get_indexed_slices(columnParent14, indexClause15, slicePredicate16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22269");
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
    public void test22270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22270");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", 2147483647);
        cassandraHost13.setMaxActive(35);
        cassandraHost13.setMaxWaitTimeWhenExhausted((long) (byte) 10);
        boolean boolean18 = cassandraHost2.equals((java.lang.Object) cassandraHost13);
        cassandraHost13.setMaxWaitTimeWhenExhausted((long) 68);
        boolean boolean21 = cassandraHost13.isPerformNameResolution();
        int int22 = cassandraHost13.getMaxFrameSize();
        cassandraHost13.setMaxWaitTimeWhenExhausted(302L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(127.0.0.1):10" + "'", str10, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test22271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22271");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = client1.describe_splits("147(0.0.0.147):9160", "36:0", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):52", (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22272");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (short) 10);
        cassandraHost2.setLifo(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str6 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1:10" + "'", str6, "127.0.0.1:10");
    }

    @Test
    public void test22273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22273");
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
        boolean boolean17 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean18 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(127.0.0.1):10" + "'", str13, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test22274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22274");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setLifo(false);
        java.lang.String str5 = cassandraHost2.getUrl();
        cassandraHost2.setUseThriftFramedTransport(true);
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean9 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str10 = cassandraHost2.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127.0.0.1:0" + "'", str5, "127.0.0.1:0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "127.0.0.1:0" + "'", str10, "127.0.0.1:0");
    }

    @Test
    public void test22275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22275");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", (int) (byte) -57);
        cassandraHost2.setUseThriftFramedTransport(true);
    }

    @Test
    public void test22276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22276");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) -1);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483757L);
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.toString();
        cassandraHost2.setMaxActive((int) (byte) 95);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):-1" + "'", str7, "(127.0.0.1):-1");
    }

    @Test
    public void test22277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22277");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        atomicLong1.lazySet(271L);
        boolean boolean6 = atomicLong1.weakCompareAndSet((long) (byte) -56, 2L);
        long long8 = atomicLong1.addAndGet((long) (-2147483494));
        long long10 = atomicLong1.addAndGet(271L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2147483223L) + "'", long8 == (-2147483223L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2147482952L) + "'", long10 == (-2147482952L));
    }

    @Test
    public void test22278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22278");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):0", 69);
        java.lang.Class<?> wildcardClass3 = cassandraHost2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test22279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22279");
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
            java.lang.String str12 = client1.system_drop_column_family(":19");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22280");
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
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test22281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22281");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test22282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22282");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        float float1 = atomicLong0.floatValue();
        boolean boolean4 = atomicLong0.weakCompareAndSet(100L, 97L);
        long long5 = atomicLong0.get();
        byte byte6 = atomicLong0.byteValue();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 139.0f + "'", float1 == 139.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 139L + "'", long5 == 139L);
// flaky:         org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -117 + "'", byte6 == (byte) -117);
    }

    @Test
    public void test22283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22283");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        long long2 = atomicLong1.incrementAndGet();
        long long4 = atomicLong1.addAndGet((long) 10);
        long long5 = atomicLong1.incrementAndGet();
        long long6 = atomicLong1.getAndIncrement();
        java.lang.String str7 = atomicLong1.toString();
        atomicLong1.lazySet(143L);
        java.util.function.LongUnaryOperator longUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = atomicLong1.getAndUpdate(longUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 111L + "'", long4 == 111L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 112L + "'", long5 == 112L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 112L + "'", long6 == 112L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "113" + "'", str7, "113");
    }

    @Test
    public void test22284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22284");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = client1.recv_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22285");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(144L);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) 112, (long) (byte) 108);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22286");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.Column column11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.insert(byteBuffer9, columnParent10, column11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22287");
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
    public void test22288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22288");
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
        java.nio.ByteBuffer[] byteBufferArray14 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList15 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList15, byteBufferArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult17 = client2.execute_prepared_cql_query((int) (byte) 51, (java.util.List<java.nio.ByteBuffer>) byteBufferList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22289");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22290");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        long long2 = atomicLong1.getAndDecrement();
        long long4 = atomicLong1.getAndSet((long) (short) 3);
        long long5 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
    }

    @Test
    public void test22291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22291");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(54L);
        long long3 = atomicLong1.addAndGet((long) (short) 277);
        long long4 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 331L + "'", long3 == 331L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 330L + "'", long4 == 330L);
    }

    @Test
    public void test22292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22292");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(302L);
        long long3 = atomicLong1.getAndSet((long) 101);
        atomicLong1.set((long) (-2147483446));
        long long6 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 302L + "'", long3 == 302L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2147483446L) + "'", long6 == (-2147483446L));
    }

    @Test
    public void test22293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22293");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef7 = client1.describe_keyspace(":10:10");
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
    public void test22294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22294");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap15 = client2.multiget_slice(byteBufferList11, columnParent12, slicePredicate13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22295");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int9 = cassandraHost2.getMaxActive();
        int int10 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
    }

    @Test
    public void test22296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22296");
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
    public void test22297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22297");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxFrameSize(2147483647);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22298");
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
            java.lang.String str13 = client2.system_drop_keyspace("100(0.0.0.100)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22299");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.Compression compression15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer14, compression15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22300");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setCassandraThriftSocketTimeout(100);
        java.lang.String str14 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":10" + "'", str14, ":10");
    }

    @Test
    public void test22301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22301");
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
            client2.send_system_drop_keyspace("128.0.0.108(128.0.0.108):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22302");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9160L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(210L, (long) 101);
        byte byte5 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -56 + "'", byte5 == (byte) -56);
    }

    @Test
    public void test22303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22303");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):68");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22304");
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
            client2.send_set_cql_version("130");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22305");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = client1.recv_system_update_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test22306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22306");
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
            client2.send_describe_keyspace("127.0.0.1(127.0.0.1):50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22307");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("13", (-2147483440));
    }

    @Test
    public void test22308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22308");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:10");
    }

    @Test
    public void test22309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22309");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("169", (-2147483536));
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22310");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef13 = client1.describe_keyspace(":0(:0)(:0(:0)):99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22311");
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
            client1.truncate("1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22312");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("0:15");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test22313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22313");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent6 = null;
        org.apache.cassandra.thrift.IndexClause indexClause7 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList10 = client2.get_indexed_slices(columnParent6, indexClause7, slicePredicate8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test22314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22314");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList12 = client2.describe_ring("35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22315");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet((long) 'a');
        long long6 = atomicLong1.getAndSet(1L);
        long long7 = atomicLong1.incrementAndGet();
        long long8 = atomicLong1.incrementAndGet();
        long long10 = atomicLong1.getAndAdd((long) (short) 3);
        float float11 = atomicLong1.floatValue();
        java.util.function.LongBinaryOperator longBinaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = atomicLong1.getAndAccumulate(73L, longBinaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 6.0f + "'", float11 == 6.0f);
    }

    @Test
    public void test22316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22316");
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
            client2.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22317");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(4294967318L);
        boolean boolean4 = atomicLong1.compareAndSet((long) (-2), 84L);
        byte byte5 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 22 + "'", byte5 == (byte) 22);
    }

    @Test
    public void test22318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22318");
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
            client1.send_describe_ring("2(0.0.0.2):101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22319");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)", (int) (short) 3);
        cassandraHost2.setMaxActive((-2147483448));
    }

    @Test
    public void test22320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22320");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long2 = atomicLong1.incrementAndGet();
        long long3 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test22321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22321");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long4 = atomicLong0.getAndSet((long) ' ');
        long long6 = atomicLong0.getAndSet(2147483647L);
        long long8 = atomicLong0.getAndAdd(2147483647L);
        long long9 = atomicLong0.get();
        long long11 = atomicLong0.getAndSet(9160L);
        boolean boolean14 = atomicLong0.weakCompareAndSet((long) (short) 196, 466L);
        atomicLong0.set(51L);
        java.lang.Class<?> wildcardClass17 = atomicLong0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483647L + "'", long8 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4294967294L + "'", long9 == 4294967294L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967294L + "'", long11 == 4294967294L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test22322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22322");
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
            client1.set_keyspace("96");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22323");
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
    public void test22324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22324");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet((long) 'a');
        long long6 = atomicLong1.getAndSet(1L);
        long long7 = atomicLong1.longValue();
        long long9 = atomicLong1.getAndAdd(2147483708L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test22325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22325");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        double double2 = atomicLong1.doubleValue();
        int int3 = atomicLong1.intValue();
        boolean boolean6 = atomicLong1.weakCompareAndSet(0L, (long) 35);
        long long7 = atomicLong1.get();
        long long8 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test22326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22326");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99", 32);
        cassandraHost2.setUseSocketKeepalive(true);
    }

    @Test
    public void test22327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22327");
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
    public void test22328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22328");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22329");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 143);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) (short) 9819, (long) (byte) -117);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22330");
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
            org.apache.cassandra.thrift.KsDef ksDef12 = client2.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22331");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100)(100(0.0.0.100)):102", 2);
    }

    @Test
    public void test22332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22332");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):34");
    }

    @Test
    public void test22333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22333");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483783L);
    }

    @Test
    public void test22334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22334");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):0", (int) (short) 32);
        java.lang.String str3 = cassandraHost2.getUrl();
        cassandraHost2.setMaxWaitTimeWhenExhausted(68L);
        int int6 = cassandraHost2.getPort();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong(169L);
        long long9 = atomicLong8.incrementAndGet();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) long9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "127.0.0.1(127.0.0.1):32" + "'", str3, "127.0.0.1(127.0.0.1):32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 170L + "'", long9 == 170L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22335");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("196", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):2", "2147483824(128.0.0.176):97", 466);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22336");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("4294967292");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22337");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("99(0.0.0.99)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22338");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
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
    public void test22339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22339");
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
            client2.send_describe_keyspace("287");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22340");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = client1.system_add_column_family(cfDef3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test22341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22341");
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
            java.lang.String str8 = client2.describe_version();
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
    public void test22342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22342");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_add(byteBuffer15, columnParent16, counterColumn17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22343");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("69", (int) (byte) -3);
        java.lang.String str3 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "69(0.0.0.69):-3" + "'", str3, "69(0.0.0.69):-3");
    }

    @Test
    public void test22344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22344");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483824(128.0.0.176):97", (int) (short) 31);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str5 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2147483824(128.0.0.176)" + "'", str5, "2147483824(128.0.0.176)");
    }

    @Test
    public void test22345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22345");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100)", 371);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22346");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) '4');
        long long3 = atomicLong1.getAndSet(109L);
        long long5 = atomicLong1.getAndSet(201L);
        long long6 = atomicLong1.incrementAndGet();
        long long8 = atomicLong1.addAndGet(98L);
        atomicLong1.lazySet(2L);
        int int11 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 109L + "'", long5 == 109L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 202L + "'", long6 == 202L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300L + "'", long8 == 300L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test22347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22347");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
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
    public void test22348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22348");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 35);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 9160);
        cassandraHost2.setUseSocketKeepalive(true);
    }

    @Test
    public void test22349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22349");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):114", 50);
    }

    @Test
    public void test22350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22350");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(115L);
        byte byte2 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 115 + "'", byte2 == (byte) 115);
    }

    @Test
    public void test22351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22351");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("154", "287", "52(0.0.0.52)(52(0.0.0.52)):62", (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test22352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22352");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.longValue();
        long long3 = atomicLong0.getAndAdd(62L);
        long long4 = atomicLong0.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 61L + "'", long4 == 61L);
    }

    @Test
    public void test22353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22353");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        long long4 = atomicLong1.get();
        java.lang.String str5 = atomicLong1.toString();
        int int6 = atomicLong1.intValue();
        long long7 = atomicLong1.longValue();
        boolean boolean10 = atomicLong1.compareAndSet(271L, (long) (-1));
        boolean boolean13 = atomicLong1.weakCompareAndSet(18L, 2147483825L);
        java.lang.String str14 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test22354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22354");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        double double2 = atomicLong0.doubleValue();
        long long3 = atomicLong0.get();
        long long4 = atomicLong0.get();
        long long5 = atomicLong0.decrementAndGet();
        boolean boolean8 = atomicLong0.compareAndSet((long) 2147483647, 0L);
        long long9 = atomicLong0.getAndDecrement();
        long long11 = atomicLong0.getAndAdd(2147483705L);
        int int12 = atomicLong0.intValue();
        long long13 = atomicLong0.incrementAndGet();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2L) + "'", long11 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483593) + "'", int12 == (-2147483593));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2147483704L + "'", long13 == 2147483704L);
    }

    @Test
    public void test22355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22355");
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
            client1.send_system_update_column_family(cfDef12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22356");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult10 = client1.execute_prepared_cql_query((int) (short) 32, (java.util.List<java.nio.ByteBuffer>) byteBufferList8);
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
    public void test22357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22357");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
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
    public void test22358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22358");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.Compression compression10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer9, compression10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22359");
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
            client1.send_truncate("103");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22360");
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
            client1.send_describe_keyspace("100(0.0.0.100):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22361");
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
            client2.send_set_cql_version("2147483831");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22362");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(113L);
        float float2 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 113.0f + "'", float2 == 113.0f);
    }

    @Test
    public void test22363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22363");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList5 = client1.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22364");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
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
    public void test22365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22365");
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
    public void test22366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22366");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
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
    }

    @Test
    public void test22367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22367");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn6 = client1.recv_get();
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
    public void test22368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22368");
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
    public void test22369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22369");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("52:1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22370");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):69");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22371");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        atomicLong1.lazySet((long) (-1));
        float float4 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test22372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22372");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 62);
    }

    @Test
    public void test22373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22373");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.152", (int) (byte) 10);
    }

    @Test
    public void test22374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22374");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client2.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22375");
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
            client1.send_describe_keyspace("32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22376");
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
            client1.send_describe_ring("96");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22377");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.get();
        atomicLong1.set((long) 2147483647);
        double double5 = atomicLong1.doubleValue();
        boolean boolean8 = atomicLong1.compareAndSet(18L, (long) (byte) -57);
        long long9 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.147483647E9d + "'", double5 == 2.147483647E9d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2147483647L + "'", long9 == 2147483647L);
    }

    @Test
    public void test22378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22378");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange15 = null;
        java.nio.ByteBuffer byteBuffer16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList18 = client1.get_paged_slice("102(0.0.0.102):99", keyRange15, byteBuffer16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22379");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest7);
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
    public void test22380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22380");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2", 101);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2(0.0.0.2):101" + "'", str3, "2(0.0.0.2):101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2(0.0.0.2):101" + "'", str4, "2(0.0.0.2):101");
    }

    @Test
    public void test22381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22381");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_add(byteBuffer8, columnParent9, counterColumn10, consistencyLevel11);
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
    public void test22382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22382");
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
            client1.send_set_keyspace(":10(:10)(:10(:10)):99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22383");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.decrementAndGet();
        double double3 = atomicLong1.doubleValue();
        float float4 = atomicLong1.floatValue();
        double double5 = atomicLong1.doubleValue();
        float float6 = atomicLong1.floatValue();
        boolean boolean9 = atomicLong1.compareAndSet((long) (byte) 114, 104L);
        boolean boolean12 = atomicLong1.weakCompareAndSet(34L, 0L);
        float float13 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 99.0f + "'", float13 == 99.0f);
    }

    @Test
    public void test22384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22384");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
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
    public void test22385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22385");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):2147483647", 97);
        java.lang.String str3 = cassandraHost2.getHost();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str3, "(127.0.0.1)((127.0.0.1))");
    }

    @Test
    public void test22386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22386");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22387");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -65);
        long long2 = atomicLong1.incrementAndGet();
        long long3 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-63L) + "'", long3 == (-63L));
    }

    @Test
    public void test22388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22388");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
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
    public void test22389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22389");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((-63L));
    }

    @Test
    public void test22390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22390");
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
    public void test22391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22391");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate10 = null;
        org.apache.cassandra.thrift.KeyRange keyRange11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList13 = client1.get_range_slices(columnParent9, slicePredicate10, keyRange11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22392");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(402L);
        long long3 = atomicLong1.getAndSet(43L);
        long long4 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 402L + "'", long3 == 402L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 44L + "'", long4 == 44L);
    }

    @Test
    public void test22393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22393");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client1.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22394");
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
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer15, columnParent16, counterColumn17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22395");
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
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test22396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22396");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long1 = atomicLong0.getAndDecrement();
        int int2 = atomicLong0.intValue();
        long long3 = atomicLong0.longValue();
        java.lang.String str4 = atomicLong0.toString();
        int int5 = atomicLong0.intValue();
        org.junit.Assert.assertNotNull(atomicLong0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 147L + "'", long1 == 147L);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146 + "'", int2 == 146);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 146L + "'", long3 == 146L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "146" + "'", str4, "146");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 146 + "'", int5 == 146);
    }

    @Test
    public void test22397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22397");
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
        java.nio.ByteBuffer[] byteBufferArray12 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList13 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList13, byteBufferArray12);
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap18 = client2.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList13, columnParent15, slicePredicate16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22398");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (-2147483543));
        long long2 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2147483543L) + "'", long2 == (-2147483543L));
    }

    @Test
    public void test22399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22399");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("130(0.0.0.130):293");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 293 + "'", int1 == 293);
    }

    @Test
    public void test22400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22400");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.describe_version();
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
    public void test22401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22401");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.longValue();
        long long2 = atomicLong0.getAndDecrement();
        long long3 = atomicLong0.getAndDecrement();
        long long4 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
    }

    @Test
    public void test22402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22402");
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
        java.nio.ByteBuffer[] byteBufferArray15 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList16 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList16, byteBufferArray15);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (byte) -57, (java.util.List<java.nio.ByteBuffer>) byteBufferList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(byteBufferArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22403");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(36L);
        long long3 = atomicLong1.addAndGet((long) 0);
        long long4 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36L + "'", long3 == 36L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 36L + "'", long4 == 36L);
    }

    @Test
    public void test22404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22404");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("2147483748");
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
    public void test22405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22405");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList7 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList7, byteBufferArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult9 = client1.execute_prepared_cql_query((int) (short) -1, (java.util.List<java.nio.ByteBuffer>) byteBufferList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNotNull(byteBufferArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22406");
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
    }

    @Test
    public void test22407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22407");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        int int3 = atomicLong1.intValue();
        double double4 = atomicLong1.doubleValue();
        boolean boolean7 = atomicLong1.weakCompareAndSet(284L, (long) (-57));
        atomicLong1.set((long) (byte) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22408");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        long long3 = atomicLong0.getAndIncrement();
        float float4 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndDecrement();
        float float6 = atomicLong0.floatValue();
        boolean boolean9 = atomicLong0.compareAndSet(2147483708L, 269L);
        double double10 = atomicLong0.doubleValue();
        double double11 = atomicLong0.doubleValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test22409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22409");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.add(byteBuffer9, columnParent10, counterColumn11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22410");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 100);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str10 = cassandraHost2.getIp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str4, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str5, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))" + "'", str10, "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
    }

    @Test
    public void test22411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22411");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("103(0.0.0.103):-3", 6);
    }

    @Test
    public void test22412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22412");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101:-2147483472", (int) (byte) 52);
    }

    @Test
    public void test22413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22413");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 2147483647);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) (short) 109, 69L);
        java.lang.Class<?> wildcardClass5 = atomicLong1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22414");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (-2147483536));
        java.lang.Class<?> wildcardClass3 = cassandraHost2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test22415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22415");
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
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test22416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22416");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483701L);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxActive(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22417");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
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
    public void test22418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22418");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.longValue();
        long long4 = atomicLong1.getAndSet((long) 'a');
        long long6 = atomicLong1.getAndSet(1L);
        long long7 = atomicLong1.incrementAndGet();
        long long9 = atomicLong1.getAndSet(53L);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = atomicLong1.accumulateAndGet(150L, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void test22419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22419");
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
            java.lang.String str12 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22420");
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
            client1.send_describe_ring("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):68");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22421");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
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
    public void test22422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22422");
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
        org.apache.cassandra.thrift.KeyRange keyRange15 = null;
        java.nio.ByteBuffer byteBuffer16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice("", keyRange15, byteBuffer16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22423");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_drop_keyspace("127.0.0.1:9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22424");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
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
    public void test22425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22425");
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
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList13 = client2.recv_describe_ring();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22426");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test22427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22427");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive(32);
        java.lang.String str11 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1):10" + "'", str7, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":10" + "'", str11, ":10");
    }

    @Test
    public void test22428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22428");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str15 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(127.0.0.1):10" + "'", str15, "(127.0.0.1):10");
    }

    @Test
    public void test22429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22429");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52(0.0.0.52):1", (int) (byte) 1);
        cassandraHost2.setLifo(true);
        int int5 = cassandraHost2.getPort();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22430");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) -1);
        cassandraHost2.setLifo(false);
    }

    @Test
    public void test22431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22431");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '4');
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String str6 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!(hi!):52" + "'", str6, "hi!(hi!):52");
    }

    @Test
    public void test22432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22432");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_describe_version();
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
    public void test22433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22433");
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
        org.apache.thrift.protocol.TProtocol tProtocol16 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef18 = client1.describe_keyspace("(127.0.0.1)((127.0.0.1)):35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(tProtocol16);
    }

    @Test
    public void test22434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22434");
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
            org.apache.cassandra.thrift.CqlResult cqlResult16 = client2.execute_prepared_cql_query((int) (byte) -56, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22435");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(204L);
        long long2 = atomicLong1.getAndDecrement();
        atomicLong1.set((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 204L + "'", long2 == 204L);
    }

    @Test
    public void test22436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22436");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer12, columnPath13, (long) (short) 175, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22437");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-2147483472", 35);
    }

    @Test
    public void test22438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22438");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test22439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22439");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("370");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "370" + "'", str1, "370");
    }

    @Test
    public void test22440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22440");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.truncate("36");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22441");
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
            client2.send_set_cql_version("(127.0.0.1):3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22442");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList7 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList7, byteBufferArray6);
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap12 = client1.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList7, columnParent9, slicePredicate10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNotNull(byteBufferArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22443");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
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
    public void test22444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22444");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:-1", (-2147483593));
    }

    @Test
    public void test22445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22445");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (-2));
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.getLifo();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1))" + "'", str3, "(127.0.0.1)((127.0.0.1))");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22446");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
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
    public void test22447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22447");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.Column column10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer8, columnParent9, column10, consistencyLevel11);
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
    public void test22448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22448");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
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
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test22449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22449");
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
            java.lang.String str8 = client2.recv_describe_version();
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
    public void test22450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22450");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_column_family(cfDef7);
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
    public void test22451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22451");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("0");
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
    public void test22452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22452");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean11 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean12 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str13 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):10" + "'", str9, "(127.0.0.1):10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":10" + "'", str13, ":10");
    }

    @Test
    public void test22453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22453");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):35", (int) (short) 62);
        java.lang.String str3 = cassandraHost2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0(0.0.0.0)(0(0.0.0.0))(0(0.0.0.0)(0(0.0.0.0))):62" + "'", str3, "0(0.0.0.0)(0(0.0.0.0))(0(0.0.0.0)(0(0.0.0.0))):62");
    }

    @Test
    public void test22454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22454");
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
            client2.send_set_keyspace("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):101");
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
    public void test22455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22455");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.1.114");
    }

    @Test
    public void test22456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22456");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":10(:10)(:10(:10)):99");
    }

    @Test
    public void test22457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22457");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.getAndIncrement();
        long long4 = atomicLong0.getAndSet(101L);
        long long6 = atomicLong0.addAndGet((long) 10);
        long long7 = atomicLong0.getAndIncrement();
        double double8 = atomicLong0.doubleValue();
        atomicLong0.set(19L);
        atomicLong0.lazySet((long) 196);
        boolean boolean15 = atomicLong0.weakCompareAndSet(96L, (long) 147);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 111L + "'", long6 == 111L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 112.0d + "'", double8 == 112.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22458");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 196);
        int int2 = atomicLong1.intValue();
        float float3 = atomicLong1.floatValue();
        long long4 = atomicLong1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 196 + "'", int2 == 196);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 196.0f + "'", float3 == 196.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 196L + "'", long4 == 196L);
    }

    @Test
    public void test22459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22459");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22460");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_range_slices(columnParent8, slicePredicate9, keyRange10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22461");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
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
    public void test22462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22462");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        long long3 = atomicLong1.getAndSet(102L);
        boolean boolean6 = atomicLong1.compareAndSet(8L, 205L);
        java.util.function.LongBinaryOperator longBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = atomicLong1.getAndAccumulate(119L, longBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22463");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("69", (int) ' ');
        int int3 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test22464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22464");
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
    public void test22465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22465");
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
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = client1.recv_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22466");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client1.get_range_slices(columnParent8, slicePredicate9, keyRange10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22467");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        java.lang.String str3 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(false);
        int int6 = cassandraHost2.getPort();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long10 = atomicLong8.addAndGet((long) 101);
        long long11 = atomicLong8.getAndDecrement();
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) atomicLong8);
        java.util.concurrent.atomic.AtomicLong atomicLong14 = new java.util.concurrent.atomic.AtomicLong(2147483657L);
        long long15 = atomicLong14.getAndDecrement();
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) atomicLong14);
        long long18 = atomicLong14.addAndGet(171L);
        long long20 = atomicLong14.addAndGet((long) 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1)):-1" + "'", str3, "(127.0.0.1)((127.0.0.1)):-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 102L + "'", long11 == 102L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2147483657L + "'", long15 == 2147483657L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2147483827L + "'", long18 == 2147483827L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483923L + "'", long20 == 2147483923L);
    }

    @Test
    public void test22468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22468");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str5 = cassandraHost2.getName();
        java.lang.String str6 = cassandraHost2.getHost();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 66);
        cassandraHost2.setMaxActive((int) (byte) 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(127.0.0.1):10" + "'", str5, "(127.0.0.1):10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test22469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22469");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 0);
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
    }

    @Test
    public void test22470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22470");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test22471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22471");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        int int2 = atomicLong1.intValue();
        long long3 = atomicLong1.get();
        long long5 = atomicLong1.getAndAdd(0L);
        long long6 = atomicLong1.getAndDecrement();
        long long8 = atomicLong1.addAndGet(10L);
        java.lang.String str9 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 109L + "'", long8 == 109L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "109" + "'", str9, "109");
    }

    @Test
    public void test22472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22472");
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
            client1.send_system_drop_keyspace(":10(:10):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22473");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -57);
        boolean boolean4 = atomicLong1.compareAndSet((long) '4', (long) 103);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22474");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        float float3 = atomicLong1.floatValue();
        long long5 = atomicLong1.addAndGet(101L);
        long long7 = atomicLong1.getAndAdd((long) 2147483647);
        long long9 = atomicLong1.getAndSet((long) (byte) 52);
        atomicLong1.lazySet(62L);
        long long12 = atomicLong1.decrementAndGet();
        long long13 = atomicLong1.getAndIncrement();
        long long15 = atomicLong1.getAndSet(239L);
        double double16 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 101L + "'", long7 == 101L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2147483748L + "'", long9 == 2147483748L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 61L + "'", long12 == 61L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 61L + "'", long13 == 61L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 62L + "'", long15 == 62L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 239.0d + "'", double16 == 239.0d);
    }

    @Test
    public void test22475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22475");
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
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.Compression compression14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_prepare_cql_query(byteBuffer13, compression14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22476");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("86", (int) (short) 201);
    }

    @Test
    public void test22477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22477");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("(127.0.0.1):178");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22478");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":-1", (int) (short) 69);
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String str4 = cassandraHost2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":-1" + "'", str3, ":-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":-1(:-1):69" + "'", str4, ":-1(:-1):69");
    }

    @Test
    public void test22479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22479");
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
        org.apache.thrift.protocol.TProtocol tProtocol15 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = client1.describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22480");
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
        org.apache.thrift.protocol.TProtocol tProtocol11 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList12 = client1.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22481");
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
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.IndexClause indexClause15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent14, indexClause15, slicePredicate16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22482");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getName();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)((127.0.0.1)):1" + "'", str3, "(127.0.0.1)((127.0.0.1)):1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22483");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483883L);
        boolean boolean4 = atomicLong1.compareAndSet(4294967295L, 143L);
        long long5 = atomicLong1.getAndIncrement();
        atomicLong1.set(301L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2147483883L + "'", long5 == 2147483883L);
    }

    @Test
    public void test22484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22484");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):36");
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
    public void test22485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22485");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 32);
        long long3 = atomicLong1.getAndSet((long) 102);
        atomicLong1.set(35L);
        boolean boolean8 = atomicLong1.compareAndSet(2147483839L, (-2147483593L));
        java.util.function.LongBinaryOperator longBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = atomicLong1.accumulateAndGet((long) (byte) -42, longBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22486");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long2 = atomicLong1.getAndDecrement();
        long long3 = atomicLong1.get();
        int int4 = atomicLong1.intValue();
        boolean boolean7 = atomicLong1.weakCompareAndSet(2147483904L, 89L);
        float float8 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
    }

    @Test
    public void test22487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22487");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client2.recv_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test22488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22488");
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
            java.lang.String str10 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22489");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.getAndIncrement();
        boolean boolean5 = atomicLong0.weakCompareAndSet(0L, 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22490");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getPort();
        boolean boolean3 = cassandraHost1.getLifo();
        cassandraHost1.setUseSocketKeepalive(true);
        boolean boolean6 = cassandraHost1.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9160 + "'", int2 == 9160);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test22491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22491");
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
            client1.set_cql_version("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22492");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
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
    public void test22493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22493");
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
        org.apache.thrift.protocol.TProtocol tProtocol13 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client1.recv_system_update_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22494");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", 37);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test22495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22495");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client1.get_paged_slice("0.0.0.1(0.0.0.1):3", keyRange9, byteBuffer10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test22496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22496");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client1.recv_system_drop_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test22497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22497");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        long long3 = atomicLong1.getAndSet(172L);
        byte byte4 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -84 + "'", byte4 == (byte) -84);
    }

    @Test
    public void test22498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22498");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        boolean boolean5 = atomicLong0.weakCompareAndSet(0L, (long) (short) 100);
        int int6 = atomicLong0.intValue();
        long long7 = atomicLong0.getAndIncrement();
        long long8 = atomicLong0.incrementAndGet();
        long long9 = atomicLong0.incrementAndGet();
        long long10 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 103L + "'", long9 == 103L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 103L + "'", long10 == 103L);
    }

    @Test
    public void test22499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22499");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):2", 50);
    }

    @Test
    public void test22500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22500");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(2147483778L);
    }
}
