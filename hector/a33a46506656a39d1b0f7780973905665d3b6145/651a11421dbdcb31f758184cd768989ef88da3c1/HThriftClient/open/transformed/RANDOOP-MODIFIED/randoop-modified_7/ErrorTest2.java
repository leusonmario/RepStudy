import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 68);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(150L);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost(":0", (int) (short) -1);
        cassandraHost8.setUseThriftFramedTransport(false);
        java.lang.String str11 = cassandraHost8.getName();
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) cassandraHost8);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(97L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) 'a');
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9160", 130);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long6 = atomicLong4.getAndAdd((long) (-2));
        long long7 = atomicLong4.incrementAndGet();
        long long8 = atomicLong4.longValue();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) long8);
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 130);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", (int) (short) 1);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):52", (int) (short) 202);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):35", (int) ' ');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        int int14 = cassandraHost2.getPort();
        int int15 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive(3);
        boolean boolean18 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -57);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str7 = cassandraHost2.getUrl();
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) '#');
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 10);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxFrameSize((int) (byte) 35);
        java.lang.String str10 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        boolean boolean13 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str14 = cassandraHost2.getName();
        java.lang.String str15 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (-2));
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 52);
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):2");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        cassandraHost1.setMaxFrameSize((int) (short) 143);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getMaxFrameSize();
        int int12 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str16 = cassandraHost15.getName();
        int int17 = cassandraHost15.getCassandraThriftSocketTimeout();
        java.lang.String str18 = cassandraHost15.getName();
        cassandraHost15.setMaxActive((int) (short) -2);
        boolean boolean21 = cassandraHost2.equals((java.lang.Object) (short) -2);
        boolean boolean22 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setMaxFrameSize(0);
        java.lang.String str6 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        int int2 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52(0.0.0.52):1", (int) (byte) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) -51);
        cassandraHost2.setCassandraThriftSocketTimeout(171);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getUrl();
        int int4 = cassandraHost2.getMaxFrameSize();
        boolean boolean5 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 35);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 9160);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-1", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getIp();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost7.setUseSocketKeepalive(true);
        cassandraHost7.setCassandraThriftSocketTimeout(0);
        long long12 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        boolean boolean13 = cassandraHost7.getLifo();
        java.lang.String str14 = cassandraHost7.getName();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):100", 110);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", 2147483647);
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        java.lang.String str6 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        java.lang.String str3 = cassandraHost2.getIp();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost6.setLifo(false);
        boolean boolean9 = cassandraHost6.getUseThriftFramedTransport();
        cassandraHost6.setMaxFrameSize((int) (byte) 100);
        boolean boolean12 = cassandraHost6.getUseThriftFramedTransport();
        java.lang.String str13 = cassandraHost6.getName();
        boolean boolean14 = cassandraHost6.getUseSocketKeepalive();
        int int15 = cassandraHost6.getCassandraThriftSocketTimeout();
        java.lang.Class<?> wildcardClass16 = cassandraHost6.getClass();
        boolean boolean17 = cassandraHost2.equals((java.lang.Object) wildcardClass16);
        java.util.concurrent.atomic.AtomicLong atomicLong18 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long20 = atomicLong18.addAndGet(97L);
        long long21 = atomicLong18.incrementAndGet();
        atomicLong18.set(41L);
        boolean boolean24 = cassandraHost2.equals((java.lang.Object) 41L);
        cassandraHost2.setMaxActive((int) (short) 2);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483648", (int) (short) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("32", 100);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxActive((-2147483541));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (byte) 35);
        java.lang.String str3 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):52", (int) (byte) 114);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 34);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        long long3 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        boolean boolean6 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):-1", (int) (byte) 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        cassandraHost2.setLifo(true);
        int int5 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 109);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str10 = cassandraHost2.getHost();
        int int11 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int15 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (short) 130);
        boolean boolean18 = cassandraHost2.getUseSocketKeepalive();
        int int19 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        java.lang.String str10 = cassandraHost2.toString();
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean13 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        long long6 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) 'a');
        java.lang.String str11 = cassandraHost10.toString();
        cassandraHost10.setMaxWaitTimeWhenExhausted((long) 99);
        java.lang.Class<?> wildcardClass14 = cassandraHost10.getClass();
        boolean boolean15 = cassandraHost1.equals((java.lang.Object) wildcardClass14);
        int int16 = cassandraHost1.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        java.lang.String str6 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        cassandraHost2.setMaxFrameSize((int) (byte) 50);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)", (-1));
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean5 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str5 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 2);
        java.lang.String str8 = cassandraHost2.getName();
        boolean boolean9 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        java.lang.String str3 = cassandraHost2.getName();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 130);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9160", 0);
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:35", (-2));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)", 97);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) (short) 35);
        cassandraHost2.setMaxActive(3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):52");
        int int2 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 52);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str7 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 99);
        int int6 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1");
        java.lang.String str2 = cassandraHost1.getName();
        java.lang.String str3 = cassandraHost1.getName();
        cassandraHost1.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) -1);
        cassandraHost2.setMaxWaitTimeWhenExhausted(2147483757L);
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.getUrl();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.getName();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean10 = cassandraHost2.isPerformNameResolution();
        boolean boolean11 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost10.setUseSocketKeepalive(true);
        cassandraHost10.setLifo(false);
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(98L);
        int int18 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) -1);
        int int5 = cassandraHost1.getCassandraThriftSocketTimeout();
        int int6 = cassandraHost1.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("202", (int) (byte) 99);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        java.lang.String str8 = cassandraHost2.getHost();
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str10 = cassandraHost2.getUrl();
        int int11 = cassandraHost2.getMaxActive();
        java.lang.String str12 = cassandraHost2.getIp();
        boolean boolean13 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost2.getUrl();
        int int12 = cassandraHost2.getPort();
        int int13 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0");
        java.lang.String str2 = cassandraHost1.getName();
        java.lang.String str3 = cassandraHost1.getHost();
        cassandraHost1.setLifo(true);
        long long6 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setCassandraThriftSocketTimeout(9160);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 100);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
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
        boolean boolean17 = cassandraHost2.isPerformNameResolution();
        boolean boolean18 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        java.lang.String str10 = cassandraHost2.getHost();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int14 = cassandraHost13.getCassandraThriftSocketTimeout();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) int14);
        int int16 = cassandraHost2.getMaxActive();
        long long17 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 10);
        java.lang.String str6 = cassandraHost2.getUrl();
        boolean boolean7 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (-2));
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (byte) -56);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 2147483647);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(97L);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        int int11 = cassandraHost2.getPort();
        cassandraHost2.setMaxFrameSize((int) (byte) 108);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("128.0.0.108", (-2147483593));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        java.lang.String str10 = cassandraHost2.getHost();
        boolean boolean11 = cassandraHost2.getUseSocketKeepalive();
        long long12 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setMaxActive((int) ' ');
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", 2147483647);
        java.lang.String str3 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) 'a');
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String str6 = cassandraHost2.getIp();
        java.lang.String str7 = cassandraHost2.getUrl();
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (-2));
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxFrameSize((int) (short) 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 53);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (byte) 32);
        java.lang.String str6 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
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
        boolean boolean18 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("136");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.getHost();
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str9 = cassandraHost2.getIp();
        boolean boolean10 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("103");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 50);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean11 = cassandraHost10.isPerformNameResolution();
        boolean boolean12 = cassandraHost10.isPerformNameResolution();
        int int13 = cassandraHost10.getMaxFrameSize();
        java.lang.String str14 = cassandraHost10.getUrl();
        cassandraHost10.setUseThriftFramedTransport(false);
        cassandraHost10.setCassandraThriftSocketTimeout((int) (short) 2);
        boolean boolean19 = cassandraHost2.equals((java.lang.Object) cassandraHost10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (int) (short) -1);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
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
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(2147483647);
        int int18 = cassandraHost2.getMaxActive();
        long long19 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean20 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (int) (short) 0);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getPort();
        java.lang.String str5 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getUrl();
        int int6 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        int int7 = cassandraHost2.getPort();
        java.lang.String str8 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int15 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (short) 130);
        java.lang.String str18 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        cassandraHost1.setUseSocketKeepalive(true);
        java.lang.String str4 = cassandraHost1.getHost();
        cassandraHost1.setLifo(true);
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 'a');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str7 = cassandraHost2.getUrl();
        int int8 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100):9160", (int) (byte) 0);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):0", 69);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 144);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        cassandraHost2.setLifo(true);
        java.lang.String str12 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):9160", (int) (short) 176);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String str5 = cassandraHost2.getUrl();
        java.lang.String str6 = cassandraHost2.getHost();
        boolean boolean7 = cassandraHost2.getLifo();
        boolean boolean8 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0");
        int int2 = cassandraHost1.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        java.lang.String str5 = cassandraHost2.getIp();
        boolean boolean6 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(69);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):58", (int) (short) 201);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("99");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        java.lang.String str3 = cassandraHost2.getUrl();
        int int4 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10", 114);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        boolean boolean22 = cassandraHost13.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost13);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 35);
        java.lang.String str11 = cassandraHost2.toString();
        java.lang.String str12 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99)", (int) (byte) 58);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", 205);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):35", (int) (byte) 100);
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) -2);
        cassandraHost2.setMaxWaitTimeWhenExhausted(148L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        int int7 = cassandraHost2.getMaxActive();
        java.lang.String str8 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive((int) (byte) 10);
        java.lang.String str11 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97", 156);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        java.lang.String str12 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        java.lang.String str10 = cassandraHost2.getHost();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int14 = cassandraHost13.getCassandraThriftSocketTimeout();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) int14);
        cassandraHost2.setMaxActive((int) (short) 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101:54", 112);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted(147L);
        int int6 = cassandraHost2.getMaxActive();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 54);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):0", (int) (short) 2);
        java.lang.String str3 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean23 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("54", (-2147483472));
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) (short) 35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 1);
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 2147483647);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("107", 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9160", 130);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        long long6 = atomicLong4.getAndAdd((long) (-2));
        long long7 = atomicLong4.incrementAndGet();
        long long8 = atomicLong4.longValue();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) long8);
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        boolean boolean13 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0");
        java.lang.String str2 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):0", 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (byte) 52);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        int int7 = cassandraHost2.getMaxActive();
        java.lang.String str8 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive(97);
        int int11 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (short) 1);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) 'a');
        cassandraHost9.setMaxActive((int) (short) 100);
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) cassandraHost9);
        boolean boolean13 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String str14 = cassandraHost9.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2", (int) (short) 201);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 50);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setMaxFrameSize((int) (byte) -1);
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '4');
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean5 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (short) 0);
        cassandraHost2.setCassandraThriftSocketTimeout(32);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100):0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):52", 50);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("102");
        java.lang.String str2 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (byte) 62);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:0", (int) (byte) 54);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) '#');
        int int6 = cassandraHost2.getPort();
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setMaxActive((int) (byte) 0);
        boolean boolean11 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str12 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (int) (short) 0);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost5.setLifo(false);
        boolean boolean8 = cassandraHost5.getUseThriftFramedTransport();
        cassandraHost5.setMaxFrameSize((int) (byte) 100);
        boolean boolean11 = cassandraHost5.getUseThriftFramedTransport();
        java.lang.String str12 = cassandraHost5.getName();
        boolean boolean13 = cassandraHost5.getUseSocketKeepalive();
        cassandraHost5.setUseThriftFramedTransport(false);
        java.lang.String str16 = cassandraHost5.getHost();
        boolean boolean17 = cassandraHost5.getUseThriftFramedTransport();
        boolean boolean18 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        java.lang.String str19 = cassandraHost2.toString();
        int int20 = cassandraHost2.getMaxFrameSize();
        int int21 = cassandraHost2.getMaxFrameSize();
        long long22 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost25 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        java.lang.String str26 = cassandraHost25.getName();
        int int27 = cassandraHost25.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long30 = atomicLong29.longValue();
        int int31 = atomicLong29.intValue();
        boolean boolean32 = cassandraHost25.equals((java.lang.Object) atomicLong29);
        boolean boolean35 = atomicLong29.weakCompareAndSet(69L, 11L);
        boolean boolean36 = cassandraHost2.equals((java.lang.Object) atomicLong29);
        boolean boolean37 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) (short) 35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        int int13 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost2.getUrl();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean11 = cassandraHost2.getLifo();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxActive((int) (short) 3);
        boolean boolean16 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:35", (int) (short) 130);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 32);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost10.setUseSocketKeepalive(true);
        cassandraHost10.setLifo(false);
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(98L);
        java.lang.String str18 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-2", (int) (byte) 109);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (int) (byte) 35);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("11", (int) (short) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        boolean boolean14 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean15 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("98", 171);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        int int13 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 1);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("2:100");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483824", (int) (short) 32);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.lang.String str4 = cassandraHost2.getHost();
        cassandraHost2.setMaxFrameSize((int) ' ');
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 660);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost13);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) '#');
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.3");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (-57));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.toString();
        int int3 = cassandraHost1.getMaxActive();
        cassandraHost1.setMaxFrameSize(15);
        cassandraHost1.setMaxFrameSize((int) (byte) 36);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 99);
        int int6 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxWaitTimeWhenExhausted(337L);
        cassandraHost2.setMaxFrameSize(52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        cassandraHost2.setLifo(true);
        int int5 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 109);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str10 = cassandraHost2.getHost();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101:-2147483472", 54);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getUrl();
        java.lang.String str5 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setLifo(true);
        cassandraHost2.setLifo(true);
        boolean boolean8 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97", (int) (short) 2);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):52", (int) (byte) 2);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)");
        cassandraHost1.setUseThriftFramedTransport(true);
        java.lang.String str4 = cassandraHost1.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10", 15);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(97L);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) (short) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):2147483647");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:52");
        java.lang.String str2 = cassandraHost1.getHost();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
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
        int int18 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):2147483647", 54);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", 69);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("144", (-2147483494));
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        boolean boolean21 = cassandraHost13.getUseSocketKeepalive();
        java.lang.String str22 = cassandraHost13.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost13);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101:-2147483472", 54);
        boolean boolean3 = cassandraHost2.getLifo();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("36", (int) (short) 52);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483802", 100);
        java.lang.String str3 = cassandraHost2.getIp();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("152", (int) (byte) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", (int) (short) 108);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10(:10)", (int) (short) 130);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:10", 0);
        java.lang.String str3 = cassandraHost2.getUrl();
        boolean boolean4 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52", 1);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10");
        cassandraHost1.setCassandraThriftSocketTimeout((-2));
        java.lang.String str4 = cassandraHost1.getHost();
        cassandraHost1.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (-2));
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str7 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:-1", (int) '4');
        cassandraHost2.setMaxActive((int) (byte) 58);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", (int) (short) 130);
        java.lang.String str3 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str6 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-56", (int) (byte) 37);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):2", (-2147483593));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1", (-2147483548));
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) (byte) -56);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost5.setUseThriftFramedTransport(true);
        cassandraHost5.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str10 = cassandraHost5.getUrl();
        long long11 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        cassandraHost5.setUseSocketKeepalive(false);
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0");
        java.lang.String str2 = cassandraHost1.getName();
        java.lang.String str3 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout((-1));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 31);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.getName();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean10 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-1", (int) '#');
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):36");
        java.lang.String str2 = cassandraHost1.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setLifo(false);
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        java.lang.String str10 = cassandraHost7.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483747", (int) (byte) 52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        int int14 = cassandraHost2.getPort();
        int int15 = cassandraHost2.getMaxFrameSize();
        long long16 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int17 = cassandraHost2.getMaxActive();
        java.lang.String str18 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 202);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost5.setUseThriftFramedTransport(true);
        cassandraHost5.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str10 = cassandraHost5.getUrl();
        long long11 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        long long12 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        boolean boolean14 = cassandraHost5.isPerformNameResolution();
        java.lang.String str15 = cassandraHost5.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost5);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):2147483647", (int) 'a');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100)", 54);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        boolean boolean7 = cassandraHost2.getLifo();
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("283");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("42");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:10", (int) (short) 99);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-2", (int) (short) 239);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        java.lang.String str8 = cassandraHost2.getIp();
        java.lang.String str9 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str7 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 0);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 50);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive(32);
        cassandraHost2.setMaxFrameSize((int) (short) 108);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) ' ');
        cassandraHost2.setMaxActive((int) (byte) 52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):0", (int) (short) 32);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
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
        java.lang.String str15 = cassandraHost2.getName();
        java.lang.String str16 = cassandraHost2.getIp();
        int int17 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (-2));
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("86");
        cassandraHost1.setMaxActive(19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):32", (int) (short) 154);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setLifo(false);
        long long7 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        java.lang.String str6 = cassandraHost1.getName();
        cassandraHost1.setMaxFrameSize((int) '4');
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int12 = cassandraHost11.getMaxFrameSize();
        cassandraHost11.setMaxActive((int) '#');
        boolean boolean15 = cassandraHost11.getUseSocketKeepalive();
        boolean boolean16 = cassandraHost1.equals((java.lang.Object) cassandraHost11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100", (int) (short) 0);
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):97", 53);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        boolean boolean14 = cassandraHost2.getLifo();
        boolean boolean15 = cassandraHost2.getLifo();
        java.lang.String str16 = cassandraHost2.getUrl();
        cassandraHost2.setMaxWaitTimeWhenExhausted(159L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 2147483647);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 0);
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) (short) 0);
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("3");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (byte) -57);
        java.lang.String str4 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) '#');
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 10);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxFrameSize((int) (byte) 35);
        java.lang.String str10 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        boolean boolean13 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 'a');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        int int6 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 35);
        cassandraHost2.setMaxFrameSize(196);
        boolean boolean11 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxWaitTimeWhenExhausted(196L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("99");
        java.lang.String str2 = cassandraHost1.getName();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 99);
        boolean boolean6 = cassandraHost1.equals((java.lang.Object) "0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        boolean boolean14 = cassandraHost2.getLifo();
        boolean boolean15 = cassandraHost2.getLifo();
        java.lang.String str16 = cassandraHost2.getUrl();
        cassandraHost2.setMaxActive(102);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getIp();
        int int6 = cassandraHost2.getMaxFrameSize();
        int int7 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.getUrl();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxFrameSize((int) (byte) -51);
        long long13 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
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
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(2147483647);
        boolean boolean18 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str19 = cassandraHost2.getHost();
        int int20 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive(0);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost25 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", (int) (short) 0);
        java.lang.String str26 = cassandraHost25.getHost();
        cassandraHost25.setMaxWaitTimeWhenExhausted((long) (byte) 99);
        int int29 = cassandraHost25.getMaxFrameSize();
        boolean boolean30 = cassandraHost2.equals((java.lang.Object) int29);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
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
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(2147483647);
        boolean boolean18 = cassandraHost2.getUseSocketKeepalive();
        int int19 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        int int3 = cassandraHost1.getPort();
        boolean boolean4 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setUseThriftFramedTransport(true);
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):114");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("60");
        cassandraHost1.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        java.lang.String str14 = cassandraHost2.getIp();
        boolean boolean15 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean16 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", 9160);
        cassandraHost2.setMaxActive(10);
        cassandraHost2.setMaxFrameSize(53);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 0);
        cassandraHost2.setMaxFrameSize((int) (byte) 50);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost2.toString();
        cassandraHost2.setMaxWaitTimeWhenExhausted(110L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        cassandraHost2.setLifo(false);
        int int7 = cassandraHost2.getMaxActive();
        int int8 = cassandraHost2.getPort();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.getName();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -2);
        cassandraHost2.setCassandraThriftSocketTimeout(99);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", 130);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.getName();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean10 = cassandraHost2.isPerformNameResolution();
        java.lang.String str11 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        boolean boolean13 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        boolean boolean14 = cassandraHost2.getLifo();
        int int15 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setLifo(false);
        java.lang.String str5 = cassandraHost2.getUrl();
        int int6 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483756", (int) (byte) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("36");
        cassandraHost1.setMaxFrameSize((-2147483472));
        boolean boolean4 = cassandraHost1.getLifo();
        boolean boolean6 = cassandraHost1.equals((java.lang.Object) "(127.0.0.1)((127.0.0.1)):101");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost2.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float8 = atomicLong7.floatValue();
        int int9 = atomicLong7.intValue();
        boolean boolean12 = atomicLong7.compareAndSet(100L, (long) (byte) -1);
        long long14 = atomicLong7.getAndAdd((long) 10);
        long long16 = atomicLong7.addAndGet(2147483747L);
        long long17 = atomicLong7.getAndDecrement();
        boolean boolean18 = cassandraHost2.equals((java.lang.Object) atomicLong7);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 147);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("50");
        int int2 = cassandraHost1.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("370", 54);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("201", 3);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):35");
        int int2 = cassandraHost1.getMaxFrameSize();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) 1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2", 101);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -93);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:52", (int) (short) 102);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 52);
        cassandraHost2.setCassandraThriftSocketTimeout(100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        cassandraHost1.setUseSocketKeepalive(true);
        boolean boolean4 = cassandraHost1.getLifo();
        java.lang.String str5 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("102:9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxFrameSize(0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxFrameSize();
        int int4 = cassandraHost2.getPort();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 50);
        cassandraHost2.setMaxFrameSize((int) (short) 31);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9160", 0);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 154);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("86");
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong((long) '4');
        long long5 = atomicLong3.getAndSet(109L);
        long long7 = atomicLong3.getAndSet(201L);
        long long8 = atomicLong3.incrementAndGet();
        long long10 = atomicLong3.addAndGet(98L);
        long long11 = atomicLong3.incrementAndGet();
        boolean boolean12 = cassandraHost1.equals((java.lang.Object) long11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):3");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 36);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("100");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-2147483472", 83);
        java.lang.String str3 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(false);
        int int6 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 202);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost5.setUseThriftFramedTransport(true);
        cassandraHost5.setCassandraThriftSocketTimeout((int) (short) 32);
        java.lang.String str10 = cassandraHost5.getUrl();
        long long11 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        long long12 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
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
        boolean boolean21 = cassandraHost2.getUseSocketKeepalive();
        int int22 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost25 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):35", (int) (byte) 35);
        int int26 = cassandraHost25.getPort();
        boolean boolean27 = cassandraHost2.equals((java.lang.Object) cassandraHost25);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.100(0.0.0.100):9160", (int) (byte) -56);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0");
        java.lang.String str2 = cassandraHost1.getName();
        java.lang.String str3 = cassandraHost1.getHost();
        int int4 = cassandraHost1.getMaxActive();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        java.lang.String str2 = cassandraHost1.toString();
        long long3 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        boolean boolean14 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize(10);
        cassandraHost2.setMaxWaitTimeWhenExhausted(112L);
        int int19 = cassandraHost2.getPort();
        cassandraHost2.setMaxFrameSize(130);
        cassandraHost2.setMaxFrameSize(9160);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setMaxFrameSize((int) (short) 114);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):100", (int) (short) 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-2", (int) (short) 97);
        int int3 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", (int) 'a');
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 2);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 35);
        boolean boolean12 = atomicLong9.compareAndSet((long) (short) -2, 100L);
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) atomicLong9);
        java.lang.String str14 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        long long7 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean8 = cassandraHost2.getLifo();
        java.lang.String str9 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 101);
        long long12 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str13 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10(:10):0", (int) (byte) -2);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):114", 130);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100", (-1));
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("155");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", (-1));
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", 36);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", 0);
        cassandraHost2.setMaxFrameSize((int) (short) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        cassandraHost2.setLifo(true);
        int int5 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 109);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost(":10:10", 100);
        cassandraHost11.setMaxWaitTimeWhenExhausted(101L);
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) cassandraHost11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost11);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):35", (int) (short) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean11 = cassandraHost2.getLifo();
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive(32);
        int int15 = cassandraHost2.getMaxFrameSize();
        java.lang.String str16 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 53);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("86", (int) (short) 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1");
        int int2 = cassandraHost1.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:35", (int) (byte) 2);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost5.setLifo(false);
        boolean boolean8 = cassandraHost5.getUseThriftFramedTransport();
        cassandraHost5.setMaxFrameSize((int) (byte) 100);
        boolean boolean11 = cassandraHost5.getUseThriftFramedTransport();
        java.lang.String str12 = cassandraHost5.getName();
        boolean boolean13 = cassandraHost5.getUseSocketKeepalive();
        cassandraHost5.setUseThriftFramedTransport(false);
        java.lang.String str16 = cassandraHost5.getHost();
        java.lang.String str17 = cassandraHost5.getIp();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost20.setUseSocketKeepalive(true);
        cassandraHost20.setCassandraThriftSocketTimeout(0);
        boolean boolean25 = cassandraHost5.equals((java.lang.Object) cassandraHost20);
        int int26 = cassandraHost5.getMaxFrameSize();
        boolean boolean27 = cassandraHost5.getLifo();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost30 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 10);
        boolean boolean31 = cassandraHost5.equals((java.lang.Object) cassandraHost30);
        cassandraHost30.setUseThriftFramedTransport(true);
        java.lang.String str34 = cassandraHost30.toString();
        cassandraHost30.setMaxWaitTimeWhenExhausted((long) (short) 52);
        boolean boolean37 = cassandraHost2.equals((java.lang.Object) cassandraHost30);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("102:9160", 2147483647);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:0", (int) (byte) 99);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):35", (int) (short) 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("53", 156);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        boolean boolean7 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) '#');
        int int6 = cassandraHost2.getPort();
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setMaxActive((int) (byte) 0);
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxActive(0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483824(128.0.0.176):97", (int) (byte) -99);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        boolean boolean6 = cassandraHost1.isPerformNameResolution();
        boolean boolean7 = cassandraHost1.getLifo();
        java.lang.String str8 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52(0.0.0.52):1", (int) (byte) 1);
        cassandraHost2.setMaxActive((int) (short) 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        boolean boolean6 = cassandraHost1.isPerformNameResolution();
        boolean boolean7 = cassandraHost1.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 32);
        java.lang.String str7 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
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
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(2147483647);
        int int18 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        java.lang.String str2 = cassandraHost1.toString();
        long long3 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)", (int) (short) 32);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String str4 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        int int13 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str18 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        cassandraHost2.setLifo(true);
        int int5 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (short) 109);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        int int9 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("137", (int) (short) -2);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 2147483647);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 0);
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) (short) 0);
        int int9 = cassandraHost2.getMaxActive();
        java.lang.String str10 = cassandraHost2.getIp();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("50", (int) (byte) 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setMaxWaitTimeWhenExhausted(1L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("36", 0);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -99);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", (int) (byte) 54);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        boolean boolean15 = atomicLong12.weakCompareAndSet(109L, 102L);
        long long17 = atomicLong12.getAndAdd((long) (short) 9160);
        boolean boolean18 = cassandraHost2.equals((java.lang.Object) (short) 9160);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setMaxWaitTimeWhenExhausted((-1L));
        java.lang.String str4 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52(0.0.0.52):1", (int) (byte) 1);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        int int14 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxFrameSize(3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        int int14 = cassandraHost2.getPort();
        int int15 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) (byte) 58);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        java.lang.String str8 = cassandraHost2.getIp();
        java.lang.String str9 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):2147483647");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):68");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost27 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 10);
        boolean boolean28 = cassandraHost2.equals((java.lang.Object) cassandraHost27);
        cassandraHost27.setUseThriftFramedTransport(true);
        java.lang.String str31 = cassandraHost27.toString();
        cassandraHost27.setMaxWaitTimeWhenExhausted((long) (short) 52);
        java.lang.String str34 = cassandraHost27.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 50);
        java.lang.String str3 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):35", (int) (byte) 35);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):15");
        int int2 = cassandraHost1.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483756", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        boolean boolean9 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '4');
        cassandraHost2.setCassandraThriftSocketTimeout(102);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        java.lang.String str14 = cassandraHost2.getIp();
        boolean boolean15 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str16 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 32);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101:-2147483472", 54);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:0");
        java.lang.String str2 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        java.lang.String str8 = cassandraHost2.getHost();
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str10 = cassandraHost2.getUrl();
        int int11 = cassandraHost2.getMaxActive();
        java.lang.String str12 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("137", (int) (short) -2);
        cassandraHost2.setMaxFrameSize((int) (short) 144);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getUrl();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive(11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 54);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str13 = cassandraHost2.getHost();
        int int14 = cassandraHost2.getPort();
        int int15 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 62);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0:-1");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setUseSocketKeepalive(false);
        int int5 = cassandraHost1.getMaxActive();
        int int6 = cassandraHost1.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("60", (int) (byte) 52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (short) 34);
        cassandraHost2.setMaxFrameSize((int) (byte) -65);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)", 3);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100", (-1));
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxFrameSize(35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
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
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(2147483647);
        boolean boolean18 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("", 2147483647);
        boolean boolean22 = cassandraHost21.isPerformNameResolution();
        int int23 = cassandraHost21.getPort();
        cassandraHost21.setLifo(true);
        boolean boolean26 = cassandraHost2.equals((java.lang.Object) cassandraHost21);
        cassandraHost21.setMaxWaitTimeWhenExhausted(147L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("9160(0.0.35.200):34");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:35", (int) (byte) 41);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("2147483826");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):100", 337);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):201", (int) (short) 176);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        boolean boolean9 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        cassandraHost1.setUseThriftFramedTransport(true);
        int int7 = cassandraHost1.getMaxActive();
        cassandraHost1.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", 54);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101:-2147483472", 111);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 68);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(150L);
        java.lang.String str6 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) ' ');
        boolean boolean14 = cassandraHost2.getLifo();
        boolean boolean15 = cassandraHost2.getLifo();
        java.lang.String str16 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 109);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((-1));
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 101);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setLifo(false);
        java.lang.String str5 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive(205);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1");
        java.lang.String str2 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:99", 111);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("58", (int) (short) 196);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):2", 43);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", (-65));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):9160", (int) (byte) 2);
        java.lang.String str3 = cassandraHost2.getUrl();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 100);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):0");
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) cassandraHost4);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean11 = cassandraHost2.getLifo();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (-1));
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getMaxFrameSize();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 1);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 34);
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        java.lang.String str2 = cassandraHost1.toString();
        cassandraHost1.setUseSocketKeepalive(true);
        cassandraHost1.setUseThriftFramedTransport(false);
        boolean boolean7 = cassandraHost1.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setMaxWaitTimeWhenExhausted((-1L));
        java.lang.String str4 = cassandraHost1.getHost();
        java.lang.String str5 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-2", (int) (short) -57);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 108);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setMaxFrameSize((int) (byte) -1);
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setUseSocketKeepalive(false);
        int int10 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("155", (-2147483543));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 35);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("11", (int) (short) 98);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 163);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive((int) (short) 1);
        java.lang.String str6 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(true);
        int int9 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        cassandraHost1.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getIp();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxFrameSize((int) (byte) 36);
        boolean boolean10 = cassandraHost2.isPerformNameResolution();
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", (-1));
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):36", 114);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", (-1));
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        java.lang.String str10 = cassandraHost2.getHost();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int14 = cassandraHost13.getCassandraThriftSocketTimeout();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) int14);
        int int16 = cassandraHost2.getMaxActive();
        long long17 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str18 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":32", (int) (short) 9160);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setMaxFrameSize((int) (byte) 81);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean11 = cassandraHost2.getLifo();
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 1);
        cassandraHost2.setLifo(true);
        boolean boolean5 = cassandraHost2.getLifo();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxActive(111);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("3");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (byte) -57);
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 68);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10");
        cassandraHost1.setCassandraThriftSocketTimeout((-2));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":35", 337);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):2", (-2147483494));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("52:1", (int) (byte) 32);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
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
        boolean boolean19 = cassandraHost2.getUseSocketKeepalive();
        long long20 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int21 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxActive(0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):10", (int) (short) 277);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100)", 54);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 35);
        java.lang.String str11 = cassandraHost2.toString();
        cassandraHost2.setMaxWaitTimeWhenExhausted(301L);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:0", (int) (byte) 99);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 68);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxWaitTimeWhenExhausted((-1L));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):100");
        boolean boolean3 = cassandraHost1.equals((java.lang.Object) "31");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):2", (int) (byte) -102);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):32", (-2147483472));
        cassandraHost2.setMaxFrameSize((int) (short) 163);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getPort();
        java.lang.String str5 = cassandraHost2.getIp();
        boolean boolean6 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        cassandraHost2.setLifo(false);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float7 = atomicLong6.floatValue();
        int int8 = atomicLong6.intValue();
        boolean boolean11 = atomicLong6.compareAndSet(100L, (long) (byte) -1);
        long long12 = atomicLong6.getAndDecrement();
        long long13 = atomicLong6.incrementAndGet();
        atomicLong6.set(182L);
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) atomicLong6);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1");
        java.lang.String str2 = cassandraHost1.getName();
        java.lang.String str3 = cassandraHost1.getHost();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -1);
        long long6 = atomicLong5.longValue();
        float float7 = atomicLong5.floatValue();
        boolean boolean8 = cassandraHost1.equals((java.lang.Object) atomicLong5);
        boolean boolean9 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:35", (int) 'a');
        cassandraHost2.setMaxActive((int) (short) 154);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("125");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        int int7 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean16 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 1);
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):52", (int) (byte) 2);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2", 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("3");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (byte) -57);
        boolean boolean4 = cassandraHost1.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (int) (byte) 83);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)(0(0.0.0.0)):9160", 283);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -1);
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("102", 66);
        java.lang.String str3 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        boolean boolean9 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '4');
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 2);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100):9160");
        cassandraHost1.setMaxActive(11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        int int5 = cassandraHost2.getMaxFrameSize();
        int int6 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10:10", (int) (short) 99);
        int int3 = cassandraHost2.getMaxActive();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
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
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout(2147483647);
        boolean boolean18 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str19 = cassandraHost2.getHost();
        int int20 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        cassandraHost1.setUseThriftFramedTransport(false);
        int int4 = cassandraHost1.getMaxActive();
        int int5 = cassandraHost1.getPort();
        boolean boolean6 = cassandraHost1.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxFrameSize();
        int int4 = cassandraHost2.getPort();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 50);
        int int7 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setMaxFrameSize(100);
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):2", (int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-2", 101);
        cassandraHost2.setMaxWaitTimeWhenExhausted(68L);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str6 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483824(128.0.0.176):2", (int) (short) 97);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):-1", 97);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (-57));
        int int3 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxFrameSize(10);
        java.lang.String str5 = cassandraHost1.toString();
        cassandraHost1.setCassandraThriftSocketTimeout((-2147483541));
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-2", 2147483647);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", 10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", 0);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.getName();
        java.lang.String str5 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483647", (int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.101");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("37", (-2147483593));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", (-1));
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getUrl();
        boolean boolean5 = cassandraHost2.getLifo();
        boolean boolean6 = cassandraHost2.getLifo();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxFrameSize((int) (byte) 100);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost2.getName();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean11 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive((int) (byte) -93);
        boolean boolean14 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("100(0.0.0.100):9160");
        cassandraHost1.setMaxActive(11);
        cassandraHost1.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("2147483824", 97);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setMaxActive((int) '#');
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1):10");
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):114", (int) (byte) -56);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) (byte) 99);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        int int3 = cassandraHost2.getMaxFrameSize();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 0L);
        cassandraHost2.setMaxFrameSize(35);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        java.lang.String str11 = cassandraHost2.getIp();
        int int12 = cassandraHost2.getMaxActive();
        int int13 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str14 = cassandraHost2.getHost();
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean6 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxActive(9160);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -56);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):3");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 32);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.getAndIncrement();
        long long7 = atomicLong3.getAndAdd((long) '4');
        atomicLong3.set((long) '#');
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) '#');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):97", (int) '4');
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("102", (int) (short) 100);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        cassandraHost2.setLifo(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxFrameSize(68);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("31(0.0.0.31):1", 0);
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 100);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0", 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-2", 32);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }
}

