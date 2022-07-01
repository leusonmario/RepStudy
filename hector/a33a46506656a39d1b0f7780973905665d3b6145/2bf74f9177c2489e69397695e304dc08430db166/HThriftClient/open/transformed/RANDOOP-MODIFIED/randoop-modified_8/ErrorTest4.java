import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 97);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) -3);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray17, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):-40", 303);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters9.setKeyStore("", "CassandraClient<%s-%d>", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:296", (int) (byte) -49);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):52", strArray18, false);
        tSSLTransportParameters40.setKeyStore("194(0.0.0.194):84", "(127.0.0.1)((127.0.0.1)):10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient44 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient44.equals(null)", !hThriftClient44.equals(null));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str8 = cassandraHost2.getUrl();
        cassandraHost2.setMaxWaitTimeWhenExhausted(509L);
        java.lang.String str11 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9(0.0.0.9):9160", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.194", (int) (byte) 85);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        tSSLTransportParameters23.setTrustStore("", "(127.0.0.1):1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1:1", (int) (byte) 97);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong(8L);
        java.lang.String str7 = atomicLong6.toString();
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) str7);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12, true);
        tSSLTransportParameters19.setTrustStore("1(0.0.0.1):-40", ":10(:10):9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", "0.0.0.1(0.0.0.1)(0.0.0.1(0.0.0.1)):84");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 213);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):6");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 402);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setMaxActive((int) (byte) -114);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602(0.0.2.90):416", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160");
        boolean boolean2 = cassandraHost1.getLifo();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515(0.0.2.3):101", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 50);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getHost();
        boolean boolean6 = cassandraHost2.getLifo();
        java.lang.String str7 = cassandraHost2.getHost();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (byte) 85);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:6", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.6", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        boolean boolean3 = cassandraHost1.getLifo();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive((int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):48", (int) (short) 206);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 36);
        java.lang.String str5 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("25", 84);
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("399", (int) (short) 100);
        int int3 = cassandraHost2.getMaxActive();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("97(0.0.0.97):293");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive((int) (short) 96);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted(605L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-60", (int) (byte) 3);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.toString();
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 1);
        cassandraHost2.setMaxActive(414);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str7 = cassandraHost2.getName();
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str11 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean7 = cassandraHost1.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.getLifo();
        boolean boolean9 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):9160", strArray20);
        tSSLTransportParameters30.setKeyStore("(127.0.0.1)((127.0.0.1))", "-56", "CassandraClient<%s-%d>:1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (byte) -40);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray12 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray12, false);
        tSSLTransportParameters18.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("207");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:97", 5);
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        tSSLTransportParameters23.setTrustStore("1", "(127.0.0.1):1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:296", (int) (byte) -49);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":1(:1):-60");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 'a');
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, true);
        tSSLTransportParameters19.setKeyStore(":52", "0.0.0.0", "194:325", "51");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str9 = cassandraHost2.getUrl();
        boolean boolean10 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
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
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray39, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray39);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray39, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray39);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray39);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray39, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray39, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient51 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters50);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient51.equals(null)", !hThriftClient51.equals(null));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        int int8 = cassandraHost2.getMaxActive();
        cassandraHost2.setCassandraThriftSocketTimeout(97);
        cassandraHost2.setLifo(true);
        int int13 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray20 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160(0.0.35.200):216", 36);
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters9.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters9.setTrustStore("", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", ":9160", "");
        tSSLTransportParameters9.setTrustStore("0:9160", "hi!:0");
        tSSLTransportParameters9.setKeyStore("0(0.0.0.0):5", "(127.0.0.1)((127.0.0.1)):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("18", strArray18, true);
        tSSLTransportParameters32.setKeyStore("", "10:-1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setLifo(false);
        boolean boolean5 = cassandraHost1.isPerformNameResolution();
        java.lang.String str6 = cassandraHost1.getIp();
        int int7 = cassandraHost1.getPort();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10):9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):32", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray10);
        tSSLTransportParameters17.setTrustStore("(127.0.0.1)((127.0.0.1)):1", "416(0.0.1.160)(416(0.0.1.160)):11", "hi!(hi!):296", "416");
        tSSLTransportParameters17.setTrustStore("207(0.0.0.207):16", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (byte) 0);
        cassandraHost2.setMaxActive((int) (byte) 33);
        java.lang.String str5 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -50);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout(50);
        java.lang.String str11 = cassandraHost2.getHost();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray20, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (short) 5);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray16, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 98);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)(:9160(:9160)):206", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416(0.0.1.160)", strArray13, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160:1");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters8.setTrustStore("97", ":1");
        tSSLTransportParameters8.requireClientAuth(true);
        tSSLTransportParameters8.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("-2");
        int int2 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("357", (int) (byte) 33);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):9160");
        boolean boolean2 = cassandraHost1.getLifo();
        java.lang.String str3 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("204", (int) (short) 406);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1:85", strArray15, false);
        tSSLTransportParameters21.setTrustStore("9176", "199");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", 406);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str5 = cassandraHost2.getName();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", (int) (byte) 16);
        int int3 = cassandraHost2.getPort();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):9160", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):5", strArray21);
        tSSLTransportParameters45.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient48 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters45);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient48.equals(null)", !hThriftClient48.equals(null));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6", (-2));
        cassandraHost2.setMaxActive((int) (short) 296);
        cassandraHost2.setMaxActive(10);
        java.lang.String str7 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", 599);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str8 = cassandraHost2.getName();
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str8 = cassandraHost2.getUrl();
        cassandraHost2.setMaxWaitTimeWhenExhausted(509L);
        java.lang.String str11 = cassandraHost2.toString();
        java.lang.String str12 = cassandraHost2.getUrl();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)", strArray27, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient47 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient47.equals(null)", !hThriftClient47.equals(null));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":52", 52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("204", (int) (short) 406);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        tSSLTransportParameters22.requireClientAuth(true);
        tSSLTransportParameters22.setKeyStore("6", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", "(127.0.0.1):100", ":9160(:9160):296");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):16");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        tSSLTransportParameters6.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters6.requireClientAuth(false);
        tSSLTransportParameters6.setKeyStore("hi!", "", "", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters6);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-56");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 414);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getMaxActive();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 48);
        int int8 = cassandraHost1.getMaxActive();
        boolean boolean9 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        int int8 = cassandraHost2.getMaxActive();
        boolean boolean9 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str12 = cassandraHost2.getUrl();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):206", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0):50", (int) (byte) 47);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9260", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        cassandraHost1.setCassandraThriftSocketTimeout(50);
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(206);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12);
        tSSLTransportParameters19.setKeyStore("1:6", "hi!(hi!):9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", "hi!(hi!)(hi!(hi!))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        int int4 = cassandraHost1.getMaxActive();
        int int5 = cassandraHost1.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)(0(0.0.0.0)):206", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray18, true);
        tSSLTransportParameters37.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 11);
        cassandraHost2.setMaxWaitTimeWhenExhausted(514L);
        boolean boolean24 = cassandraHost2.equals((java.lang.Object) (byte) 82);
        boolean boolean25 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("815", (int) (short) 102);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray9, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setLifo(true);
        boolean boolean10 = cassandraHost2.isPerformNameResolution();
        boolean boolean11 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-1));
        cassandraHost2.setMaxWaitTimeWhenExhausted(206L);
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, true);
        tSSLTransportParameters19.setKeyStore("9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "0(0.0.0.0):9160", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):369");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12);
        tSSLTransportParameters22.setTrustStore(":9160:296", ":9160(:9160):296", "hi!(hi!):100", "10(0.0.0.10):-1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 69);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray11, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        java.lang.String str5 = cassandraHost2.getHost();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 194);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong(310L);
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) atomicLong9);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 98);
        java.lang.String str13 = cassandraHost2.getIp();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2", strArray24, false);
        boolean boolean35 = cassandraHost2.equals((java.lang.Object) false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (short) 9159);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getPort();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):5", (int) (byte) -116);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9161", (int) (short) 106);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-1));
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):53", strArray19, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) ' ');
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost5.setUseSocketKeepalive(false);
        boolean boolean8 = cassandraHost5.getLifo();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        tSSLTransportParameters13.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean19 = cassandraHost5.equals((java.lang.Object) "hi!");
        int int20 = cassandraHost5.getCassandraThriftSocketTimeout();
        java.lang.Class<?> wildcardClass21 = cassandraHost5.getClass();
        boolean boolean22 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("");
        long long25 = cassandraHost24.getMaxWaitTimeWhenExhausted();
        cassandraHost24.setCassandraThriftSocketTimeout((int) (short) 100);
        java.util.concurrent.atomic.AtomicLong atomicLong29 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float30 = atomicLong29.floatValue();
        double double31 = atomicLong29.doubleValue();
        long long33 = atomicLong29.getAndSet((long) 10);
        double double34 = atomicLong29.doubleValue();
        long long35 = atomicLong29.incrementAndGet();
        java.lang.Class<?> wildcardClass36 = atomicLong29.getClass();
        boolean boolean37 = cassandraHost24.equals((java.lang.Object) wildcardClass36);
        cassandraHost24.setUseThriftFramedTransport(false);
        boolean boolean40 = cassandraHost24.getUseSocketKeepalive();
        boolean boolean41 = cassandraHost5.equals((java.lang.Object) cassandraHost24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost5);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (int) (short) 10);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) -1);
        cassandraHost7.setMaxActive((int) '4');
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        java.lang.String str9 = cassandraHost2.getHost();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 6);
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 54);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1", (int) (byte) -3);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray22, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient49 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters48);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient49.equals(null)", !hThriftClient49.equals(null));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted(84L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":10(:10):9160");
        int int2 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        boolean boolean25 = cassandraHost2.equals((java.lang.Object) "(127.0.0.1)");
        java.lang.String str26 = cassandraHost2.toString();
        int int27 = cassandraHost2.getPort();
        boolean boolean28 = cassandraHost2.getLifo();
        int int29 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray40, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray40, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray40);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray40, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray40, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray40);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray40, false);
        boolean boolean53 = cassandraHost2.equals((java.lang.Object) strArray40);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient56 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient56.equals(null)", !hThriftClient56.equals(null));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) (byte) 0);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        tSSLTransportParameters20.setTrustStore("0", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 69);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100");
        java.lang.String str2 = cassandraHost1.getUrl();
        int int3 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) '4');
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String str4 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-56));
        cassandraHost2.setMaxWaitTimeWhenExhausted((-57L));
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
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
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray51 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray51, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray51, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray51);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray51);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters58 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray51);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters60 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194:99", strArray51, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters62 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):52", strArray51, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient63 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters62);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient63.equals(null)", !hThriftClient63.equals(null));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 48);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.getUrl();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):0", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9260", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        int int4 = cassandraHost2.getPort();
        java.lang.String str5 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("114", (int) (byte) 84);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 123);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float7 = atomicLong6.floatValue();
        double double8 = atomicLong6.doubleValue();
        long long10 = atomicLong6.getAndSet((long) 10);
        atomicLong6.set((long) 1);
        long long14 = atomicLong6.getAndAdd(1L);
        atomicLong6.lazySet((-1L));
        long long17 = atomicLong6.incrementAndGet();
        long long18 = atomicLong6.getAndIncrement();
        boolean boolean21 = atomicLong6.weakCompareAndSet(7L, (long) 597);
        long long22 = atomicLong6.getAndIncrement();
        boolean boolean23 = cassandraHost2.equals((java.lang.Object) atomicLong6);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 500);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (short) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) '4');
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 124);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        java.lang.String str4 = cassandraHost1.getHost();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }
}

